
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jackmod.init;

import org.checkerframework.checker.units.qual.C;
import org.checkerframework.checker.units.qual.A;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.jackmod.world.features.plants.RoseFeature;
import net.mcreator.jackmod.world.features.ERFeature;
import net.mcreator.jackmod.world.features.CreepFeature;
import net.mcreator.jackmod.world.features.CFeature;
import net.mcreator.jackmod.world.features.BFeature;
import net.mcreator.jackmod.world.features.AFeature;
import net.mcreator.jackmod.JacksautismembodiedMod;

@Mod.EventBusSubscriber
public class JacksautismembodiedModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, JacksautismembodiedMod.MODID);
	public static final RegistryObject<Feature<?>> A = REGISTRY.register("a", AFeature::new);
	public static final RegistryObject<Feature<?>> B = REGISTRY.register("b", BFeature::new);
	public static final RegistryObject<Feature<?>> C = REGISTRY.register("c", CFeature::new);
	public static final RegistryObject<Feature<?>> CREEP = REGISTRY.register("creep", CreepFeature::new);
	public static final RegistryObject<Feature<?>> ER = REGISTRY.register("er", ERFeature::new);
	public static final RegistryObject<Feature<?>> ROSE = REGISTRY.register("rose", RoseFeature::new);
}
