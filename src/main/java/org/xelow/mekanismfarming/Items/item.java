package org.xelow.mekanismfarming.Items;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.xelow.mekanismfarming.Blocks.block;
import org.xelow.mekanismfarming.MekanismFarming;

public class item
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MekanismFarming.id);

    //Register items
    public static final RegistryObject<Item> CoalSeeds = ITEMS.register("coal_seeds",
            () -> new BlockItem(block.CoalCrops.get(), new Item.Properties().group(ItemGroup.MISC).maxStackSize(64)));

    public static final RegistryObject<Item> Coal_fragment = ITEMS.register("coal_fragment",
            () -> new Item(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64)));


    public static void register(IEventBus iEventBus)
    {
        ITEMS.register(iEventBus);
    }
}
