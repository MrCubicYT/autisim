
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.jackmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class JacksautismembodiedModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.LEATHERWORKER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(JacksautismembodiedModItems.STOMACH.get()),

					new ItemStack(Items.EMERALD), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(JacksautismembodiedModItems.LIVER.get()),

					new ItemStack(Items.EMERALD, 2), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(JacksautismembodiedModItems.KIDNEY.get()),

					new ItemStack(Items.EMERALD, 3), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(JacksautismembodiedModItems.LUNG.get()),

					new ItemStack(Items.EMERALD, 4), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(JacksautismembodiedModItems.INTESTINE.get()),

					new ItemStack(Items.EMERALD, 5), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(JacksautismembodiedModItems.APPENDIX.get()),

					new ItemStack(Items.EMERALD, 6), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(JacksautismembodiedModItems.HEART.get()),

					new ItemStack(Items.EMERALD, 7), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(JacksautismembodiedModItems.SPINE.get()),

					new ItemStack(Items.EMERALD, 8), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(JacksautismembodiedModItems.SPLEEN.get()),

					new ItemStack(Items.EMERALD, 9), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(JacksautismembodiedModItems.RIB.get()),

					new ItemStack(Items.EMERALD, 10), 10, 5, 0.05f));
		}
	}
}
