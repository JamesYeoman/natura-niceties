package com.degeneratehuman.natura_niceties.items;

import com.degeneratehuman.natura_niceties.NaturaNiceties;
import com.degeneratehuman.natura_niceties.init.ModItems;
import com.degeneratehuman.natura_niceties.util.CreativeTabs;
import com.degeneratehuman.natura_niceties.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.tabItems);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        NaturaNiceties.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
