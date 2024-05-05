package net.tom.abyssmod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tom.abyssmod.AbyssMod;
import net.tom.abyssmod.TestItems.TestItems;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AbyssMod.MODID);
    public static final RegistryObject<Block> SHIMMERINGSTONE = registerBlock("shimmering_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.COPPER).strength(1.5f)));
    public static final RegistryObject<Block> MOTHEROFPEARLBLOCK = registerBlock("mother_of_pearl_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.COPPER).strength(12f)));
    public static final RegistryObject<Block> MOTHEROFPEARLSTONEORESTATEONE = registerBlock("mother_of_pearl_stone_ore_state_one",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.COPPER).strength(12f)));
    public static final RegistryObject<Block> MOTHEROFPEARLSTONEORESTATETWO = registerBlock("mother_of_pearl_stone_ore_state_two",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.COPPER).strength(12f)));
    public static final RegistryObject<Block> MOTHEROFPEARLSTONEORESTATETHREE = registerBlock("mother_of_pearl_stone_ore_state_three",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.COPPER).strength(12f)));
    public static final RegistryObject<Block> MOTHEROFPEARLSTONEORESTATEFOUR = registerBlock("mother_of_pearl_stone_ore_state_four",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.COPPER).strength(12f)));
    public static final RegistryObject<Block> MOTHEROFPEARLDEEPSLATEORESTATEONE = registerBlock("mother_of_pearl_deepslate_ore_state_one",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.COPPER).strength(12f)));
    public static final RegistryObject<Block> MOTHEROFPEARLDEEPSLATEORESTATETWO = registerBlock("mother_of_pearl_deepslate_ore_state_two",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.COPPER).strength(12f)));
    public static final RegistryObject<Block> MOTHEROFPEARLDEEPSLATEORESTATETHREE = registerBlock("mother_of_pearl_deepslate_ore_state_three",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.COPPER).strength(12f)));
    public static final RegistryObject<Block> MOTHEROFPEARLDEEPSLATEORESTATEFOUR = registerBlock("mother_of_pearl_deepslate_ore_state_four",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.COPPER).strength(12f)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return TestItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}

