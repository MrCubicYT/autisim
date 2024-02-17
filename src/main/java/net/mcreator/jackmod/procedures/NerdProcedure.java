package net.mcreator.jackmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.jackmod.network.JacksautismembodiedModVariables;
import net.mcreator.jackmod.init.JacksautismembodiedModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class NerdProcedure {
	@SubscribeEvent
	public static void onUseItemFinish(LivingEntityUseItemEvent.Finish event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BUCKET) {
			if ((entity.getCapability(JacksautismembodiedModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JacksautismembodiedModVariables.PlayerVariables())).lactated == 1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(JacksautismembodiedModMobEffects.VIOLENT_DIARRHOEA.get(), 9600, 1, false, false));
			} else if ((entity.getCapability(JacksautismembodiedModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JacksautismembodiedModVariables.PlayerVariables())).lactated == 2) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(JacksautismembodiedModMobEffects.DEADLY_DIARRHOEA.get(), 9600, 1, false, false));
			}
		}
	}
}
