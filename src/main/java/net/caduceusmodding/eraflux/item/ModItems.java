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

    public static final RegistryObject<Item> YELLOW_SATLITE_PHONE = ITEMS.register("yellow_satlite_phone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RED_SATLITE_PHONE = ITEMS.register("red_satlite_phone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ORANGE_SATLITE_PHONE = ITEMS.register("orange_satlite_phone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GREEN_SATLITE_PHONE = ITEMS.register("green_satlite_phone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLUE_SATLITE_PHONE = ITEMS.register("blue_satlite_phone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LIGHT_BLUE_SATLITE_PHONE = ITEMS.register("light_blue_satlite_phone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CYAN_SATLITE_PHONE = ITEMS.register("cyan_satlite_phone",
            () -> new Item(new Item.Properties()));
;

    public static final RegistryObject<Item> PURPLE_SATLITE_PHONE = ITEMS.register("purple_satlite_phone",
            () -> new Item(new Item.Properties()));
;

    public static final RegistryObject<Item> MAGENTA_SATLITE_PHONE = ITEMS.register("magenta_satlite_phone",
            () -> new Item(new Item.Properties()));
;

    public static final RegistryObject<Item> PINK_SATLITE_PHONE = ITEMS.register("pink_satlite_phone",
            () -> new Item(new Item.Properties()));
;

    public static final RegistryObject<Item> WHITE_SATLITE_PHONE = ITEMS.register("white_satlite_phone",
            () -> new Item(new Item.Properties()));
;

    public static final RegistryObject<Item> BLACK_SATLITE_PHONE = ITEMS.register("black_satlite_phone",
            () -> new Item(new Item.Properties()));
;

    public static final RegistryObject<Item> GREY_SATLITE_PHONE = ITEMS.register("grey_satlite_phone",
            () -> new Item(new Item.Properties()));
;

    public static final RegistryObject<Item> LIGHT_GREY_SATLITE_PHONE = ITEMS.register("light_grey_satlite_phone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BROWN_SATLITE_PHONE = ITEMS.register("brown_satlite_phone",
            () -> new Item(new Item.Properties()));
;

    public static final RegistryObject<Item>  LIME_SATLITE_PHONE = ITEMS.register("lime_satlite_phone",
            () -> new Item(new Item.Properties()));
;


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    // Hi this is items!!





}
