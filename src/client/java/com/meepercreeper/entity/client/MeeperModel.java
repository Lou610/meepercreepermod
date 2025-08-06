package com.meepercreeper.entity.client;

import com.meepercreeper.entity.MeeperEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class MeeperModel<T extends MeeperEntity> extends EntityModel<T> {
    private final ModelPart body;
    private final ModelPart head;
    private final ModelPart leg1;
    private final ModelPart leg2;
    private final ModelPart leg3;
    private final ModelPart leg4;

    public MeeperModel(ModelPart root) {
        this.body = root.getChild("body");
        this.head = root.getChild("head");
        this.leg1 = root.getChild("leg1");
        this.leg2 = root.getChild("leg2");
        this.leg3 = root.getChild("leg3");
        this.leg4 = root.getChild("leg4");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();

        // Body
        modelPartData.addChild("body", ModelPartBuilder.create()
                .uv(18, 4)
                .cuboid(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F),
                ModelTransform.pivot(0.0F, 5.0F, 2.0F));

        // Head
        modelPartData.addChild("head", ModelPartBuilder.create()
                .uv(0, 0)
                .cuboid(-4.0F, -4.0F, -6.0F, 8.0F, 8.0F, 6.0F),
                ModelTransform.pivot(0.0F, -4.0F, -8.0F));

        // Legs
        modelPartData.addChild("leg1", ModelPartBuilder.create()
                .uv(0, 16)
                .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F),
                ModelTransform.pivot(-3.0F, 12.0F, 7.0F));

        modelPartData.addChild("leg2", ModelPartBuilder.create()
                .uv(0, 16)
                .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F),
                ModelTransform.pivot(3.0F, 12.0F, 7.0F));

        modelPartData.addChild("leg3", ModelPartBuilder.create()
                .uv(0, 16)
                .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F),
                ModelTransform.pivot(-3.0F, 12.0F, -5.0F));

        modelPartData.addChild("leg4", ModelPartBuilder.create()
                .uv(0, 16)
                .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F),
                ModelTransform.pivot(3.0F, 12.0F, -5.0F));

        return TexturedModelData.of(modelData, 64, 32);
    }

    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        this.head.pitch = headPitch * 0.017453292F;
        this.head.yaw = headYaw * 0.017453292F;

        // Walking animation
        this.leg1.pitch = MathHelper.cos(limbAngle * 0.6662F) * 1.4F * limbDistance;
        this.leg2.pitch = MathHelper.cos(limbAngle * 0.6662F + (float)Math.PI) * 1.4F * limbDistance;
        this.leg3.pitch = MathHelper.cos(limbAngle * 0.6662F + (float)Math.PI) * 1.4F * limbDistance;
        this.leg4.pitch = MathHelper.cos(limbAngle * 0.6662F) * 1.4F * limbDistance;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
        body.render(matrices, vertices, light, overlay, color);
        head.render(matrices, vertices, light, overlay, color);
        leg1.render(matrices, vertices, light, overlay, color);
        leg2.render(matrices, vertices, light, overlay, color);
        leg3.render(matrices, vertices, light, overlay, color);
        leg4.render(matrices, vertices, light, overlay, color);
    }
}