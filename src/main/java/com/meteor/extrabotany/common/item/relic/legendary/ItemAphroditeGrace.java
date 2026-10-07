package com.meteor.extrabotany.common.item.relic.legendary;

import java.util.ArrayList;
import java.util.Collection;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import com.meteor.extrabotany.common.core.handler.PropertyHandler;
import com.meteor.extrabotany.common.core.util.EnchHelper;
import com.meteor.extrabotany.common.lib.LibItemName;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.ReflectionHelper;
import vazkii.botania.common.item.relic.ItemRelic;

public class ItemAphroditeGrace extends ItemRelicArmorSet {

    public ItemAphroditeGrace(int type, String name) {
        super(2, LibItemName.APHRODITEGRACE);
        MinecraftForge.EVENT_BUS.register(this);
        FMLCommonHandler.instance()
            .bus()
            .register(this);
    }

    @SubscribeEvent
    public void onPlayerAttacked(LivingHurtEvent event) {
        if (!(event.entity instanceof EntityPlayerMP)) {
            return;
        }
        boolean flag = false;
        EntityPlayer player = (EntityPlayer) event.entityLiving;
        for (ItemStack stack : player.inventory.armorInventory) {
            if (stack != null && stack.getItem() instanceof ItemAphroditeGrace) {
                float dm = EnchHelper.getDMBuff(stack);
                float df = EnchHelper.getDFBuff(stack);
                if (ItemRelic.isRightPlayer(player, stack)) if (event.ammount >= 6.0F * dm) {

                    PropertyHandler.addShieldAmount(event.ammount / 2 * df, player);

                    Collection<PotionEffect> activePotions = player.getActivePotionEffects();
                    if (activePotions != null && !activePotions.isEmpty()) {
                        // 复制一份，避免边遍历边 removePotionEffect 触发 ConcurrentModificationException
                        Collection<PotionEffect> potions = new ArrayList<PotionEffect>(activePotions);
                        for (PotionEffect potion : potions) {
                            if (potion == null) continue;
                            int id = potion.getPotionID();
                            if (id < 0 || id >= Potion.potionTypes.length) continue;
                            Potion potionType = Potion.potionTypes[id];
                            if (potionType == null) continue;
                            Boolean isBad = ReflectionHelper.getPrivateValue(
                                Potion.class,
                                potionType,
                                new String[] { "isBadEffect", "field_76418_K", "J" });
                            if (isBad != null && isBad.booleanValue()) {
                                player.removePotionEffect(id);
                                flag = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean hasAphroditeGrace(EntityPlayer player) {
        boolean bool = false;
        for (ItemStack stack : player.inventory.armorInventory) {
            if (stack != null && stack.getItem() instanceof ItemAphroditeGrace) {
                if (ItemRelic.isRightPlayer(player, stack)) {
                    bool = true;
                } else bool = false;
            }
        }
        return bool;
    }

}
