
package net.mcreator.jackmod.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.jackmod.procedures.GayOnEffectActiveTickProcedure;
import net.mcreator.jackmod.procedures.GayEffectStartedappliedProcedure;
import net.mcreator.jackmod.procedures.GayEffectExpiresProcedure;

public class GayMobEffect extends MobEffect {
	public GayMobEffect() {
		super(MobEffectCategory.HARMFUL, -6736897);
	}

	@Override
	public String getDescriptionId() {
		return "effect.jacksautismembodied.gay";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		GayEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		GayOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		GayEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
