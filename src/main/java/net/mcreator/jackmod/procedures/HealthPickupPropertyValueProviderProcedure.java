package net.mcreator.jackmod.procedures;

import java.util.Calendar;

public class HealthPickupPropertyValueProviderProcedure {
	public static boolean execute() {
		if (Calendar.getInstance().get(Calendar.MONTH) == 12) {
			return true;
		}
		return false;
	}
}
