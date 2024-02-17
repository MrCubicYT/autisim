package net.mcreator.jackmod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.jackmod.init.JacksautismembodiedModMobEffects;

public class KreemItemInInventoryTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(JacksautismembodiedModMobEffects.DEADLY_DIARRHOEA.get(), 100, 1, false, false));
		itemstack.shrink(1);
	}
}
