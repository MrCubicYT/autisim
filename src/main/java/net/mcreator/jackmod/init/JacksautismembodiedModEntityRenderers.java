
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jackmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.jackmod.client.renderer.WatcherRenderer;
import net.mcreator.jackmod.client.renderer.PissBabyRenderer;
import net.mcreator.jackmod.client.renderer.KevinsRenderer;
import net.mcreator.jackmod.client.renderer.HumanRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class JacksautismembodiedModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(JacksautismembodiedModEntities.PISS_BABY.get(), PissBabyRenderer::new);
		event.registerEntityRenderer(JacksautismembodiedModEntities.PUREPISS.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JacksautismembodiedModEntities.KEVINS.get(), KevinsRenderer::new);
		event.registerEntityRenderer(JacksautismembodiedModEntities.RIFLE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(JacksautismembodiedModEntities.WATCHER.get(), WatcherRenderer::new);
		event.registerEntityRenderer(JacksautismembodiedModEntities.HUMAN.get(), HumanRenderer::new);
	}
}
