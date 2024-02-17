package net.mcreator.jackmod.procedures;

import net.minecraft.world.entity.monster.Silverfish;
import net.minecraft.world.entity.monster.Endermite;
import net.minecraft.world.entity.Entity;

import net.mcreator.jackmod.entity.PissBabyEntity;
import net.mcreator.jackmod.entity.KevinsEntity;

public class IsItPissProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof PissBabyEntity || entity instanceof Silverfish || entity instanceof KevinsEntity || entity instanceof Endermite) {
			return false;
		}
		return true;
	}
}
