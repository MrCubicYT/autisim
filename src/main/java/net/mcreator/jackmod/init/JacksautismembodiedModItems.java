
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jackmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.jackmod.item.UnoReverseItem;
import net.mcreator.jackmod.item.UnfilteredBottleOfPissItem;
import net.mcreator.jackmod.item.SecondChanceItem;
import net.mcreator.jackmod.item.RifleItem;
import net.mcreator.jackmod.item.PUREPISSItem;
import net.mcreator.jackmod.item.HateTrinketItem;
import net.mcreator.jackmod.item.GildedBatItem;
import net.mcreator.jackmod.item.CookedItem;
import net.mcreator.jackmod.item.CocaineItem;
import net.mcreator.jackmod.item.BigbatItem;
import net.mcreator.jackmod.item.BeefCubeItem;
import net.mcreator.jackmod.JacksautismembodiedMod;

public class JacksautismembodiedModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, JacksautismembodiedMod.MODID);
	public static final RegistryObject<Item> BAD_GRAVE = block(JacksautismembodiedModBlocks.BAD_GRAVE);
	public static final RegistryObject<Item> GOOD_GRAVE = block(JacksautismembodiedModBlocks.GOOD_GRAVE);
	public static final RegistryObject<Item> PISS_BABY_SPAWN_EGG = REGISTRY.register("piss_baby_spawn_egg", () -> new ForgeSpawnEggItem(JacksautismembodiedModEntities.PISS_BABY, -16751104, -13382401, new Item.Properties()));
	public static final RegistryObject<Item> PUREPISS = REGISTRY.register("purepiss", () -> new PUREPISSItem());
	public static final RegistryObject<Item> UNFILTERED_BOTTLE_OF_PISS = REGISTRY.register("unfiltered_bottle_of_piss", () -> new UnfilteredBottleOfPissItem());
	public static final RegistryObject<Item> KEVINS_SPAWN_EGG = REGISTRY.register("kevins_spawn_egg", () -> new ForgeSpawnEggItem(JacksautismembodiedModEntities.KEVINS, -13544911, -1, new Item.Properties()));
	public static final RegistryObject<Item> COCAINE = REGISTRY.register("cocaine", () -> new CocaineItem());
	public static final RegistryObject<Item> GOOFY_OFFERING = block(JacksautismembodiedModBlocks.GOOFY_OFFERING);
	public static final RegistryObject<Item> BIGBAT = REGISTRY.register("bigbat", () -> new BigbatItem());
	public static final RegistryObject<Item> GILDED_BAT = REGISTRY.register("gilded_bat", () -> new GildedBatItem());
	public static final RegistryObject<Item> BEEF_CUBE = REGISTRY.register("beef_cube", () -> new BeefCubeItem());
	public static final RegistryObject<Item> COOKED = REGISTRY.register("cooked", () -> new CookedItem());
	public static final RegistryObject<Item> UNO_REVERSE = REGISTRY.register("uno_reverse", () -> new UnoReverseItem());
	public static final RegistryObject<Item> RIFLE = REGISTRY.register("rifle", () -> new RifleItem());
	public static final RegistryObject<Item> HATE_TRINKET = REGISTRY.register("hate_trinket", () -> new HateTrinketItem());
	public static final RegistryObject<Item> STOP_SIGN = block(JacksautismembodiedModBlocks.STOP_SIGN);
	public static final RegistryObject<Item> SECOND_CHANCE = REGISTRY.register("second_chance", () -> new SecondChanceItem());
	public static final RegistryObject<Item> WATCHER_SPAWN_EGG = REGISTRY.register("watcher_spawn_egg", () -> new ForgeSpawnEggItem(JacksautismembodiedModEntities.WATCHER, -16777216, -1, new Item.Properties()));
	public static final RegistryObject<Item> NILL = block(JacksautismembodiedModBlocks.NILL);
	public static final RegistryObject<Item> ROSE = block(JacksautismembodiedModBlocks.ROSE);
	public static final RegistryObject<Item> ZFIGHTBLOCK = block(JacksautismembodiedModBlocks.ZFIGHTBLOCK);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
