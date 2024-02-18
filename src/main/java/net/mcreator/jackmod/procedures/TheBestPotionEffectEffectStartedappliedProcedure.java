package net.mcreator.jackmod.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;

public class TheBestPotionEffectEffectStartedappliedProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide() && world.getServer() != null)
			ServerLifecycleHooks.getCurrentServer().stopServer();
	}
}
