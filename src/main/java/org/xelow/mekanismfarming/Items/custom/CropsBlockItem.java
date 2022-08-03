package org.xelow.mekanismfarming.Items.custom;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import org.xelow.mekanismfarming.Blocks.block;
import org.xelow.mekanismfarming.Blocks.custom.MFCropsBlock;
import org.xelow.mekanismfarming.ItemGroup.MFGroup;
import org.xelow.mekanismfarming.Items.item;

public class CropsBlockItem
{
    private String name;
    private MaterialColor color;
    private RegistryObject<CropsBlock> block_;

    public CropsBlockItem(String name, MaterialColor color)
    {
        this.name = name;
        this.color = color;

        RegistryObject<CropsBlock> blockk = block.BLOCK.register(name+"_crops", () -> new MFCropsBlock());

        item.ITEMS.register(name+"_seeds", () -> new BlockItem(blockk.get(), new Item.Properties().group(MFGroup.MekanismFarming).maxStackSize(64)));
        item.ITEMS.register(name+"_fragment", () -> new Item(new Item.Properties().group(MFGroup.MekanismFarming).maxStackSize(64).isImmuneToFire()));
        this.block_ = blockk;
    }

    public String getName() { return this.name; }
    public MaterialColor getColor() { return this.color; }
    public RegistryObject<CropsBlock> getBlock() { return this.block_; }
}
