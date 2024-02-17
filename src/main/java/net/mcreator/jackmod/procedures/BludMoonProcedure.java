package net.mcreator.jackmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;

import net.mcreator.jackmod.network.JacksautismembodiedModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BludMoonProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (!(world instanceof Level _lvl0 && _lvl0.isDay())) {
			if (JacksautismembodiedModVariables.WorldVariables.get(world).didbloodcheck != 1) {
				JacksautismembodiedModVariables.WorldVariables.get(world).didbloodcheck = 1;
				JacksautismembodiedModVariables.WorldVariables.get(world).syncData(world);
				if (Math.random() < 0.1) {
					JacksautismembodiedModVariables.WorldVariables.get(world).Bloodmoon = 1;
					JacksautismembodiedModVariables.WorldVariables.get(world).syncData(world);
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Blood moon has risen"), false);
				}
			}
		} else {
			JacksautismembodiedModVariables.WorldVariables.get(world).didbloodcheck = 0;
			JacksautismembodiedModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
