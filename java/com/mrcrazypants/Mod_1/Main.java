package com.mrcrazypants.Mod_1;

import com.mrcrazypants.Mod_1.init.ModRecipes;
import com.mrcrazypants.Mod_1.proxy.CommonProxy;
import com.mrcrazypants.Mod_1.tabs.EnderTab;
import com.mrcrazypants.Mod_1.util.Referance;
import com.mrcrazypants.Mod_1.util.handlers.RegistryHandler;
import com.mrcrazypants.Mod_1.world.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Referance.MOD_ID, name = Referance.NAME, version = Referance.VERSION)
public class Main {
	
	public static final CreativeTabs endertab = new EnderTab("endertab");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Referance.CLIENT_PROXY_CLASS, serverSide = Referance.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit (FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	
}
	
	@EventHandler
	public static void init (FMLInitializationEvent event)
	{
		ModRecipes.init();
	
}
	
	
	@EventHandler
	public static void Postinit (FMLPostInitializationEvent event)
	{
		
	
		
	
}
	
	@EventHandler
	 public static void postInit(FMLPostInitializationEvent event) {RegistryHandler.preInitRegistries();}{
		 
	 }
	 
	 
	
}