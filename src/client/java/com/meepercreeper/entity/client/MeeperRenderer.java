package com.meepercreeper.entity.client;

import com.meepercreeper.Meepercreeper;
import com.meepercreeper.entity.MeeperEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class MeeperRenderer extends MobEntityRenderer<MeeperEntity, MeeperModel<MeeperEntity>> {
    private static final Identifier TEXTURE = Identifier.of(Meepercreeper.MOD_ID, "textures/entity/meeper.png");

    public MeeperRenderer(EntityRendererFactory.Context context) {
        super(context, new MeeperModel<>(context.getPart(ModEntityModelLayers.MEEPER)), 0.6f);
    }

    @Override
    public Identifier getTexture(MeeperEntity entity) {
        return TEXTURE;
    }
}