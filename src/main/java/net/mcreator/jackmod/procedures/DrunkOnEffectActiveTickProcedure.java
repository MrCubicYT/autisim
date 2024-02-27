package net.mcreator.jackmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class DrunkOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.3) {
			entity.setDeltaMovement(new Vec3(0.5, 0, 0));
		} else if (Math.random() < 0.3) {
			entity.setDeltaMovement(new Vec3(0, 0, 0.5));
		}
	}
}
