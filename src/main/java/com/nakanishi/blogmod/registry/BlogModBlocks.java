package com.nakanishi.blogmod.registry;

import com.nakanishi.blogmod.block.ParchedCarrotsBlock;
import com.nakanishi.blogmod.main.BlogMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlogModBlocks {

    public static class Mod_Blocks {

        public static final DeferredRegister<Block> MOD_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlogMod.MOD_ID);

        public static final RegistryObject<Block> PARCHED_STONE = MOD_BLOCKS.register("parched_stone", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

        public static void register(IEventBus eventBus) {
            MOD_BLOCKS.register(eventBus);
        }
    }

    public static class Mod_BlockItems {

        public static final DeferredRegister<Item> MOD_BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlogMod.MOD_ID);

        public static final RegistryObject<Item> PARCHED_STONE = MOD_BLOCK_ITEMS.register("parched_stone", ()-> new BlockItem(Mod_Blocks.PARCHED_STONE.get(), new Item.Properties()));

        public static void register(IEventBus eventBus) {
            MOD_BLOCK_ITEMS.register(eventBus);
        }
    }
}