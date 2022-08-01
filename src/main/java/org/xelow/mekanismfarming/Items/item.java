package org.xelow.mekanismfarming.Items;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.xelow.mekanismfarming.Blocks.block;
import org.xelow.mekanismfarming.Items.registers.crops;
import org.xelow.mekanismfarming.MekanismFarming;

public class item
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MekanismFarming.id);

    //Register items


    public static void register(IEventBus iEventBus)
    {
        crops.register();
        ITEMS.register(iEventBus);
    }
}
