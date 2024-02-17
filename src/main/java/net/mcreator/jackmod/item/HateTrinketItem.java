
package net.mcreator.jackmod.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.jackmod.procedures.TrinketOfHateWhileBaubleIsEquippedTickProcedure;

public class HateTrinketItem extends Item implements ICurioItem {
	public HateTrinketItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		TrinketOfHateWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity());
	}
}
