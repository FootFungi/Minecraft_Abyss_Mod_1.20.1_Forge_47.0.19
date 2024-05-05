package net.tom.abyssmod.datagen;

import com.mojang.authlib.minecraft.client.MinecraftClient;
import net.minecraft.client.Minecraft;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.tom.abyssmod.AbyssMod;
import net.tom.abyssmod.TestItems.TestItems;
import net.tom.abyssmod.block.ModBlocks;
import net.tom.abyssmod.util.ModTags;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> SMELTABLES = List.of(ModBlocks.SHIMMERINGSTONE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        //oreBlasting(pRecipeOutput, SMELTABLES, RecipeCategory.MISC, TestItems.GLEAMINGPOWDER.get(), 3f, 200, "gleaming_powder");
        //oreSmelting(pWriter, SMELTABLES, RecipeCategory.MISC, TestItems.GLEAMINGPOWDER.get(), 3f, 100, "gleaming_powder");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TestItems.MOTHEROFPEARLSHELL.get())
                .pattern("## ")
                .pattern("## ")
                .pattern("   ")
                .define('#', TestItems.SHARDOFMOTHEROFPEARL.get())
                .unlockedBy(getHasName(TestItems.SHARDOFMOTHEROFPEARL.get()), has(TestItems.SHARDOFMOTHEROFPEARL.get()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TestItems.MOTHEROFPEARLHELMET.get())
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .define('#', TestItems.MOTHEROFPEARLSHELL.get())
                .unlockedBy(getHasName(TestItems.MOTHEROFPEARLSHELL.get()), has(TestItems.MOTHEROFPEARLSHELL.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TestItems.MOTHEROFPEARLCHESTPLATE.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', TestItems.MOTHEROFPEARLSHELL.get())
                .unlockedBy(getHasName(TestItems.MOTHEROFPEARLSHELL.get()), has(TestItems.MOTHEROFPEARLSHELL.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TestItems.MOTHEROFPEARLLEGGINGS.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', TestItems.MOTHEROFPEARLSHELL.get())
                .unlockedBy(getHasName(TestItems.MOTHEROFPEARLSHELL.get()), has(TestItems.MOTHEROFPEARLSHELL.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TestItems.MOTHEROFPEARLBOOTS.get())
                .pattern("# #")
                .pattern("# #")
                .pattern("   ")
                .define('#', TestItems.MOTHEROFPEARLSHELL.get())
                .unlockedBy(getHasName(TestItems.MOTHEROFPEARLSHELL.get()), has(TestItems.MOTHEROFPEARLSHELL.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TestItems.MOTHEROFPEARLAXE.get())
                .pattern("## ")
                .pattern("#I ")
                .pattern(" I ")
                .define('#', TestItems.MOTHEROFPEARLSHELL.get())
                .define('I', Items.STICK)
                .unlockedBy(getHasName(TestItems.MOTHEROFPEARLSHELL.get()), has(TestItems.MOTHEROFPEARLSHELL.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TestItems.MOTHEROFPEARLSHOVEL.get())
                .pattern(" # ")
                .pattern(" I ")
                .pattern(" I ")
                .define('#', TestItems.MOTHEROFPEARLSHELL.get())
                .define('I', Items.STICK)
                .unlockedBy(getHasName(TestItems.MOTHEROFPEARLSHELL.get()), has(TestItems.MOTHEROFPEARLSHELL.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TestItems.MOTHEROFPEARLSWORD.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" I ")
                .define('#', TestItems.MOTHEROFPEARLSHELL.get())
                .define('I', Items.STICK)
                .unlockedBy(getHasName(TestItems.MOTHEROFPEARLSHELL.get()), has(TestItems.MOTHEROFPEARLSHELL.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TestItems.MOTHEROFPEARLPICKAXE.get())
                .pattern("###")
                .pattern(" I ")
                .pattern(" I ")
                .define('#', TestItems.MOTHEROFPEARLSHELL.get())
                .define('I', Items.STICK)
                .unlockedBy(getHasName(TestItems.MOTHEROFPEARLSHELL.get()), has(TestItems.MOTHEROFPEARLSHELL.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, TestItems.MOTHEROFPEARLHOE.get())
                .pattern("## ")
                .pattern(" I ")
                .pattern(" I ")
                .define('#', TestItems.MOTHEROFPEARLSHELL.get())
                .define('I', Items.STICK)
                .unlockedBy(getHasName(TestItems.MOTHEROFPEARLSHELL.get()), has(TestItems.MOTHEROFPEARLSHELL.get()))
                .save(pWriter);


        //ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, TestItems.GLEAMINGPOWDER.get(), 9)
        //        .requires(ModBlocks.SHIMMERINGSTONE.get())
        //        .unlockedBy(getHasName(ModBlocks.SHIMMERINGSTONE.get()), has(ModBlocks.SHIMMERINGSTONE.get()))
        //        .save(pRecipeOutput);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, AbyssMod.MODID + ";" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}