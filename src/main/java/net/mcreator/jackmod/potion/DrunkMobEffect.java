
package net.mcreator.jackmod.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.jackmod.procedures.DrunkOnEffectActiveTickProcedure;

public class DrunkMobEffect extends MobEffect {
	public DrunkMobEffect() {
		super(MobEffectCategory.HARMFUL, -10927568);
	}

	@Override
	public String getDescriptionId() {
		return "effect.jacksautismembodied.drunk";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DrunkOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
