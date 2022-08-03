package org.xelow.mekanismfarming.Containers;

import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.xelow.mekanismfarming.MekanismFarming;

public class containers
{
    public static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, MekanismFarming.id);


    public static final RegistryObject<ContainerType<SeedCreatorContainer>> SEED_CREATOR_CONTAINER =
            CONTAINERS.register("seed_creator_container",
            () -> IForgeContainerType.create(((windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                World world = inv.player.getEntityWorld();
                return new SeedCreatorContainer(windowId, world, pos, inv, inv.player);
            })));


    public static void register(IEventBus iEventBus)
    {
        CONTAINERS.register(iEventBus);
    }
}
