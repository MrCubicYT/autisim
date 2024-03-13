
package net.mcreator.jackmod.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.jackmod.procedures.FemEffectStartedappliedProcedure;
import net.mcreator.jackmod.procedures.FemEffectExpiresProcedure;

public class FemMobEffect extends MobEffect {
	public FemMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -39169);
	}

	@Override
	public String getDescriptionId() {
		return "effect.jacksautismembodied.fem";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		FemEffectStartedappliedProcedure.execute();
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		FemEffectExpiresProcedure.execute();
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
