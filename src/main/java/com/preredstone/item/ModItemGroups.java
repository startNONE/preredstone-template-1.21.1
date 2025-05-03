package com.preredstone.item;

import com.preredstone.PreRedStone;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.core.config.AppenderRef;

public class ModItemGroups {
//    public static final RegistryKey<ItemGroup> PREREDSTONE_GROUP  = register("preredstone_group");
//    private static RegistryKey<ItemGroup> register(String id) {
 //       return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(PreRedStone.MOD_ID, id));
//    }
 //   public static void registerItemGroups(){
    //    Registry.register(Registries.ITEM_GROUP, PREREDSTONE_GROUP,
          //    ItemGroup.create(ItemGroup.Row.TOP, 7).displayName(Text.translatable("itemGroup.preredstone.preredstone_group"))
        //              .icon(() -> new ItemStack(ModItems.PRE_REDSTONE))
            //            .entries((displayContext, entries) -> {
                //            entries.add(ModItems.PRE_REDSTONE);
                    //    }).build());
       // PreRedStone.LOGGER.info("Registering Item Groups");
    public static final ItemGroup PREREDSTONE_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(PreRedStone.MOD_ID, "preredstone_group"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.preredstone_group"))
                    .icon(() -> new ItemStack(ModItems.PRE_REDSTONE))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PRE_REDSTONE);
                        }).build());
    public static void registerModItemGroups(){
        PreRedStone.LOGGER.info("Registering item groups");
    }
    }

