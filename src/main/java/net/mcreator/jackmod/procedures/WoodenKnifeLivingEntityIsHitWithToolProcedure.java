package net.mcreator.jackmod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.jackmod.init.JacksautismembodiedModMobEffects;

public class WoodenKnifeLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(JacksautismembodiedModMobEffects.BLEEDING.get(), 2600, 1, false, false));
	}
}
