package com.mrcrazypants.Mod_1.init;

import com.mrcrazypants.Mod_1.Main;
import com.mrcrazypants.Mod_1.entity.EntityEnderer;
import com.mrcrazypants.Mod_1.util.Referance;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	public static void registerEntities() 
	{
		registerEntity("enderer", EntityEnderer.class, Referance.ENTITY_ENDERER, 50, 10420479, 000000);
	}
	
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) 
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Referance.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}

}
