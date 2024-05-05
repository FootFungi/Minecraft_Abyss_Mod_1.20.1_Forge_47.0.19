package net.tom.abyssmod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.tom.abyssmod.AbyssMod;

public class ModTags {

    public static class Blocks{
        public static final TagKey<Block> NEEDS_MOTHER_OF_PEARL_TOOL = tag("needs_mother_of_pearl_tool");

        public static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(AbyssMod.MODID, name));
        }
    }

    public static class Items{
        //public static final TagKey<Item> EXAMPLE = tag(EXAMPLETAG);

        public static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(AbyssMod.MODID, name));
        }
    }
}
