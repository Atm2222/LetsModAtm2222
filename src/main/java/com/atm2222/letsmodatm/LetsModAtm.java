package com.atm2222.letsmodatm;

import com.atm2222.letsmodatm.proxy.IProxy;
import com.atm2222.letsmodatm.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name= Reference.Mod_Name, version= Reference.VERSION)

public class LetsModAtm {

    @Mod.Instance(Reference.MOD_ID)
    public static LetsModAtm instance;

    @SidedProxy(clientSide = "com.atm2222.letsmodatm.proxy.ClientProxy", serverSide = "com.atm2222.letsmodatm.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}


