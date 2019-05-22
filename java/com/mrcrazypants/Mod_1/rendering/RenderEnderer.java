package com.mrcrazypants.Mod_1.rendering;

import com.mrcrazypants.Mod_1.entity.EntityEnderer;
import com.mrcrazypants.Mod_1.rendering.models.ModelEnderer;
import com.mrcrazypants.Mod_1.util.Referance;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEnderer extends RenderLiving<EntityEnderer>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Referance.MOD_ID + ":textures/entity/enderer.png");
	
	public RenderEnderer(RenderManager manager) 
	{
		super(manager, new ModelEnderer(), 0.5F);	
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityEnderer entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityEnderer entityLiving, float source, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, source, rotationYaw, partialTicks);
	}

}
 