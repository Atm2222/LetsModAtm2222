package com.atm2222.letsmodatm.init;

import com.atm2222.letsmodatm.item.ItemLMA;
import com.atm2222.letsmodatm.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by atmec on 8/11/2016.
 */
public class ModItems {
    public static final ItemLMA mapleLeaf = new ItemMapleLeaf();

    public static void init() {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
