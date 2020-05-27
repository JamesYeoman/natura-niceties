package com.degeneratehuman.natura_niceties.blocks;

import com.degeneratehuman.natura_niceties.NaturaNiceties;
import com.degeneratehuman.natura_niceties.init.ModBlocks;
import com.degeneratehuman.natura_niceties.init.ModItems;
import com.degeneratehuman.natura_niceties.util.CreativeTabs;
import com.degeneratehuman.natura_niceties.util.IHasModel;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockBarley extends BlockRotatedPillar implements IHasModel {
    private Item itemInstance;
    public BlockBarley() {
        super(Material.PLANTS);
        this.setDefaultState(this.blockState.getBaseState().withProperty(AXIS, EnumFacing.Axis.Y));
        this.setUnlocalizedName("barley_block").setRegistryName("barley_block");
        this.setCreativeTab(CreativeTabs.tabBlocks);

        ModBlocks.BLOCKS.add(this);
        this.itemInstance = new ItemBlock(this).setRegistryName(this.getRegistryName());

        ModItems.ITEMS.add(this.itemInstance);
    }

    /**
     * Block's chance to react to a living entity falling on it.
     */
    public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance) {
        entityIn.fall(fallDistance, 0.2F);
    }

    @Override
    public void registerModels() {
        NaturaNiceties.proxy.registerItemRenderer(this.itemInstance, 0, "inventory");
    }
}
