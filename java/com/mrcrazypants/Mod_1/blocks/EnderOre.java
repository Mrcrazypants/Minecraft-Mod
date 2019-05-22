package com.mrcrazypants.Mod_1.blocks;

import java.util.Random;

import com.mrcrazypants.Mod_1.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class EnderOre  extends BlockBase {

	public EnderOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(20.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 3);
		//setLightLevel(1.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}
	/*
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.ENDER_NUGGET;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		//return 3
		int max = 2;
		int min = 0;
		return rand.nextInt(max) + min;
		
	}
	*/

}
 