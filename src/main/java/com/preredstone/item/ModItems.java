package com.preredstone.item;

import com.preredstone.PreRedStone;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public  static  final  Item PRE_REDSTONE = registerItems("pre_redstone",new Item(new Item.Settings()));
    private static Item registerItems(String id, Item item){
 //       return Registry.register(Registries.ITEM,RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(PreRedStone.MOD_ID, id), item);
        return Registry.register(Registries.ITEM, Identifier.of(PreRedStone.MOD_ID, id), item);
    }
    public static  void addItemToIG(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(PRE_REDSTONE);
    }
    public  static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIG);
        PreRedStone.LOGGER.info("Registering Items");
    }
} 
