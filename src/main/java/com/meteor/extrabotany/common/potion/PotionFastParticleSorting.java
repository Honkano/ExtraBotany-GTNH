package com.meteor.extrabotany.common.potion;

import com.meteor.extrabotany.common.core.handler.ConfigHandler;
import com.meteor.extrabotany.common.lib.LibPotionEffectName;

public class PotionFastParticleSorting extends PotionMods {

    public PotionFastParticleSorting() {
        super(ConfigHandler.idPotionFPS, LibPotionEffectName.FASTPARTICLESORTING, false, 0xFF0A0A, 0);
    }

}
