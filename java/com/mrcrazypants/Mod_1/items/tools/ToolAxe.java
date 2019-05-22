package com.mrcrazypants.Mod_1.items.tools;

import com.mrcrazypants.Mod_1.Main;
import com.mrcrazypants.Mod_1.init.ModItems;
import com.mrcrazypants.Mod_1.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAxe extends ItemAxe implements IHasModel  {
	
	public ToolAxe(String name, ToolMaterial material)
	{
		super(material,7.5F, -3.1F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{	
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
