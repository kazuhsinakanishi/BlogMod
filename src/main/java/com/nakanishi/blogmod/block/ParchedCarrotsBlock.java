package com.nakanishi.blogmod.block;

import com.nakanishi.blogmod.registry.BlogModItems;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CarrotBlock;

public class ParchedCarrotsBlock extends CarrotBlock {
    public ParchedCarrotsBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return BlogModItems.PARCHED_CARROT.get();
    }
}
