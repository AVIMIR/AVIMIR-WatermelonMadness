package io.github.AVIMIR.wmm.item;

import com.google.common.collect.ImmutableMap;
import io.github.AVIMIR.wmm.block.ModBlocks;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropperBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraftforge.common.ToolActions;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.internal.TextComponentMessageFormatHandler;
import net.minecraftforge.registries.RegistryObject;
import org.apache.http.client.entity.EntityBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import static io.github.AVIMIR.wmm.block.ModBlocks.MOD_BLOCKS;
import static io.github.AVIMIR.wmm.block.ModBlocks.VANILLA_BLOCKS_REPLACED;


public class KnifeItem extends Item {

    public KnifeItem(Properties properties) {
        super(properties);
    }








    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        Player player = context.getPlayer();
        BlockState blockState = level.getBlockState(blockPos);
        ItemStack itemstack = context.getItemInHand();

        if (isValuableBLock(blockState.getBlock())) {
            stripAMelon(context);
            if (player != null) {
                itemstack.hurtAndBreak(1, player, (p_150686_) -> {
                    p_150686_.broadcastBreakEvent(context.getHand());
                });


            }
            return InteractionResult.sidedSuccess(level.isClientSide);
        }
        else {
            return InteractionResult.PASS;
        }
    }

    private void stripAMelon(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        BlockState blockState = ModBlocks.MELON_PULP_BLOCK.get().defaultBlockState();
        Player player = context.getPlayer();
        level.setBlock(blockPos, blockState, 11);
        ItemStack crusts = new ItemStack(ModItems.MELON_CRUST.get(), 8);
        ItemEntity crusts_pack = new ItemEntity(level, blockPos.getX(), blockPos.getY(), blockPos.getZ(), crusts);
        level.addFreshEntity(crusts_pack);


    }


    private boolean isValuableBLock(Block block) {
        return block == ModBlocks.NEW_MELON.get();
    }
    public boolean setBlock(BlockPos blockPos, BlockState blockState, int i) {
        return this.setBlock(blockPos, blockState, i);
    }
}
