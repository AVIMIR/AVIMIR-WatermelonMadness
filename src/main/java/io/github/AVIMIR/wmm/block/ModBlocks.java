package io.github.AVIMIR.wmm.block;

import io.github.AVIMIR.wmm.WMM;
//import io.github.AVIMIR.wmm.world.feature.tree.PalmTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModBlocks {
    public static final DeferredRegister<Block> MOD_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, WMM.MODID);
    public static final DeferredRegister<Block> VANILLA_BLOCKS_REPLACED = DeferredRegister.create(ForgeRegistries.BLOCKS, "minecraft");


    //Wooden blocks
    //public static final RegistryObject<Block> PALM_LOG = MOD_BLOCKS.register("palm_log",
    //        () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    //public static final RegistryObject<Block> PALM_WOOD = MOD_BLOCKS.register("palm_wood",
    //        () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    //public static final RegistryObject<Block> STRIPPED_PALM_LOG = MOD_BLOCKS.register("stripped_palm_log",
    //        () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    //public static final RegistryObject<Block> STRIPPED_PALM_WOOD = MOD_BLOCKS.register("stripped_palm_wood",
    //        () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    //public static final RegistryObject<Block> PALM_LEAVES = MOD_BLOCKS.register("palm_leaves",
            //() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    //public static final RegistryObject<Block> PALM_SAPLING = MOD_BLOCKS.register("palm_sapling",
            //() -> new ModSaplingBlock(new PalmTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    //Craftable wooden blocks
    //public static final RegistryObject<Block> PALM_PLANKS = MOD_BLOCKS.register("palm_planks",
    //        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    //public static final RegistryObject<Block> PALM_DOOR = MOD_BLOCKS.register("palm_door",
    //        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)));

    //public static final RegistryObject<Block> PALM_PRESSURE_PLATE = MOD_BLOCKS.register("palm_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)));



    //Food blocks
    //public static final RegistryObject<Block> BANANA_BLOCK = MOD_BLOCKS.register("banana_block",
    //        () -> new Block(BlockBehaviour.Properties.of(Material.VEGETABLE).strength(0.2F, 0.1F).sound(SoundType.SLIME_BLOCK)));
    public static final RegistryObject<Block> MELON_PULP_BLOCK = MOD_BLOCKS.register("melon_pulp_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.VEGETABLE).strength(0.2F, 0.1F).sound(SoundType.SLIME_BLOCK)));


    //Others
    public static final RegistryObject<Block> NEW_MELON = VANILLA_BLOCKS_REPLACED.register("melon",
            () -> new Block(BlockBehaviour.Properties.of(Material.VEGETABLE).strength(0.2F, 0.1F).sound(SoundType.WOOD)));
}
