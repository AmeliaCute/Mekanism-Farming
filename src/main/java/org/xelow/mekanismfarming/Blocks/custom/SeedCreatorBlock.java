package org.xelow.mekanismfarming.Blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.energy.EnergyStorage;
import net.minecraftforge.fml.network.NetworkHooks;
import org.xelow.mekanismfarming.Containers.SeedCreatorContainer;
import org.xelow.mekanismfarming.TileEntity.SeedCreatorTile;
import org.xelow.mekanismfarming.TileEntity.tiles;

import javax.annotation.Nullable;

public class SeedCreatorBlock extends Block
{
    public SeedCreatorBlock(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (!worldIn.isRemote) {
            TileEntity tile = worldIn.getTileEntity(pos);
            if(tile instanceof SeedCreatorTile)
            {
                INamedContainerProvider container = createContainerProvider(worldIn, pos);

                System.out.println("SeedCreatorBlock.onBlockActivated: container = " + container);
                NetworkHooks.openGui(((ServerPlayerEntity)player) , container, tile.getPos());
                return ActionResultType.SUCCESS;
            }
            else {
                System.out.println("SeedCreatorBlock.onBlockActivated: tile is not a SeedCreatorTile");
            }
        }
        return ActionResultType.FAIL;
    }

    private INamedContainerProvider createContainerProvider(World worldIn, BlockPos pos)
    {
        return new INamedContainerProvider()
        {
            @Override
            public ITextComponent getDisplayName() {
                return new TranslationTextComponent("screen.mekanismfarming.seed_creator");
            }

            @Nullable
            @Override
            public Container createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
                return new SeedCreatorContainer(i, worldIn, pos, playerInventory, playerEntity);
            }
        };
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return tiles.SEED_CREATOR_TILE.get().create();
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }
}
