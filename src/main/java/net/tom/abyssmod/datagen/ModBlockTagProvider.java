package net.tom.abyssmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.tom.abyssmod.AbyssMod;
import net.tom.abyssmod.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static com.ibm.icu.util.LocalePriorityList.add;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, AbyssMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

       //Needed material tag:
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SHIMMERINGSTONE.get());
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.MOTHEROFPEARLBLOCK.get())
                .add(ModBlocks.MOTHEROFPEARLSTONEORESTATEONE.get())
                .add(ModBlocks.MOTHEROFPEARLSTONEORESTATETWO.get())
                .add(ModBlocks.MOTHEROFPEARLSTONEORESTATETHREE.get())
                .add(ModBlocks.MOTHEROFPEARLSTONEORESTATEFOUR.get())
                .add(ModBlocks.MOTHEROFPEARLDEEPSLATEORESTATEONE.get())
                .add(ModBlocks.MOTHEROFPEARLDEEPSLATEORESTATETWO.get())
                .add(ModBlocks.MOTHEROFPEARLDEEPSLATEORESTATETHREE.get())
                .add(ModBlocks.MOTHEROFPEARLDEEPSLATEORESTATEFOUR.get());
       //Needed tool tag:
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SHIMMERINGSTONE.get())
                .add(ModBlocks.MOTHEROFPEARLBLOCK.get())
                .add(ModBlocks.MOTHEROFPEARLSTONEORESTATEONE.get())
                .add(ModBlocks.MOTHEROFPEARLSTONEORESTATETWO.get())
                .add(ModBlocks.MOTHEROFPEARLSTONEORESTATETHREE.get())
                .add(ModBlocks.MOTHEROFPEARLSTONEORESTATEFOUR.get())
                .add(ModBlocks.MOTHEROFPEARLDEEPSLATEORESTATEONE.get())
                .add(ModBlocks.MOTHEROFPEARLDEEPSLATEORESTATETWO.get())
                .add(ModBlocks.MOTHEROFPEARLDEEPSLATEORESTATETHREE.get())
                .add(ModBlocks.MOTHEROFPEARLDEEPSLATEORESTATEFOUR.get());
    }
}
