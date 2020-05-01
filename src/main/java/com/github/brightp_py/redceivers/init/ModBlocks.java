package com.github.brightp_py.redceivers.init;

import com.github.brightp_py.redceivers.Redceivers;
import com.github.brightp_py.redceivers.block.RedceiverBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Redceivers.MODID);

    public static final RegistryObject<Block> REDCEIVER_BLOCK = BLOCKS.register("redceiver", () -> new RedceiverBlock(Block.Properties.create(Material.ROCK, MaterialColor.RED).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.METAL)));
}
