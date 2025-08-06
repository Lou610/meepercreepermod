package com.meepercreeper.item;

import com.meepercreeper.Meepercreeper;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SimpleEntitySpawnEgg extends SpawnEggItem {

    public SimpleEntitySpawnEgg() {
        super(Meepercreeper.SIMPLE_ENTITY, 0x4A90E2, 0x2E5C8A, new Item.Settings());
    }

    public static void register() {
        Registry.register(Registries.ITEM, new Identifier("meepercreeper", "simple_entity_spawn_egg"), new SimpleEntitySpawnEgg());
    }
}