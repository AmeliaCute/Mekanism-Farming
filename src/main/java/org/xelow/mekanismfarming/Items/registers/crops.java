package org.xelow.mekanismfarming.Items.registers;

import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import org.xelow.mekanismfarming.Items.custom.CropsBlockItem;

public class crops
{
    public static CropsBlockItem iron;
    public static CropsBlockItem gold;
    public static CropsBlockItem diamond;
    public static CropsBlockItem redstone;
    public static CropsBlockItem lapis;
    public static CropsBlockItem emerald;
    public static CropsBlockItem netherite;

    public static void register()
    {
        //Register blocks
        iron = new CropsBlockItem("iron", MaterialColor.IRON);
        gold = new CropsBlockItem("gold", MaterialColor.GOLD);
        diamond = new CropsBlockItem("diamond", MaterialColor.DIAMOND);


    }
}
