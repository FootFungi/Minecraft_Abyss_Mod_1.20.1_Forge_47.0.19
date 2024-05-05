package net.tom.abyssmod.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetInstrumentFunction;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.tom.abyssmod.TestItems.TestItems;
import net.tom.abyssmod.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.add(ModBlocks.SHIMMERINGSTONE.get(),
                block -> createStandartOre(ModBlocks.SHIMMERINGSTONE.get(), TestItems.GLEAMINGPOWDER.get()));
        this.add(ModBlocks.MOTHEROFPEARLSTONEORESTATEONE.get(),
                block -> createStandartDropOneOre(ModBlocks.SHIMMERINGSTONE.get(), TestItems.SHARDOFMOTHEROFPEARL.get()));
        this.add(ModBlocks.MOTHEROFPEARLSTONEORESTATETWO.get(),
                block -> createStandartDropTwoOre(ModBlocks.MOTHEROFPEARLSTONEORESTATETWO.get(), TestItems.SHARDOFMOTHEROFPEARL.get()));
        this.add(ModBlocks.MOTHEROFPEARLSTONEORESTATETHREE.get(),
                block -> createStandartDropThreeOre(ModBlocks.MOTHEROFPEARLSTONEORESTATETHREE.get(), TestItems.SHARDOFMOTHEROFPEARL.get()));
        this.add(ModBlocks.MOTHEROFPEARLSTONEORESTATEFOUR.get(),
                block -> createStandartDropFourOre(ModBlocks.MOTHEROFPEARLSTONEORESTATEFOUR.get(), TestItems.SHARDOFMOTHEROFPEARL.get()));
        this.add(ModBlocks.MOTHEROFPEARLDEEPSLATEORESTATEONE.get(),
                block -> createStandartDropOneOre(ModBlocks.MOTHEROFPEARLDEEPSLATEORESTATEONE.get(), TestItems.SHARDOFMOTHEROFPEARL.get()));
        this.add(ModBlocks.MOTHEROFPEARLDEEPSLATEORESTATETWO.get(),
                block -> createStandartDropTwoOre(ModBlocks.MOTHEROFPEARLDEEPSLATEORESTATETWO.get(), TestItems.SHARDOFMOTHEROFPEARL.get()));
        this.add(ModBlocks.MOTHEROFPEARLDEEPSLATEORESTATETHREE.get(),
                block -> createStandartDropThreeOre(ModBlocks.MOTHEROFPEARLDEEPSLATEORESTATETHREE.get(), TestItems.SHARDOFMOTHEROFPEARL.get()));
        this.add(ModBlocks.MOTHEROFPEARLDEEPSLATEORESTATEFOUR.get(),
                block -> createStandartDropFourOre(ModBlocks.MOTHEROFPEARLDEEPSLATEORESTATEFOUR.get(), TestItems.SHARDOFMOTHEROFPEARL.get()));

        this.dropSelf(ModBlocks.MOTHEROFPEARLBLOCK.get());
    }
    protected LootTable.Builder createStandartOre(Block pBlock, Item item){
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0f, 4.0f)))
                        .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }
    protected LootTable.Builder createStandartDropOneOre(Block pBlock, Item item){
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }
    protected LootTable.Builder createStandartDropTwoOre(Block pBlock, Item item){
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0f, 2.0f)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }
    protected LootTable.Builder createStandartDropThreeOre(Block pBlock, Item item){
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(3.0f, 3.0f)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }
    protected LootTable.Builder createStandartDropFourOre(Block pBlock, Item item){
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0f, 4.0f)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
