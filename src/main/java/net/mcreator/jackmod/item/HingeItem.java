
package net.mcreator.jackmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HingeItem extends Item {
	public HingeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
