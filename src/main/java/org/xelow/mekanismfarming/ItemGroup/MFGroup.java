package org.xelow.mekanismfarming.ItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.xelow.mekanismfarming.Items.item;

public class MFGroup
{
    public static final ItemGroup MekanismFarming = new ItemGroup("mekanismfarming")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(Items.NETHERITE_HOE);
        }
    };
}
