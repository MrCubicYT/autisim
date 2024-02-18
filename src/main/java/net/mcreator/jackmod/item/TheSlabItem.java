
package net.mcreator.jackmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.jackmod.procedures.TheSlabItemInInventoryTickProcedure;

public class TheSlabItem extends Item {
	public TheSlabItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		TheSlabItemInInventoryTickProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), itemstack);
	}
}
