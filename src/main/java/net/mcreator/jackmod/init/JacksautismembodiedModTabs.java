
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jackmod.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.jackmod.JacksautismembodiedMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JacksautismembodiedModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JacksautismembodiedMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(JacksautismembodiedModBlocks.BAD_GRAVE.get().asItem());
			tabData.accept(JacksautismembodiedModBlocks.GOOD_GRAVE.get().asItem());
			tabData.accept(JacksautismembodiedModBlocks.GOOFY_OFFERING.get().asItem());
			tabData.accept(JacksautismembodiedModBlocks.SPRING_PAD.get().asItem());
			tabData.accept(JacksautismembodiedModBlocks.STONE_PATH.get().asItem());
			tabData.accept(JacksautismembodiedModBlocks.TILED_SANDSTONE.get().asItem());
			tabData.accept(JacksautismembodiedModBlocks.ETCHED_SANDSTONE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(JacksautismembodiedModBlocks.ZFIGHTBLOCK.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(JacksautismembodiedModItems.PUREPISS.get());
			tabData.accept(JacksautismembodiedModItems.BIGBAT.get());
			tabData.accept(JacksautismembodiedModItems.RIFLE.get());
			tabData.accept(JacksautismembodiedModItems.WOODEN_KNIFE.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(JacksautismembodiedModItems.PISS_BABY_SPAWN_EGG.get());
			tabData.accept(JacksautismembodiedModItems.KEVINS_SPAWN_EGG.get());
			tabData.accept(JacksautismembodiedModItems.UNO_REVERSE.get());
			tabData.accept(JacksautismembodiedModItems.HATE_TRINKET.get());
			tabData.accept(JacksautismembodiedModItems.SECOND_CHANCE.get());
			tabData.accept(JacksautismembodiedModItems.WATCHER_SPAWN_EGG.get());
			tabData.accept(JacksautismembodiedModItems.KABEEM_SPAWN_EGG.get());
			tabData.accept(JacksautismembodiedModItems.RUBBER_DUCK_SPAWN_EGG.get());
			tabData.accept(JacksautismembodiedModItems.FLESH_BALL_SPAWN_EGG.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(JacksautismembodiedModItems.UNFILTERED_BOTTLE_OF_PISS.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(JacksautismembodiedModItems.GILDED_BAT.get());
			tabData.accept(JacksautismembodiedModItems.STONE_KNIFE.get());
			tabData.accept(JacksautismembodiedModItems.IRON_KNIFE.get());
			tabData.accept(JacksautismembodiedModItems.DIAMOND_KNIFE.get());
			tabData.accept(JacksautismembodiedModItems.OBSIDIAN_KNIFES.get());
			tabData.accept(JacksautismembodiedModItems.BANANA_MAN.get());
			tabData.accept(JacksautismembodiedModItems.DREAM_SWEET_IN_C_MAJOR.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(JacksautismembodiedModItems.BEEF_CUBE.get());
			tabData.accept(JacksautismembodiedModItems.COOKED.get());
			tabData.accept(JacksautismembodiedModItems.KREEM.get());
			tabData.accept(JacksautismembodiedModItems.STOMACH.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(JacksautismembodiedModBlocks.STOP_SIGN.get().asItem());
			tabData.accept(JacksautismembodiedModBlocks.ROSE.get().asItem());
		}
	}
}
