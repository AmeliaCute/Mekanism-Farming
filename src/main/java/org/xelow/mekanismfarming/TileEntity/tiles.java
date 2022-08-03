package org.xelow.mekanismfarming.TileEntity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.xelow.mekanismfarming.Blocks.block;
import org.xelow.mekanismfarming.MekanismFarming;

public class tiles
{
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, MekanismFarming.id);


    public static RegistryObject<TileEntityType<SeedCreatorTile>> SEED_CREATOR_TILE = TILE_ENTITY_TYPES.register(
            "seed_creator_tile", () -> TileEntityType.Builder.create(SeedCreatorTile::new, block.SEED_CREATOR.get()).build(null));


    public static void register(IEventBus eventBus)
    {
        TILE_ENTITY_TYPES.register(eventBus);
    }
}
