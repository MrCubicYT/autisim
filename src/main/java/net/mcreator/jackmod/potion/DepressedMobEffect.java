
package net.mcreator.jackmod.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.jackmod.procedures.DepressedOnEffectActiveTickProcedure;
import net.mcreator.jackmod.procedures.DepressedEffectExpiresProcedure;

public class DepressedMobEffect extends MobEffect {
	public DepressedMobEffect() {
		super(MobEffectCategory.HARMFUL, -6786970);
	}

	@Override
	public String getDescriptionId() {
		return "effect.jacksautismembodied.depressed";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DepressedOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		DepressedEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
