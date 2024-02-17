
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jackmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.jackmod.JacksautismembodiedMod;

public class JacksautismembodiedModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, JacksautismembodiedMod.MODID);
	public static final RegistryObject<SoundEvent> DGRAVE = REGISTRY.register("dgrave", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("jacksautismembodied", "dgrave")));
	public static final RegistryObject<SoundEvent> PEEHURT = REGISTRY.register("peehurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("jacksautismembodied", "peehurt")));
	public static final RegistryObject<SoundEvent> PEE = REGISTRY.register("pee", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("jacksautismembodied", "pee")));
	public static final RegistryObject<SoundEvent> DED = REGISTRY.register("ded", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("jacksautismembodied", "ded")));
	public static final RegistryObject<SoundEvent> DIE = REGISTRY.register("die", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("jacksautismembodied", "die")));
	public static final RegistryObject<SoundEvent> KEVINS = REGISTRY.register("kevins", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("jacksautismembodied", "kevins")));
	public static final RegistryObject<SoundEvent> TOOLS_THICCBAT_HIT = REGISTRY.register("tools.thiccbat.hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("jacksautismembodied", "tools.thiccbat.hit")));
	public static final RegistryObject<SoundEvent> SHOOT = REGISTRY.register("shoot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("jacksautismembodied", "shoot")));
}
