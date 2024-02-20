package net.mcreator.jackmod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.jackmod.init.JacksautismembodiedModItems;

public class PunDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == JacksautismembodiedModItems.JACK_COSTUME_HELMET.get()) {
			return true;
		}
		return false;
	}
}
