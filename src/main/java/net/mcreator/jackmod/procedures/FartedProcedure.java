package net.mcreator.jackmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.jackmod.network.JacksautismembodiedModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FartedProcedure {
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
		{
			double _setval = (entity.getCapability(JacksautismembodiedModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JacksautismembodiedModVariables.PlayerVariables())).ObeaseLevel + 1;
			entity.getCapability(JacksautismembodiedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ObeaseLevel = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
