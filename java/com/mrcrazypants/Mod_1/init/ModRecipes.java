package com.mrcrazypants.Mod_1.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	

	public static void init() 
	{
		GameRegistry.addSmelting(ModBlocks.ENDERORE, new ItemStack(ModItems.ENDER_NUGGET, 1), 1.5f);
		GameRegistry.addSmelting(Items.ENDER_PEARL, new ItemStack(ModItems.ENDER_NUGGET, 1), 1.5f);
		
	}
	
	
}
