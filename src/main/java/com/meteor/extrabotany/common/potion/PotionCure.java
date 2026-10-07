package com.meteor.extrabotany.common.potion;

import java.util.ArrayList;
import java.util.Collection;

import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingEvent;

import com.meteor.extrabotany.common.core.handler.ConfigHandler;
import com.meteor.extrabotany.common.lib.LibPotionEffectName;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.ReflectionHelper;

public class PotionCure extends PotionMods {

    public PotionCure() {
        super(ConfigHandler.idPotionC, LibPotionEffectName.CURE, false, 0xF39716, 4);
        MinecraftForge.EVENT_BUS.register(this);
        FMLCommonHandler.instance()
            .bus()
            .register(this);
    }

    @SubscribeEvent
    public void LivingEvent(LivingEvent.LivingUpdateEvent event) {
        if (event.entityLiving.isPotionActive(ModPotions.cure)) {
            Collection<PotionEffect> activePotions = event.entityLiving.getActivePotionEffects();
            if (activePotions != null && !activePotions.isEmpty()) {
                // 复制一份，避免边遍历边 removePotionEffect 触发 ConcurrentModificationException
                Collection<PotionEffect> potions = new ArrayList<PotionEffect>(activePotions);
                boolean flag = false;
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
                        event.entityLiving.removePotionEffect(id);
                        flag = true;
                        break;
                    }
                }
            }
        }
    }

}
