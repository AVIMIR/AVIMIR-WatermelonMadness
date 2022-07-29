package io.github.AVIMIR.wmm.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier MELON = new ForgeTier(1, 1561, 8.0F, 3.0F, 10, BlockTags.NEEDS_STONE_TOOL, () -> {
        return Ingredient.of(Items.MELON_SLICE);
    });
}
