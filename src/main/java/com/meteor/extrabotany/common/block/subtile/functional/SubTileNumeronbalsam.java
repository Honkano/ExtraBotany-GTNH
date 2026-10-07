package com.meteor.extrabotany.common.block.subtile.functional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFire;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import com.meteor.extrabotany.common.lexicon.LexiconModData;

import cpw.mods.fml.relauncher.ReflectionHelper;
import vazkii.botania.api.lexicon.LexiconEntry;
import vazkii.botania.api.subtile.RadiusDescriptor;
import vazkii.botania.api.subtile.SubTileFunctional;
import vazkii.botania.common.Botania;

public class SubTileNumeronbalsam extends SubTileFunctional {

    private static final int RANGE = 11;
    private static final int DELAY = 5;

    @Override
    public int getColor() {
        return 0x0FA5757;
    }

    @Override
    public LexiconEntry getEntry() {
        return LexiconModData.numeronbalsam;
    }

    @Override
    public void onUpdate() {
        super.onUpdate();

        // 防御 1：supertile 未就绪时直接返回
        if (supertile == null) return;

        World world = supertile.getWorldObj();
        // 防御 2：世界未加载时直接返回
        if (world == null) return;

        if (redstoneSignal > 0) return;

        if (mana > 0) {
            List<EntityPlayer> players = world.getEntitiesWithinAABB(
                EntityPlayer.class,
                AxisAlignedBB.getBoundingBox(
                    supertile.xCoord - RANGE,
                    supertile.yCoord - RANGE,
                    supertile.zCoord - RANGE,
                    supertile.xCoord + RANGE + 1,
                    supertile.yCoord + RANGE + 1,
                    supertile.zCoord + RANGE + 1));

            // 防御 3：返回的列表理论非 null，但仍判空
            if (players != null) {
                for (EntityPlayer player : players) {
                    // 防御 4：列表里可能出现 null 元素
                    if (player == null) continue;

                    if (ticksExisted % DELAY == 0) {
                        player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 100, 0));
                        if (!player.isBurning()) {
                            player.setFire(5);
                        }
                        mana--;

                        // 防御 5：getActivePotionEffects 可能返回 null
                        Collection<PotionEffect> activePotions = player.getActivePotionEffects();
                        if (activePotions != null && !activePotions.isEmpty()) {
                            // 复制一份，避免边遍历边 removePotionEffect 触发 ConcurrentModificationException
                            Collection<PotionEffect> potions = new ArrayList<PotionEffect>(activePotions);
                            for (PotionEffect potion : potions) {
                                // 防御 6：集合里可能有 null 元素
                                if (potion == null) continue;

                                int id = potion.getPotionID();
                                // 防御 7：药水 id 越界检查
                                if (id < 0 || id >= Potion.potionTypes.length) continue;

                                Potion potionType = Potion.potionTypes[id];
                                // 防御 8：该 id 未注册药水
                                if (potionType == null) continue;

                                Boolean isBad = ReflectionHelper.getPrivateValue(
                                    Potion.class,
                                    potionType,
                                    new String[] { "isBadEffect", "field_76418_K", "J" });

                                // 防御 9：反射失败时返回 null
                                if (isBad != null && isBad.booleanValue()) {
                                    player.removePotionEffect(id);
                                    mana--;
                                    break; // 每次只清除一个负面效果
                                }
                            }
                        }
                    }

                    player.setFire(5);
                    player.attackEntityFrom(DamageSource.lava, 1);
                }
            }
        }

        ChunkCoordinates chunk = toChunkCoordinates();
        // 防御 10：toChunkCoordinates 可能返回 null
        if (chunk == null) return;

        for (int x = -RANGE; x < RANGE + 1; x++) {
            for (int z = -RANGE; z < RANGE + 1; z++) {
                int chunkx = chunk.posX + x;
                int chunkz = chunk.posZ + z;
                int chunky = chunk.posY;
                // 原本的 while(true) + if(chunky>255) break，改成 while 条件更干净
                while (chunky <= 255) {
                    Block block = world.getBlock(chunkx, chunky, chunkz);
                    if (block instanceof BlockFire) {
                        mana--;
                        world.setBlockToAir(chunkx, chunky, chunkz);
                        Botania.proxy
                            .sparkleFX(world, chunkx + 0.5F, chunky, chunkz + 0.5F, 2.5F, 0.87F, 0.87F, 4F, 10);
                        return;
                    }
                    chunky++;
                }
            }
        }
    }

    @Override
    public int getMaxMana() {
        return 400;
    }

    @Override
    public boolean acceptsRedstone() {
        return true;
    }

    @Override
    public RadiusDescriptor getRadius() {
        return new RadiusDescriptor.Square(toChunkCoordinates(), RANGE);
    }
}
