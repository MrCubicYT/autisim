
package net.mcreator.jackmod.potion;

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
		ViolentDiarrhoeaOnEffectActiveTickProcedure.execute();
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}