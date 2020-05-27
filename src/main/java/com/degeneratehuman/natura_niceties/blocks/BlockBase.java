package com.degeneratehuman.natura_niceties.blocks;

import com.degeneratehuman.natura_niceties.NaturaNiceties;
import com.degeneratehuman.natura_niceties.init.ModBlocks;
import com.degeneratehuman.natura_niceties.init.ModItems;
import com.degeneratehuman.natura_niceties.util.CreativeTabs;
import com.degeneratehuman.natura_niceties.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.Objects;

public class BlockBase extends Block implements IHasModel {
    public BlockBase(String name, Material materialIn) {
        super(materialIn);
        Objects.requireNonNull(name);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.tabBlocks);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        NaturaNiceties.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
