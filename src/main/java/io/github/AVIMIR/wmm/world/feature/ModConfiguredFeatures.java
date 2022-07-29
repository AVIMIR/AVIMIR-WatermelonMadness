//package io.github.AVIMIR.wmm.world.feature;
//
//import io.github.AVIMIR.wmm.block.ModBlocks;
//import net.minecraft.core.Holder;
//import net.minecraft.data.worldgen.features.FeatureUtils;
//import net.minecraft.util.valueproviders.ConstantInt;
//import net.minecraft.world.level.block.Blocks;
//import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
//import net.minecraft.world.level.levelgen.feature.Feature;
//import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
//import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
//import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
//import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
//import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
//
//public class ModConfiguredFeatures {
//    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> PALM_TREE =
//            FeatureUtils.register("palm", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
//                    BlockStateProvider.simple(ModBlocks.PALM_LOG.get()),
//                    new StraightTrunkPlacer(5,6,3),
//                    BlockStateProvider.simple(ModBlocks.PALM_LEAVES.get()),
//                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
//                    new TwoLayersFeatureSize(1, 0, 2)).dirt(BlockStateProvider.simple(Blocks.SAND)).dirt(BlockStateProvider.simple(Blocks.RED_SAND)).build());
//}
