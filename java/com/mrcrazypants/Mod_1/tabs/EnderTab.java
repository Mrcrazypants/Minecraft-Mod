package com.mrcrazypants.Mod_1.tabs;

import com.mrcrazypants.Mod_1.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class EnderTab extends CreativeTabs 
{
	public EnderTab(String name) {
		super("endertab");
		
		this.setBackgroundImageName("ender.png");}
		public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.BLUESTONE_DUST);}
}
