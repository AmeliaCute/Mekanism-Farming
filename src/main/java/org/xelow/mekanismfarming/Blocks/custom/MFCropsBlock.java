package org.xelow.mekanismfarming.Blocks.custom;

import net.java.games.input.Component;
import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import org.xelow.mekanismfarming.Items.item;

public class MFCropsBlock extends CropsBlock {

    private final IItemProvider crop;

    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D),
            Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)};

    public MFCropsBlock()
    {
        super(AbstractBlock.Properties.from(Blocks.WHEAT).hardnessAndResistance(3.0F));
        crop = null;
    }

    @Override
    protected IItemProvider getSeedsItem()
    {
        return super.getSeedsItem();
    }

    public VoxelShape getShape(BlockState state, net.minecraft.world.IBlockReader worldIn, BlockPos pos, net.minecraft.util.math.shapes.ISelectionContext context)
    {
        return SHAPE_BY_AGE[state.get(this.getAgeProperty())];
    }
}
