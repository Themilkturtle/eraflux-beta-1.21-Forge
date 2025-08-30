package net.caduceusmodding.eraflux.item;

import net.caduceusmodding.eraflux.EraFlux;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EraFlux.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ERAFLUX_TAB =
            CREATIVE_MODE_TABS.register("eraflux_tab", () ->
                    CreativeModeTab.builder()
                            .icon(() -> new ItemStack(ModItems.BONE_FRAGMENTS.get()))
                            .title(Component.translatable("itemGroup.eraflux.eraflux_tab"))
                            .displayItems((params, output) -> {
                                output.accept(ModItems.BONE_FRAGMENTS.get());
                                output.accept(ModItems.CHARRED_BONE_FRAGMENTS.get());
                                output.accept(ModItems.AMBER_CHUNK.get());
                                output.accept(ModItems.BIOFLUID_VILE.get());
                                output.accept(ModItems.BLOOD_VILE.get());
                                output.accept(ModItems.GLASS_VILE.get());
                                output.accept(ModItems.RAW_LEAD.get());
                                output.accept(ModItems.RAW_TUNGSTEN.get());
                            })
                            .build()
            );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
