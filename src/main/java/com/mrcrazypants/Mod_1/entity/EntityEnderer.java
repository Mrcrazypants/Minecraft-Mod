package com.mrcrazypants.Mod_1.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityEnderer extends EntityCow
{

	public EntityEnderer(World worldIn) {
		super(worldIn);
		this.setSize(0.9F, 2.8F);
		
	}
	
	@Override
	public EntityCow createChild(EntityAgeable ageable) 
	{
		return new EntityEnderer(world);
	}
	
	@Override
	protected SoundEvent getAmbientSound() {
		return super.getAmbientSound();
	}
	

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return super.getHurtSound(source);
	}
	
	@Override
	protected SoundEvent getDeathSound() {
		return super.getDeathSound();
	}
	
}
	
	
	
	
	
	
	
/*
	public EntityEnderer(World worldIn) {
		super(worldIn);
		
	}

	@Override
	protected void entityInit() {
		
		
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound compound) {
		
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound compound) {
		
	}*/


