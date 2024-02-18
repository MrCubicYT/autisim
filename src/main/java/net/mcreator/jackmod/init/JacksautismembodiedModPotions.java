
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jackmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.jackmod.JacksautismembodiedMod;

public class JacksautismembodiedModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, JacksautismembodiedMod.MODID);
	public static final RegistryObject<Potion> BOTTLE_OF_PISS = REGISTRY.register("bottle_of_piss",
			() -> new Potion(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 1600, 0, false, true), new MobEffectInstance(MobEffects.CONFUSION, 1600, 0, false, true), new MobEffectInstance(MobEffects.DARKNESS, 600, 0, false, true)));
	public static final RegistryObject<Potion> THE_BEST_POTION = REGISTRY.register("the_best_potion", () -> new Potion(new MobEffectInstance(JacksautismembodiedModMobEffects.THE_BEST_POTION_EFFECT.get(), 3600, 0, false, true)));
}
