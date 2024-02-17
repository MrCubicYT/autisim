
package net.mcreator.jackmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class BananaManItem extends RecordItem {
	public BananaManItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jacksautismembodied:banana")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5620);
	}
}
