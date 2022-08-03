package org.xelow.mekanismfarming.Event;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.items.ItemHandlerHelper;
import org.xelow.mekanismfarming.MekanismFarming;

@Mod.EventBusSubscriber(modid = MekanismFarming.id, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class player {
    @SubscribeEvent
    public static void playerToss(ItemTossEvent event) {
        PlayerEntity player = event.getPlayer();
        World world = player.getEntityWorld();
        BlockState state = world.getBlockState(player.getPosition().down());
        ItemStack item = event.getEntityItem().getItem();


    }
}