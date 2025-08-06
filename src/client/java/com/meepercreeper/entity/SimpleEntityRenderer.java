package com.meepercreeper.entity;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class SimpleEntityRenderer extends MobEntityRenderer<SimpleEntity, SimpleEntityModel> {

    // Use our custom texture
    private static final Identifier TEXTURE = new Identifier("meepercreeper", "textures/entity/simple_entity.png");

    public SimpleEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new SimpleEntityModel(context.getPart(SimpleEntityModel.MAIN)), 0.5f);
    }

    @Override
    public Identifier getTexture(SimpleEntity entity) {
        return TEXTURE;
    }
}