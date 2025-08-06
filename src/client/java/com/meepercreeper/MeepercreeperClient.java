package com.meepercreeper;

import com.meepercreeper.entity.SimpleEntityModel;
import com.meepercreeper.entity.SimpleEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;

public class MeepercreeperClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		
		// Register entity renderer
		EntityRendererRegistry.register(Meepercreeper.SIMPLE_ENTITY, SimpleEntityRenderer::new);
	}
}