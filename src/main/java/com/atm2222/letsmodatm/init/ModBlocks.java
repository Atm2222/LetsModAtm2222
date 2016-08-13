package com.atm2222.letsmodatm.init;

import com.atm2222.letsmodatm.block.BlockLMA;
import com.atm2222.letsmodatm.block.MxBlue;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
    public static final BlockLMA MxBlue = new MxBlue();

    public static void init() {
        GameRegistry.registerBlock(MxBlue,"MxBlue");
    }
}
