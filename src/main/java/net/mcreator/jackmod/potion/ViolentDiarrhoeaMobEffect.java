
package net.mcreator.jackmod.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.jackmod.procedures.ViolentDiarrhoeaOnEffectActiveTickProcedure;

public class ViolentDiarrhoeaMobEffect extends MobEffect {
	public ViolentDiarrhoeaMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10930420);
	}

	@Override
	public String getDescriptionId() {
		return "effect.jacksautismembodied.violent_diarrhoea";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ViolentDiarrhoeaOnEffectActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
