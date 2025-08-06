package com.meepercreeper;

import com.meepercreeper.entity.ModEntities;
import com.meepercreeper.entity.client.MeeperModel;
import com.meepercreeper.entity.client.MeeperRenderer;
import com.meepercreeper.entity.client.ModEntityModelLayers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class MeepercreeperClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		
		// Register entity renderers
		EntityRendererRegistry.register(ModEntities.MEEPER, MeeperRenderer::new);
		
		// Register entity model layers
		EntityModelLayerRegistry.registerModelLayer(ModEntityModelLayers.MEEPER, MeeperModel::getTexturedModelData);
	}
}