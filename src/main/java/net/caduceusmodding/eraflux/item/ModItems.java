package net.caduceusmodding.eraflux.item;

import net.caduceusmodding.eraflux.EraFlux;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EraFlux.MOD_ID);

    public static final RegistryObject<Item> BONE_FRAGMENTS = ITEMS.register("bone_fragments",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHARRED_BONE_FRAGMENTS = ITEMS.register("charred_bone_fragments",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AMBER_CHUNK = ITEMS.register("amber_chunk",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BIOFLUID_VILE = ITEMS.register("biofluid_vile",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLOOD_VILE = ITEMS.register("blood_viles",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GLASS_VILE = ITEMS.register("glass_vile",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> RAW_TUNGSTEN = ITEMS.register("raw_tungsten",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    // Hi this is items!!





}
