package com.nakanishi.blogmod.registry;

import com.nakanishi.blogmod.block.EnderCarrotsBlock;
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

        public static final RegistryObject<Block> ENDER_STONE = MOD_BLOCKS.register("ender_stone", ()-> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE)));

        public static final RegistryObject<Block> ENDER_CARROTS = MOD_BLOCKS.register("ender_carrots", ()-> new EnderCarrotsBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)));

        public static void register(IEventBus eventBus) {
            MOD_BLOCKS.register(eventBus);
        }
    }

    public static class Mod_BlockItems {

        public static final DeferredRegister<Item> MOD_BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlogMod.MOD_ID);

        public static final RegistryObject<Item> ENDER_STONE = MOD_BLOCK_ITEMS.register("ender_stone", ()-> new BlockItem(Mod_Blocks.ENDER_STONE.get(), new Item.Properties()));

        public static void register(IEventBus eventBus) {
            MOD_BLOCK_ITEMS.register(eventBus);
        }
    }
}