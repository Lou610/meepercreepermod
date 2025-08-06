package com.meepercreeper.item;

import com.meepercreeper.Meepercreeper;
import com.meepercreeper.entity.ModEntities;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    
    public static final Item MEEPER_SPAWN_EGG = registerItem("meeper_spawn_egg",
            new SpawnEggItem(ModEntities.MEEPER, 0x7e9680, 0xc5d1c5, new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Meepercreeper.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Meepercreeper.LOGGER.info("Registering items for " + Meepercreeper.MOD_ID);
        
        // Add items to creative menu
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(entries -> {
            entries.add(MEEPER_SPAWN_EGG);
        });
    }
}