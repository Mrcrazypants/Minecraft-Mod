package com.mrcrazypants.Mod_1.rendering.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCow - Either Mojang or a mod author
 * Created using Tabula 7.0.1
 */
public class ModelEnderer extends ModelBase {
    public ModelRenderer CowBody;
    public ModelRenderer Udders;
    public ModelRenderer RearLeftLeg;
    public ModelRenderer FrontLeftLeg;
    public ModelRenderer RearRightLeg;
    public ModelRenderer FrontRightLeg;
    public ModelRenderer Head;

    public ModelEnderer() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.FrontRightLeg = new ModelRenderer(this, 0, 16);
        this.FrontRightLeg.setRotationPoint(-4.0F, 7.0F, -6.0F);
        this.FrontRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.RearLeftLeg = new ModelRenderer(this, 0, 16);
        this.RearLeftLeg.setRotationPoint(4.0F, 12.0F, 7.0F);
        this.RearLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Udders = new ModelRenderer(this, 52, 0);
        this.Udders.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.Udders.addBox(-2.0F, 2.0F, -8.0F, 4, 6, 1, 0.0F);
        this.setRotateAngle(Udders, 1.5707963267948966F, 0.0F, 0.0F);
        this.RearRightLeg = new ModelRenderer(this, 0, 16);
        this.RearRightLeg.setRotationPoint(-4.0F, 12.0F, 7.0F);
        this.RearRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(-5.8F, 0.1F, -2.8F);
        this.Head.addBox(-4.0F, -4.0F, -6.0F, 20, 17, 1, 0.0F);
        this.FrontLeftLeg = new ModelRenderer(this, 0, 16);
        this.FrontLeftLeg.setRotationPoint(4.0F, 7.0F, -6.0F);
        this.FrontLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.CowBody = new ModelRenderer(this, 18, 4);
        this.CowBody.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.CowBody.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F);
        this.setRotateAngle(CowBody, 1.5707963267948966F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.FrontRightLeg.render(f5);
        this.RearLeftLeg.render(f5);
        this.Udders.render(f5);
        this.RearRightLeg.render(f5);
        this.Head.render(f5);
        this.FrontLeftLeg.render(f5);
        this.CowBody.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
