package com.nakanishi.blogmod.registry;

import com.nakanishi.blogmod.main.BlogMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlogModItems {

    public static final DeferredRegister<Item> MOD_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlogMod.MOD_ID);

    public static final RegistryObject<Item> ENDER_APPLE = MOD_ITEMS.register("ender_apple", ()-> new Item(new Item.Properties().food(Foods.APPLE)));

    public static void register(IEventBus eventBus){MOD_ITEMS.register(eventBus);}

}
