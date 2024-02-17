
package net.mcreator.jackmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class DreamSweetInCMajorItem extends RecordItem {
	public DreamSweetInCMajorItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jacksautismembodied:dream")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 8400);
	}
}
