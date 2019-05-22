package com.mrcrazypants.Mod_1.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockOfEnderBlock extends BlockBase 
{

	public BlockOfEnderBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(1000.0F);
		setResistance(16000.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.9F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}

}
