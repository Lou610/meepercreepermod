package com.meepercreeper.entity;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.util.Identifier;

public class SimpleEntityModel extends SinglePartEntityModel<SimpleEntity> {

    public static final EntityModelLayer MAIN = new EntityModelLayer(new Identifier("meepercreeper", "simple_entity"), "main");
    
    private final ModelPart root;

    public SimpleEntityModel(ModelPart root) {
        this.root = root;
    }

    @Override
    public ModelPart getPart() {
        return this.root;
    }

    @Override
    public void setAngles(SimpleEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        // Basic animation setup
        this.root.yaw = headYaw * 0.017453292F;
        this.root.pitch = headPitch * 0.017453292F;
    }
}