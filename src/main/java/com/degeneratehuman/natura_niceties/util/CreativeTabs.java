package com.degeneratehuman.natura_niceties.util;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import slimeknights.mantle.client.CreativeTab;

public final class CreativeTabs {
    public static CreativeTab tabBlocks = new CreativeTab("NaturaNicetiesBlocks", new ItemStack(Blocks.SLIME_BLOCK));
    public static CreativeTab tabItems = new CreativeTab("NaturaNicetiesItems", new ItemStack(Blocks.SLIME_BLOCK));

}
