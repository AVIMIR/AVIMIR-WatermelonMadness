package io.github.AVIMIR.wmm.item;

import io.github.AVIMIR.wmm.WMM;
import io.github.AVIMIR.wmm.block.ModBlocks;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;

import net.minecraftforge.event.RegisterGameTestsEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> MOD_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WMM.MODID);
    public static final DeferredRegister<Item> VANILLA_ITEMS_REPLACED = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    //Food
    //public static final RegistryObject<Item> BANANA = MOD_ITEMS.register("banana",
    //        () -> new Item(new Item.Properties().food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).build()).tab(WMM.WMMFOOD)));
    //public static final RegistryObject<Item> CREEPERS_PANCAKE = MOD_ITEMS.register("creepers_pancake",
    //        () -> new Item(new Item.Properties().food((new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).effect(() -> (new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2400, 1)), 1.0F).build()).tab(WMM.WMMFOOD)));
    public static final RegistryObject<Item> MELON_PULP = MOD_ITEMS.register("melon_pulp",
            () -> new Item(new Item.Properties().food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.3F).build()).tab(WMM.WMMITEMS)));



    //Items
    public static final RegistryObject<Item> MELON_STICK = MOD_ITEMS.register("melon_stick",
            () -> new Item(new Item.Properties().tab(WMM.WMMITEMS)));
    public static final RegistryObject<Item> MELON_CRUST = MOD_ITEMS.register("melon_crust",
            () -> new Item(new Item.Properties().tab(WMM.WMMITEMS)));




    //Tools
    public static final RegistryObject<Item> KNIFE = MOD_ITEMS.register("knife",
            () -> new KnifeItem(new Item.Properties().stacksTo(1).defaultDurability(500).tab(WMM.WMMITEMS)));
    public static final RegistryObject<Item> MELON_SWORD = MOD_ITEMS.register("melon_sword",
            () -> new SwordItem(ModTiers.MELON, 2, -2.0F, new Item.Properties().food((new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build())).tab(WMM.WMMITEMS)));
    public static final RegistryObject<Item> MELON_PICKAXE = MOD_ITEMS.register("melon_pickaxe",
            () -> new PickaxeItem(ModTiers.MELON, 1, -2.0F, new Item.Properties().food((new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build())).tab(WMM.WMMITEMS)));
    public static final RegistryObject<Item> MELON_AXE = MOD_ITEMS.register("melon_axe",
            () -> new AxeItem(ModTiers.MELON, 4, -2.0F, new Item.Properties().food((new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build())).tab(WMM.WMMITEMS)));
    public static final RegistryObject<Item> MELON_HOE = MOD_ITEMS.register("melon_hoe",
            () -> new HoeItem(ModTiers.MELON, 0, 0F, new Item.Properties().food((new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build())).tab(WMM.WMMITEMS)));
    public static final RegistryObject<Item> MELON_SHOVEL = MOD_ITEMS.register("melon_shovel",
            () -> new ShovelItem(ModTiers.MELON, 2, -2.0F, new Item.Properties().food((new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build())).tab(WMM.WMMITEMS)));


    //Armor
    public static final RegistryObject<ArmorItem> MELON_HELMET = MOD_ITEMS.register("melon_helmet",
            () -> new ArmorItem(ModArmorMaterials.MELON_CRUST, EquipmentSlot.HEAD, new Item.Properties().tab(WMM.WMMITEMS)));
    public static final RegistryObject<ArmorItem> MELON_CHESTPLATE = MOD_ITEMS.register("melon_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MELON_CRUST, EquipmentSlot.CHEST, new Item.Properties().tab(WMM.WMMITEMS)));
    public static final RegistryObject<ArmorItem> MELON_LEGGINGS = MOD_ITEMS.register("melon_leggings",
            () -> new ArmorItem(ModArmorMaterials.MELON_CRUST, EquipmentSlot.LEGS, new Item.Properties().tab(WMM.WMMITEMS)));
    public static final RegistryObject<ArmorItem> MELON_BOOTS = MOD_ITEMS.register("melon_boots",
            () -> new ArmorItem(ModArmorMaterials.MELON_CRUST, EquipmentSlot.FEET, new Item.Properties().tab(WMM.WMMITEMS)));




    //Block_items
    public static final RegistryObject<BlockItem> NEW_MELON = VANILLA_ITEMS_REPLACED.register("melon",
            () -> new BlockItem(ModBlocks.NEW_MELON.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));



    //public static final RegistryObject<BlockItem> BANANA_BLOCK = MOD_ITEMS.register("banana_block",
    //        () -> new BlockItem(ModBlocks.BANANA_BLOCK.get(), new Item.Properties().food((new FoodProperties.Builder()).nutrition(16).saturationMod(2.7F).build()).tab(WMM.WMMBLOCKS)));
    public static final RegistryObject<BlockItem> MELON_PULP_BLOCK = MOD_ITEMS.register("melon_pulp_block",
            () -> new BlockItem(ModBlocks.MELON_PULP_BLOCK.get(), new Item.Properties().food((new FoodProperties.Builder()).nutrition(16).saturationMod(2.7F).build()).tab(WMM.WMMITEMS)));




    //public static final RegistryObject<BlockItem> PALM_LOG = MOD_ITEMS.register("palm_log",
    //        () -> new BlockItem(ModBlocks.PALM_LOG.get(), new Item.Properties().tab(WMM.WMMBLOCKS)));
    //public static final RegistryObject<BlockItem> PALM_WOOD = MOD_ITEMS.register("palm_wood",
    //        () -> new BlockItem(ModBlocks.PALM_WOOD.get(), new Item.Properties().tab(WMM.WMMBLOCKS)));
    //public static final RegistryObject<BlockItem> STRIPPED_PALM_LOG = MOD_ITEMS.register("stripped_palm_log",
    //        () -> new BlockItem(ModBlocks.STRIPPED_PALM_LOG.get(), new Item.Properties().tab(WMM.WMMBLOCKS)));
    //public static final RegistryObject<BlockItem> STRIPPED_PALM_WOOD = MOD_ITEMS.register("stripped_palm_wood",
    //        () -> new BlockItem(ModBlocks.STRIPPED_PALM_WOOD.get(), new Item.Properties().tab(WMM.WMMBLOCKS)));
    //public static final RegistryObject<BlockItem> PALM_PLANKS = MOD_ITEMS.register("palm_planks",
    //        () -> new BlockItem(ModBlocks.PALM_PLANKS.get(), new Item.Properties().tab(WMM.WMMBLOCKS)));
    //public static final RegistryObject<BlockItem> PALM_DOOR = MOD_ITEMS.register("palm_door",
    //        () -> new BlockItem(ModBlocks.PALM_DOOR.get(), new Item.Properties().tab(WMM.WMMBLOCKS)));

    //public static final RegistryObject<BlockItem> PALM_SAPLING = MOD_ITEMS.register("palm_sapling",
    //        () -> new BlockItem(ModBlocks.PALM_SAPLING.get(), new Item.Properties().tab(WMM.WMMBLOCKS)));
    //public static final RegistryObject<BlockItem> PALM_LEAVES = MOD_ITEMS.register("palm_leaves",
    //        () -> new BlockItem(ModBlocks.PALM_LEAVES.get(), new Item.Properties().tab(WMM.WMMBLOCKS)));

}
