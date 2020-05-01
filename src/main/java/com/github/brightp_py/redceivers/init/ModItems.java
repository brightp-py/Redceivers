package com.github.brightp_py.redceivers.init;

import com.github.brightp_py.redceivers.Redceivers;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Redceivers.MODID);

    // This is a very simple Item. It has no special properties except for being on our creative tab.
//    public static final RegistryObject<Item> WAND = ITEMS.register("wand", () ->
//            new Item(new Item.Properties().group(ItemGroup.REDSTONE)));
}
