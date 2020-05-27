package com.degeneratehuman.natura_niceties.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

import java.util.Objects;

public class ClientProxy extends CommonProxy {
    public void registerItemRenderer(Item item, int meta, String id) {
        ResourceLocation registryName = item.getRegistryName();
        Objects.requireNonNull(registryName);

        ModelResourceLocation resourceLocation = new ModelResourceLocation(registryName, id);
        ModelLoader.setCustomModelResourceLocation(item, meta, resourceLocation);
    }
}
