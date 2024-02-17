
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jackmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.jackmod.block.StopSignBlock;
import net.mcreator.jackmod.block.RoseBlock;
import net.mcreator.jackmod.block.NILLBlock;
import net.mcreator.jackmod.block.GoofyOfferingBlock;
import net.mcreator.jackmod.block.GoodGraveBlock;
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
}
