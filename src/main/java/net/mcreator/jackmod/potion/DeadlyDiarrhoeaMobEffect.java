
package net.mcreator.jackmod.potion;

public class DeadlyDiarrhoeaMobEffect extends MobEffect {
	public DeadlyDiarrhoeaMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10930420);
	}

	@Override
	public String getDescriptionId() {
		return "effect.jacksautismembodied.deadly_diarrhoea";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ViolentDiarrhoeaOnEffectActiveTickProcedure.execute();
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}