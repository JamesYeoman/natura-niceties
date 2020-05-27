package com.degeneratehuman.natura_niceties.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
    public static class Smelting {
        public static void init() {
            GameRegistry.addSmelting(ModBlocks.BARLEY_BLOCK, new ItemStack(Blocks.HAY_BLOCK, 1), 0.5f);
        }
    }
}
