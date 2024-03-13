
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jackmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.jackmod.block.ZfightblockBlock;
import net.mcreator.jackmod.block.TiledSandstoneBlock;
import net.mcreator.jackmod.block.StopSignBlock;
import net.mcreator.jackmod.block.StonePathBlock;
import net.mcreator.jackmod.block.SpruceCrateBlock;
import net.mcreator.jackmod.block.SpringPadBlock;
import net.mcreator.jackmod.block.RoseBlock;
import net.mcreator.jackmod.block.NILLBlock;
import net.mcreator.jackmod.block.ManequinBlock;
import net.mcreator.jackmod.block.GoofyOfferingBlock;
import net.mcreator.jackmod.block.GoodGraveBlock;
import net.mcreator.jackmod.block.FembombBlock;
import net.mcreator.jackmod.block.EtchedSandstoneBlock;
import net.mcreator.jackmod.block.CobaltOreBlock;
import net.mcreator.jackmod.block.CobaltBlockBlock;
import net.mcreator.jackmod.block.BadGraveBlock;
import net.mcreator.jackmod.JacksautismembodiedMod;

public class JacksautismembodiedModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, JacksautismembodiedMod.MODID);
	public static final RegistryObject<Block> BAD_GRAVE = REGISTRY.register("bad_grave", () -> new BadGraveBlock());
	public static final RegistryObject<Block> GOOD_GRAVE = REGISTRY.register("good_grave", () -> new GoodGraveBlock());
	public static final RegistryObject<Block> GOOFY_OFFERING = REGISTRY.register("goofy_offering", () -> new GoofyOfferingBlock());
	public static final RegistryObject<Block> STOP_SIGN = REGISTRY.register("stop_sign", () -> new StopSignBlock());
	public static final RegistryObject<Block> NILL = REGISTRY.register("nill", () -> new NILLBlock());
	public static final RegistryObject<Block> ROSE = REGISTRY.register("rose", () -> new RoseBlock());
	public static final RegistryObject<Block> ZFIGHTBLOCK = REGISTRY.register("zfightblock", () -> new ZfightblockBlock());
	public static final RegistryObject<Block> SPRING_PAD = REGISTRY.register("spring_pad", () -> new SpringPadBlock());
	public static final RegistryObject<Block> STONE_PATH = REGISTRY.register("stone_path", () -> new StonePathBlock());
	public static final RegistryObject<Block> TILED_SANDSTONE = REGISTRY.register("tiled_sandstone", () -> new TiledSandstoneBlock());
	public static final RegistryObject<Block> ETCHED_SANDSTONE = REGISTRY.register("etched_sandstone", () -> new EtchedSandstoneBlock());
	public static final RegistryObject<Block> SPRUCE_CRATE = REGISTRY.register("spruce_crate", () -> new SpruceCrateBlock());
	public static final RegistryObject<Block> COBALT_ORE = REGISTRY.register("cobalt_ore", () -> new CobaltOreBlock());
	public static final RegistryObject<Block> COBALT_BLOCK = REGISTRY.register("cobalt_block", () -> new CobaltBlockBlock());
	public static final RegistryObject<Block> MANEQUIN = REGISTRY.register("manequin", () -> new ManequinBlock());
	public static final RegistryObject<Block> FEMBOMB = REGISTRY.register("fembomb", () -> new FembombBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			ZfightblockBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			ZfightblockBlock.itemColorLoad(event);
		}
	}
}
