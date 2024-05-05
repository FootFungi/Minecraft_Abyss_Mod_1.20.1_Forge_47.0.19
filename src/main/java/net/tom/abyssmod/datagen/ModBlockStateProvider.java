package net.tom.abyssmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.tom.abyssmod.AbyssMod;
import net.tom.abyssmod.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, AbyssMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.SHIMMERINGSTONE);
        blockWithItem(ModBlocks.MOTHEROFPEARLBLOCK);

        blockWithItem(ModBlocks.MOTHEROFPEARLSTONEORESTATEONE);
        blockWithItem(ModBlocks.MOTHEROFPEARLSTONEORESTATETWO);
        blockWithItem(ModBlocks.MOTHEROFPEARLSTONEORESTATETHREE);
        blockWithItem(ModBlocks.MOTHEROFPEARLSTONEORESTATEFOUR);
        blockWithItem(ModBlocks.MOTHEROFPEARLDEEPSLATEORESTATEONE);
        blockWithItem(ModBlocks.MOTHEROFPEARLDEEPSLATEORESTATETWO);
        blockWithItem(ModBlocks.MOTHEROFPEARLDEEPSLATEORESTATETHREE);
        blockWithItem(ModBlocks.MOTHEROFPEARLDEEPSLATEORESTATEFOUR);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
