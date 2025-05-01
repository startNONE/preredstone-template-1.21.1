package com.preredstone.item;

import com.preredstone.PreRedStone;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> PREREDSTONE_GROUP  = register("preredstone_group");
    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(PreRedStone.MOD_ID, id));
    }
    public static ItemGroup registerAndGetDefault(Registry<ItemGroup> registry) {

    }
}
