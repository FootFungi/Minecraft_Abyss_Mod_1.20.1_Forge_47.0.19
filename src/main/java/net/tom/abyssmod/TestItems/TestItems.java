package net.tom.abyssmod.TestItems;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tom.abyssmod.AbyssMod;
import net.tom.abyssmod.TestItems.custom.ModArmorItem;

public class TestItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AbyssMod.MODID);

    public static final RegistryObject<Item> GLEAMINGPOWDER = ITEMS.register("gleaming_powder",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PIGGLEDYSPAWNEGG = ITEMS.register("piggledy_spawn_egg",
            () -> new Item (new Item.Properties()));

    public static final RegistryObject<Item> SHARDOFMOTHEROFPEARL = ITEMS.register("shard_of_mother_of_pearl",
            () -> new Item (new Item.Properties()));

    public static final RegistryObject<Item> MOTHEROFPEARLSHELL = ITEMS.register("mother_of_pearl_shell",
            () -> new Item (new Item.Properties()));

    public static final RegistryObject<Item> MOTHEROFPEARLSWORD = ITEMS.register("mother_of_pearl_sword",
            () -> new SwordItem(ModToolTiers.MOTHEROFPEARL, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> MOTHEROFPEARLPICKAXE = ITEMS.register("mother_of_pearl_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MOTHEROFPEARL, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> MOTHEROFPEARLAXE = ITEMS.register("mother_of_pearl_axe",
            () -> new AxeItem(ModToolTiers.MOTHEROFPEARL, 5, -3F, new Item.Properties()));
    public static final RegistryObject<Item> MOTHEROFPEARLSHOVEL = ITEMS.register("mother_of_pearl_shovel",
            () -> new ShovelItem(ModToolTiers.MOTHEROFPEARL, 1.5f, -3F, new Item.Properties()));
    public static final RegistryObject<Item> MOTHEROFPEARLHOE = ITEMS.register("mother_of_pearl_hoe",
            () -> new HoeItem(ModToolTiers.MOTHEROFPEARL, -4, 0F, new Item.Properties()));

    public static final RegistryObject<Item> MOTHEROFPEARLHELMET = ITEMS.register("mother_of_pearl_helmet",
            () -> new ModArmorItem(ModArmorMaterials.MOTHEROFPEARLSHELL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MOTHEROFPEARLCHESTPLATE = ITEMS.register("mother_of_pearl_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MOTHEROFPEARLSHELL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> MOTHEROFPEARLLEGGINGS = ITEMS.register("mother_of_pearl_leggings",
            () -> new ArmorItem(ModArmorMaterials.MOTHEROFPEARLSHELL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> MOTHEROFPEARLBOOTS = ITEMS.register("mother_of_pearl_boots",
            () -> new ArmorItem(ModArmorMaterials.MOTHEROFPEARLSHELL, ArmorItem.Type.BOOTS, new Item.Properties()));




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
