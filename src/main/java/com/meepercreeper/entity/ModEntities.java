package com.meepercreeper.entity;

import com.meepercreeper.Meepercreeper;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    
    public static final EntityType<MeeperEntity> MEEPER = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(Meepercreeper.MOD_ID, "meeper"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MeeperEntity::new)
                    .dimensions(EntityDimensions.fixed(0.9f, 1.4f))
                    .build()
    );

    public static void registerEntities() {
        Meepercreeper.LOGGER.info("Registering entities for " + Meepercreeper.MOD_ID);
        
        // Register entity attributes
        FabricDefaultAttributeRegistry.register(MEEPER, MeeperEntity.createMeeperAttributes());
    }
}