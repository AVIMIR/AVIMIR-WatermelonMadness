package io.github.AVIMIR.wmm;

import io.github.AVIMIR.wmm.block.ModBlocks;
import io.github.AVIMIR.wmm.item.ModItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(WMM.MODID)
public class WMM {
    public static final String MODID = "wmm";

    public WMM() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.MOD_ITEMS.register(bus);
        ModItems.VANILLA_ITEMS_REPLACED.register(bus);

        ModBlocks.MOD_BLOCKS.register(bus);
        ModBlocks.VANILLA_BLOCKS_REPLACED.register(bus);


        //bus.addListener(this::clientSetup);
    }




//    private void clientSetup(final FMLClientSetupEvent event) {
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PALM_DOOR.get(), RenderType.translucent());
//
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PALM_LEAVES.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PALM_SAPLING.get(), RenderType.cutout());
//
//    }














    //Mod itemGroups
    public static final CreativeModeTab WMMITEMS = new CreativeModeTab(MODID + "items") {
        @Override
        public ItemStack makeIcon() {
            return ModItems.MELON_STICK.get().getDefaultInstance();
        }
    };
   // public static final CreativeModeTab WMMFOOD = new CreativeModeTab(MODID + "food") {
   //     @Override
   //     public ItemStack makeIcon() {
   //         return ModItems.MELON_PULP.get().getDefaultInstance();
   //     }
   // };
   // public static final CreativeModeTab WMMBLOCKS = new CreativeModeTab(MODID + "blocks") {
   //     @Override
   //     public ItemStack makeIcon() {
   //         return ModItems.MELON_PULP_BLOCK.get().getDefaultInstance();
   //     }
   // };
   // public static final CreativeModeTab WMMTOOLS = new CreativeModeTab(MODID + "tools") {
   //     @Override
   //     public ItemStack makeIcon() {
   //         return ModItems.MELON_PICKAXE.get().getDefaultInstance();
   //     }
   // };


}