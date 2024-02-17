
package net.mcreator.jackmod.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.jackmod.procedures.ObesityEffectExpiresProcedure;

public class ObesityMobEffect extends MobEffect {
	public ObesityMobEffect() {
		super(MobEffectCategory.HARMFUL, -13108);
	}

	@Override
	public String getDescriptionId() {
		return "effect.jacksautismembodied.obesity";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		ObesityEffectExpiresProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
