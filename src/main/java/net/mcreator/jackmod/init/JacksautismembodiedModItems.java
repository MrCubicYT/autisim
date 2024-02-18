
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

import net.mcreator.jackmod.item.WoodenKnifeItem;
import net.mcreator.jackmod.item.UraniumItem;
import net.mcreator.jackmod.item.UnoReverseItem;
import net.mcreator.jackmod.item.UnfilteredBottleOfPissItem;
import net.mcreator.jackmod.item.TophatItem;
import net.mcreator.jackmod.item.TheSlabItem;
import net.mcreator.jackmod.item.StoneKnifeItem;
import net.mcreator.jackmod.item.StomachItem;
import net.mcreator.jackmod.item.SpleenItem;
import net.mcreator.jackmod.item.SpineItem;
import net.mcreator.jackmod.item.SecondChanceItem;
import net.mcreator.jackmod.item.RifleItem;
import net.mcreator.jackmod.item.RibItem;
import net.mcreator.jackmod.item.RealDiamondItem;
import net.mcreator.jackmod.item.PUREPISSItem;
import net.mcreator.jackmod.item.ObsidianKnifesItem;
import net.mcreator.jackmod.item.LungItem;
import net.mcreator.jackmod.item.LiverItem;
import net.mcreator.jackmod.item.KreemItem;
import net.mcreator.jackmod.item.KidneyItem;
import net.mcreator.jackmod.item.KeyItem;
import net.mcreator.jackmod.item.JackCostumeItem;
import net.mcreator.jackmod.item.IronKnifeItem;
import net.mcreator.jackmod.item.IntestineItem;
import net.mcreator.jackmod.item.HeartItem;
import net.mcreator.jackmod.item.HealthPickupItem;
import net.mcreator.jackmod.item.HateTrinketItem;
import net.mcreator.jackmod.item.GoldCoinItem;
import net.mcreator.jackmod.item.GildedBatItem;
import net.mcreator.jackmod.item.DreamSweetInCMajorItem;
import net.mcreator.jackmod.item.DiamondKnifeItem;
import net.mcreator.jackmod.item.CookedItem;
import net.mcreator.jackmod.item.CocaineItem;
import net.mcreator.jackmod.item.ChristmasItem;
import net.mcreator.jackmod.item.BigbatItem;
import net.mcreator.jackmod.item.BeefCubeItem;
import net.mcreator.jackmod.item.BananaManItem;
import net.mcreator.jackmod.item.AppendixItem;
import net.mcreator.jackmod.block.display.SpringPadDisplayItem;
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
	public static final RegistryObject<Item> HEALTH_PICKUP = REGISTRY.register("health_pickup", () -> new HealthPickupItem());
	public static final RegistryObject<Item> CHRISTMAS = REGISTRY.register("christmas", () -> new ChristmasItem());
	public static final RegistryObject<Item> KABEEM_SPAWN_EGG = REGISTRY.register("kabeem_spawn_egg", () -> new ForgeSpawnEggItem(JacksautismembodiedModEntities.KABEEM, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> SPRING_PAD = REGISTRY.register(JacksautismembodiedModBlocks.SPRING_PAD.getId().getPath(), () -> new SpringPadDisplayItem(JacksautismembodiedModBlocks.SPRING_PAD.get(), new Item.Properties()));
	public static final RegistryObject<Item> STONE_PATH = block(JacksautismembodiedModBlocks.STONE_PATH);
	public static final RegistryObject<Item> TILED_SANDSTONE = block(JacksautismembodiedModBlocks.TILED_SANDSTONE);
	public static final RegistryObject<Item> ETCHED_SANDSTONE = block(JacksautismembodiedModBlocks.ETCHED_SANDSTONE);
	public static final RegistryObject<Item> WOODEN_KNIFE = REGISTRY.register("wooden_knife", () -> new WoodenKnifeItem());
	public static final RegistryObject<Item> STONE_KNIFE = REGISTRY.register("stone_knife", () -> new StoneKnifeItem());
	public static final RegistryObject<Item> IRON_KNIFE = REGISTRY.register("iron_knife", () -> new IronKnifeItem());
	public static final RegistryObject<Item> DIAMOND_KNIFE = REGISTRY.register("diamond_knife", () -> new DiamondKnifeItem());
	public static final RegistryObject<Item> OBSIDIAN_KNIFES = REGISTRY.register("obsidian_knifes", () -> new ObsidianKnifesItem());
	public static final RegistryObject<Item> RUBBER_DUCK_SPAWN_EGG = REGISTRY.register("rubber_duck_spawn_egg", () -> new ForgeSpawnEggItem(JacksautismembodiedModEntities.RUBBER_DUCK, -2952, -29621, new Item.Properties()));
	public static final RegistryObject<Item> KREEM = REGISTRY.register("kreem", () -> new KreemItem());
	public static final RegistryObject<Item> REAL_DIAMOND = REGISTRY.register("real_diamond", () -> new RealDiamondItem());
	public static final RegistryObject<Item> URANIUM = REGISTRY.register("uranium", () -> new UraniumItem());
	public static final RegistryObject<Item> FLESH_BALL_SPAWN_EGG = REGISTRY.register("flesh_ball_spawn_egg", () -> new ForgeSpawnEggItem(JacksautismembodiedModEntities.FLESH_BALL, -52429, -6750208, new Item.Properties()));
	public static final RegistryObject<Item> STOMACH = REGISTRY.register("stomach", () -> new StomachItem());
	public static final RegistryObject<Item> LIVER = REGISTRY.register("liver", () -> new LiverItem());
	public static final RegistryObject<Item> KIDNEY = REGISTRY.register("kidney", () -> new KidneyItem());
	public static final RegistryObject<Item> LUNG = REGISTRY.register("lung", () -> new LungItem());
	public static final RegistryObject<Item> INTESTINE = REGISTRY.register("intestine", () -> new IntestineItem());
	public static final RegistryObject<Item> APPENDIX = REGISTRY.register("appendix", () -> new AppendixItem());
	public static final RegistryObject<Item> HEART = REGISTRY.register("heart", () -> new HeartItem());
	public static final RegistryObject<Item> SPINE = REGISTRY.register("spine", () -> new SpineItem());
	public static final RegistryObject<Item> SPLEEN = REGISTRY.register("spleen", () -> new SpleenItem());
	public static final RegistryObject<Item> RIB = REGISTRY.register("rib", () -> new RibItem());
	public static final RegistryObject<Item> BANANA_MAN = REGISTRY.register("banana_man", () -> new BananaManItem());
	public static final RegistryObject<Item> DREAM_SWEET_IN_C_MAJOR = REGISTRY.register("dream_sweet_in_c_major", () -> new DreamSweetInCMajorItem());
	public static final RegistryObject<Item> SPRUCE_CRATE = block(JacksautismembodiedModBlocks.SPRUCE_CRATE);
	public static final RegistryObject<Item> JACK_COSTUME_HELMET = REGISTRY.register("jack_costume_helmet", () -> new JackCostumeItem.Helmet());
	public static final RegistryObject<Item> JACK_COSTUME_LEGGINGS = REGISTRY.register("jack_costume_leggings", () -> new JackCostumeItem.Leggings());
	public static final RegistryObject<Item> KEY = REGISTRY.register("key", () -> new KeyItem());
	public static final RegistryObject<Item> THE_SLAB = REGISTRY.register("the_slab", () -> new TheSlabItem());
	public static final RegistryObject<Item> TOPHAT_HELMET = REGISTRY.register("tophat_helmet", () -> new TophatItem.Helmet());
	public static final RegistryObject<Item> GOLD_COIN = REGISTRY.register("gold_coin", () -> new GoldCoinItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
