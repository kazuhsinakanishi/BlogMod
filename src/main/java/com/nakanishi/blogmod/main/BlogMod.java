package com.nakanishi.blogmod.main;

import com.nakanishi.blogmod.registry.BlogModBlocks;
import com.nakanishi.blogmod.registry.BlogModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@SuppressWarnings("removal")
@Mod(BlogMod.MOD_ID)
public class BlogMod {

    public static final String MOD_ID = "blog_mod";
    public BlogMod(){

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BlogModItems.MOD_ITEMS.register(bus);

    }
}