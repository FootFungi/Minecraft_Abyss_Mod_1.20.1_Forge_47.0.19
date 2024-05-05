package net.tom.abyssmod.TestItems;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.tom.abyssmod.AbyssMod;
import net.tom.abyssmod.block.ModBlocks;


public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AbyssMod.MODID);

    public static final RegistryObject<CreativeModeTab> TAB = CREATIVE_MODE_TABS.register("tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(TestItems.GLEAMINGPOWDER.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                       pOutput.accept(TestItems.GLEAMINGPOWDER.get());
                       pOutput.accept(TestItems.PIGGLEDYSPAWNEGG.get());
                       pOutput.accept(TestItems.SHARDOFMOTHEROFPEARL.get());
                       pOutput.accept(TestItems.MOTHEROFPEARLSHELL.get());
                       pOutput.accept(TestItems.MOTHEROFPEARLSWORD.get());
                       pOutput.accept(TestItems.MOTHEROFPEARLPICKAXE.get());
                       pOutput.accept(TestItems.MOTHEROFPEARLAXE.get());
                       pOutput.accept(TestItems.MOTHEROFPEARLSHOVEL.get());
                       pOutput.accept(TestItems.MOTHEROFPEARLHOE.get());

                       pOutput.accept(TestItems.MOTHEROFPEARLHELMET.get());
                       pOutput.accept(TestItems.MOTHEROFPEARLCHESTPLATE.get());
                       pOutput.accept(TestItems.MOTHEROFPEARLLEGGINGS.get());
                       pOutput.accept(TestItems.MOTHEROFPEARLBOOTS.get());

                       pOutput.accept(ModBlocks.SHIMMERINGSTONE.get());
                       pOutput.accept(ModBlocks.MOTHEROFPEARLBLOCK.get());
                       pOutput.accept(ModBlocks.MOTHEROFPEARLSTONEORESTATEONE.get());
                       pOutput.accept(ModBlocks.MOTHEROFPEARLSTONEORESTATETWO.get());
                       pOutput.accept(ModBlocks.MOTHEROFPEARLSTONEORESTATETHREE.get());
                       pOutput.accept(ModBlocks.MOTHEROFPEARLSTONEORESTATEFOUR.get());
                       pOutput.accept(ModBlocks.MOTHEROFPEARLDEEPSLATEORESTATEONE.get());
                       pOutput.accept(ModBlocks.MOTHEROFPEARLDEEPSLATEORESTATETWO.get());
                       pOutput.accept(ModBlocks.MOTHEROFPEARLDEEPSLATEORESTATETHREE.get());
                       pOutput.accept(ModBlocks.MOTHEROFPEARLDEEPSLATEORESTATEFOUR.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
