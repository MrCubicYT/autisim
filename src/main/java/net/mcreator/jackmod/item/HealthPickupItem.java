
package net.mcreator.jackmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.jackmod.procedures.HealthPickupItemInInventoryTickProcedure;

public class HealthPickupItem extends Item {
	public HealthPickupItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		HealthPickupItemInInventoryTickProcedure.execute(entity, itemstack);
	}
}
