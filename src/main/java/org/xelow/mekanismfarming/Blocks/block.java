package org.xelow.mekanismfarming.Blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.xelow.mekanismfarming.Blocks.custom.SeedCreatorBlock;
import org.xelow.mekanismfarming.MekanismFarming;

import java.util.function.Supplier;

public class block
{
    public static final DeferredRegister<Block> BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, MekanismFarming.id);

    //Register blocks
    public static final RegistryObject<Block> SEED_CREATOR = BLOCK.register("seed_creator",
            () -> new SeedCreatorBlock(AbstractBlock.Properties.create(Material.IRON)));

    public static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCK.register(name, block);
        return toReturn;
    }



    public static void register(IEventBus iEventBus)
    {
        BLOCK.register(iEventBus);
    }
}
