package net.mcreator.jackmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.jackmod.network.JacksautismembodiedModVariables;

public class GayEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 1;
			entity.getCapability(JacksautismembodiedModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.isgay = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
