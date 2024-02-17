package net.mcreator.jackmod.init;

import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;

import net.mcreator.jackmod.client.renderer.SecondChanceRenderer;
import net.mcreator.jackmod.client.renderer.HateTrinketRenderer;
import net.mcreator.jackmod.client.model.Modelstabb;
import net.mcreator.jackmod.client.model.ModelSecondChance;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JacksautismembodiedModCuriosRenderers {
	@SubscribeEvent
	public static void registerLayers(final EntityRenderersEvent.RegisterLayerDefinitions evt) {
		evt.registerLayerDefinition(JacksautismembodiedModLayerDefinitions.HATE_TRINKET, Modelstabb::createBodyLayer);
		evt.registerLayerDefinition(JacksautismembodiedModLayerDefinitions.SECOND_CHANCE, ModelSecondChance::createBodyLayer);
	}

	@SubscribeEvent
	public static void clientSetup(final FMLClientSetupEvent evt) {
		CuriosRendererRegistry.register(JacksautismembodiedModItems.HATE_TRINKET.get(), HateTrinketRenderer::new);
		CuriosRendererRegistry.register(JacksautismembodiedModItems.SECOND_CHANCE.get(), SecondChanceRenderer::new);
	}
}
