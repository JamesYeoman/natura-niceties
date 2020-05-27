package com.degeneratehuman.natura_niceties.util.handlers;

import com.degeneratehuman.natura_niceties.init.*;
import com.degeneratehuman.natura_niceties.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryEntry;

import java.util.stream.Stream;

@EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        register(event, ModItems.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        register(event, ModBlocks.BLOCKS.toArray(new Block[0]));
    }

    private static <T extends IForgeRegistryEntry<T>> void register(RegistryEvent.Register<T> event, T[] stuff) {
        event.getRegistry().registerAll(stuff);
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        Stream.concat(ModItems.ITEMS.stream(), ModBlocks.BLOCKS.stream())
                .filter(item -> item instanceof IHasModel)
                .forEach(item -> ((IHasModel) item).registerModels());
    }
}
