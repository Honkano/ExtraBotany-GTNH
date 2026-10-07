package com.meteor.extrabotany.common.block;

import com.meteor.extrabotany.common.block.tile.TileRelicPlate;
import com.meteor.extrabotany.common.entity.gaia.EntityGaiaIII;

import vazkii.botania.api.lexicon.multiblock.MultiblockSet;

public class ModMultiBlocks {

    public static MultiblockSet relicPlate;
    public static MultiblockSet gaia;

    public static void init() {
        relicPlate = TileRelicPlate.makeMultiblockSet();
        gaia = EntityGaiaIII.makeMultiblockSet();
    }
}
