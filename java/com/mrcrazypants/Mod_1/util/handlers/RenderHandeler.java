package com.mrcrazypants.Mod_1.util.handlers;

import com.mrcrazypants.Mod_1.entity.EntityEnderer;
import com.mrcrazypants.Mod_1.rendering.RenderEnderer;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandeler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderer.class, new IRenderFactory<EntityEnderer>()
		{
			@Override
			public Render<? super EntityEnderer> createRenderFor(RenderManager manager) 
			{
				return new RenderEnderer(manager);
			}
		});
}
}