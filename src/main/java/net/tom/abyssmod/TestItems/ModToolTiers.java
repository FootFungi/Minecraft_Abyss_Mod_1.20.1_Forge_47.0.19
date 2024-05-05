package net.tom.abyssmod.TestItems;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.tom.abyssmod.AbyssMod;
import net.tom.abyssmod.util.ModTags;

import java.util.List;

public class ModToolTiers {

    public static Tier MOTHEROFPEARL = TierSortingRegistry.registerTier(
            new ForgeTier(4, 2031, 9.0F, 4.0F, 15,
                    ModTags.Blocks.NEEDS_MOTHER_OF_PEARL_TOOL, () -> Ingredient.of(TestItems.MOTHEROFPEARLSHELL.get())),
            new ResourceLocation(AbyssMod.MODID, "mother_of_pearl_shell"), List.of(Tiers.NETHERITE), List.of());
}
