package net.mcreator.jackmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.jackmod.network.JacksautismembodiedModVariables;
import net.mcreator.jackmod.JacksautismembodiedMod;

public class ObesityOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double shmu = 0;
		shmu = (entity.getCapability(JacksautismembodiedModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JacksautismembodiedModVariables.PlayerVariables())).ObeaseLevel;
		{
			double _setval = 1;
			entity.getCapability(JacksautismembodiedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ObeaseChecker = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (world instanceof ServerLevel _level) {
			System.out.println(entity.getStringUUID());
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(0, 0, 0), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"scale add pehkui:width shmu " + entity.getStringUUID());
		}
		JacksautismembodiedMod.queueServerWork(100, () -> {
			if (world instanceof ServerLevel _level) {
				System.out.println(entity.getStringUUID());
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(0, 0, 0), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"scale reset " + entity.getStringUUID());
			}
		});
	}
}
