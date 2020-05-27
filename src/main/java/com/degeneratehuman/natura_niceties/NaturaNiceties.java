package com.degeneratehuman.natura_niceties;

import com.degeneratehuman.natura_niceties.init.ModRecipes;
import com.degeneratehuman.natura_niceties.proxy.CommonProxy;
import com.degeneratehuman.natura_niceties.templated.util.Reference; // generated
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, dependencies = "required-after:natura@[1.12.2-4.3.2.69,);")
public class NaturaNiceties {
    public static final Logger LOGGER = LogManager.getLogger(Reference.MODID);

    @Instance
    public static NaturaNiceties instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) { }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.Smelting.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) { }
}
