package com.mrcrazypants.Mod_1.init;

import java.util.ArrayList;
import java.util.List;

import com.mrcrazypants.Mod_1.blocks.BlockBase;
import com.mrcrazypants.Mod_1.blocks.BlockOfEnderBlock;
import com.mrcrazypants.Mod_1.blocks.EnderOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_OF_ENDER_BLOCK = new BlockOfEnderBlock("block_of_ender_block", Material.IRON);
	//public static final Block BLOCK_OF_ENDER_BLOCK = new BlockBase("block_of_ender_block", Material.IRON);
	public static final Block ENDERORE = new EnderOre("enderore", Material.IRON);
	

}
