package com.meepercreeper.entity.client;

import com.meepercreeper.Meepercreeper;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModEntityModelLayers {
    public static final EntityModelLayer MEEPER = new EntityModelLayer(
            Identifier.of(Meepercreeper.MOD_ID, "meeper"), "main");
}