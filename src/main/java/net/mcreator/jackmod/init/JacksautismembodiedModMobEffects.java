
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jackmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.jackmod.potion.ViolentDiarrhoeaMobEffect;
import net.mcreator.jackmod.potion.ObesityMobEffect;
import net.mcreator.jackmod.potion.GayMobEffect;
import net.mcreator.jackmod.potion.DepressedMobEffect;
import net.mcreator.jackmod.potion.DeadlyDiarrhoeaMobEffect;
import net.mcreator.jackmod.potion.BleedingMobEffect;
import net.mcreator.jackmod.JacksautismembodiedMod;

public class JacksautismembodiedModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, JacksautismembodiedMod.MODID);
	public static final RegistryObject<MobEffect> DEPRESSED = REGISTRY.register("depressed", () -> new DepressedMobEffect());
	public static final RegistryObject<MobEffect> GAY = REGISTRY.register("gay", () -> new GayMobEffect());
	public static final RegistryObject<MobEffect> OBESITY = REGISTRY.register("obesity", () -> new ObesityMobEffect());
	public static final RegistryObject<MobEffect> BLEEDING = REGISTRY.register("bleeding", () -> new BleedingMobEffect());
	public static final RegistryObject<MobEffect> VIOLENT_DIARRHOEA = REGISTRY.register("violent_diarrhoea", () -> new ViolentDiarrhoeaMobEffect());
	public static final RegistryObject<MobEffect> DEADLY_DIARRHOEA = REGISTRY.register("deadly_diarrhoea", () -> new DeadlyDiarrhoeaMobEffect());
}
