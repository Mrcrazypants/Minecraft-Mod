package com.mrcrazypants.Mod_1.init;

import java.util.ArrayList;
import java.util.List;

import com.mrcrazypants.Mod_1.items.ItemBase;
import com.mrcrazypants.Mod_1.items.armor.ArmorBase;
import com.mrcrazypants.Mod_1.items.food.FoodBase;
import com.mrcrazypants.Mod_1.items.food.FoodEffectBase;
import com.mrcrazypants.Mod_1.items.tools.ToolAxe;
import com.mrcrazypants.Mod_1.items.tools.ToolHoe;
import com.mrcrazypants.Mod_1.items.tools.ToolPickaxe;
import com.mrcrazypants.Mod_1.items.tools.ToolSpade;
import com.mrcrazypants.Mod_1.items.tools.ToolSword;
import com.mrcrazypants.Mod_1.util.Referance;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_ENDER_INGOT = EnumHelper.addToolMaterial("material_ender_ingot", 4, 5000, 15.0F, 6.0F, 25);
	public static final ArmorMaterial ARMOR_MATERIAL_ENDER = EnumHelper.addArmorMaterial("armor_material_ender", Referance.MOD_ID + ":ender", 25, new int[] {5, 10, 15, 7 }
	, 20, SoundEvents.ENTITY_ENDERMEN_DEATH, 0.0F);
	
	//Items
	public static final Item ENDER_INGOT = new ItemBase("ender_ingot");
	public static final Item BLUESTONE_DUST = new ItemBase("bluestone_dust");
	public static final Item ENDER_NUGGET = new ItemBase("ender_nugget");
	public static final Item ENDER_ROD = new ItemBase("ender_rod");

	//Tools
	public static final ItemSword ENDER_SWORD = new ToolSword("ender_sword", MATERIAL_ENDER_INGOT);
	public static final ItemSpade ENDER_SHOVEL = new ToolSpade("ender_shovel", MATERIAL_ENDER_INGOT);
	public static final ItemPickaxe ENDER_PICKAXE = new ToolPickaxe("ender_pickaxe", MATERIAL_ENDER_INGOT);
	public static final ItemAxe ENDER_AXE = new ToolAxe("ender_axe", MATERIAL_ENDER_INGOT);
	public static final ItemHoe ENDER_HOE = new ToolHoe("ender_hoe", MATERIAL_ENDER_INGOT);
	
	//Armor
	public static final Item ENDER_HELMET = new ArmorBase("ender_helmet", ARMOR_MATERIAL_ENDER, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENDER_CHESTPLATE = new ArmorBase("ender_chestplate", ARMOR_MATERIAL_ENDER, 1, EntityEquipmentSlot.CHEST);
	public static final Item ENDER_LEGGINGS = new ArmorBase("ender_leggings", ARMOR_MATERIAL_ENDER, 2, EntityEquipmentSlot.LEGS);
	public static final Item ENDER_BOOTS = new ArmorBase("ender_boots", ARMOR_MATERIAL_ENDER, 1, EntityEquipmentSlot.FEET);
	
	//Food 
	//public static final Item ENDER_APPLE = new FoodBase("ender_apple", 5, 6.0f, false);
	public static final Item ENDER_APPLE = new FoodEffectBase("ender_apple", 5, 6.0f, false, new PotionEffect(MobEffects.ABSORPTION, (300 * 20), 4, false, false));
}
