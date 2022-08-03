package org.xelow.mekanismfarming.Items;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.xelow.mekanismfarming.Blocks.block;
import org.xelow.mekanismfarming.ItemGroup.MFGroup;
import org.xelow.mekanismfarming.Items.customReg.crops;
import org.xelow.mekanismfarming.MekanismFarming;

public class item
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MekanismFarming.id);

    //Register items
    public static final RegistryObject<Item> SEED_CREATOR = ITEMS.register("seed_creator", () -> new BlockItem(block.SEED_CREATOR.get(), new Item.Properties().group(MFGroup.MekanismFarming)));

    public static void register(IEventBus iEventBus)
    {
        crops.register();
        ITEMS.register(iEventBus);
    }
}
