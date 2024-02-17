package net.mcreator.jackmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.jackmod.network.JacksautismembodiedModVariables;

public class FleshBallOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (JacksautismembodiedModVariables.WorldVariables.get(world).Bloodmoon == 0) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
