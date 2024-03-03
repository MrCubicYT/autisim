
package net.mcreator.jackmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PlankItem extends Item {
	public PlankItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
