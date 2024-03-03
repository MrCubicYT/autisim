
package net.mcreator.jackmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BasicIngotItem extends Item {
	public BasicIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
