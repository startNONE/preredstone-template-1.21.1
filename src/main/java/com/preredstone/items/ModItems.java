package com.preredstone.items;

import com.preredstone.PreRedStone;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public  static  final  Item PRE_REDSTONE = registerItems("pre_redstone",new Item(new Item.Settings()));
    private static Item registerItems(String id, Item item){
 //       return Registry.register(Registries.ITEM,RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(PreRedStone.MOD_ID, id), item);
        return Registry.register(Registries.ITEM, Identifier.of(PreRedStone.MOD_ID, id), item);
    }
    public  static void registerModItems(){
        PreRedStone.LOGGER.info("Registering Items");
    }
}
