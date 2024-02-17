package net.mcreator.jackmod.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class HealthPickupPropertyValueProviderProcedure {
	public static boolean execute() {
		if (Calendar.getInstance().get(Calendar.MONTH) == 12) {
			return true;
		}
		return false;
	}
}
