package com.preredstone.items;

import com.preredstone.PreRedStone;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    public  static  final  Item PRE_REDSTONE
    private static Item registerItems(String id, Item item){
 //       return Registry.register(Registries.ITEM,RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(PreRedStone.MOD_ID, id), item);
        return Registry.register(Registries.ITEM,RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(PreRedStone.MOD_ID, id), item);
    }
}
