
package net.mcreator.jackmod.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.jackmod.procedures.TheBestPotionEffectEffectStartedappliedProcedure;

public class TheBestPotionEffectMobEffect extends MobEffect {
	public TheBestPotionEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13421569);
	}

	@Override
	public String getDescriptionId() {
		return "effect.jacksautismembodied.the_best_potion_effect";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		TheBestPotionEffectEffectStartedappliedProcedure.execute(entity.level());
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
