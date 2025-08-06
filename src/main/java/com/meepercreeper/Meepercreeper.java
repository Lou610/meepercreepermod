package com.meepercreeper;

import com.meepercreeper.entity.SimpleEntity;
import com.meepercreeper.item.SimpleEntitySpawnEgg;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Meepercreeper implements ModInitializer {
	public static final String MOD_ID = "meepercreeper";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final EntityType<SimpleEntity> SIMPLE_ENTITY = Registry.register(
		Registries.ENTITY_TYPE,
		new Identifier(MOD_ID, "simple_entity"),
		FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SimpleEntity::new)
			.dimensions(EntityDimensions.fixed(0.6f, 1.8f))
			.build()
	);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		// Register entity attributes
		FabricDefaultAttributeRegistry.register(SIMPLE_ENTITY, SimpleEntity.createSimpleEntityAttributes());

		// Register spawn egg
		SimpleEntitySpawnEgg.register();

		LOGGER.info("Simple entity mod initialized!");
	}
}