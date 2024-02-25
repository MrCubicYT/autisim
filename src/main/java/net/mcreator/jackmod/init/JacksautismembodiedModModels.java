
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jackmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.jackmod.client.model.Modelstabb;
import net.mcreator.jackmod.client.model.Modellarm;
import net.mcreator.jackmod.client.model.Modeljacklegs;
import net.mcreator.jackmod.client.model.Modeljackhead;
import net.mcreator.jackmod.client.model.Modeljackchest;
import net.mcreator.jackmod.client.model.Modelfarts;
import net.mcreator.jackmod.client.model.Modelchestplate;
import net.mcreator.jackmod.client.model.Modelbingchilling;
import net.mcreator.jackmod.client.model.ModelWanderer;
import net.mcreator.jackmod.client.model.ModelSperm;
import net.mcreator.jackmod.client.model.ModelSecondChance;
import net.mcreator.jackmod.client.model.ModelRubberDuck;
import net.mcreator.jackmod.client.model.ModelPissBaby;
import net.mcreator.jackmod.client.model.ModelLeggings;
import net.mcreator.jackmod.client.model.ModelHead;
import net.mcreator.jackmod.client.model.ModelFleshBall;
import net.mcreator.jackmod.client.model.ModelEYE;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class JacksautismembodiedModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelchestplate.LAYER_LOCATION, Modelchestplate::createBodyLayer);
		event.registerLayerDefinition(ModelLeggings.LAYER_LOCATION, ModelLeggings::createBodyLayer);
		event.registerLayerDefinition(ModelHead.LAYER_LOCATION, ModelHead::createBodyLayer);
		event.registerLayerDefinition(Modeljackchest.LAYER_LOCATION, Modeljackchest::createBodyLayer);
		event.registerLayerDefinition(Modellarm.LAYER_LOCATION, Modellarm::createBodyLayer);
		event.registerLayerDefinition(ModelWanderer.LAYER_LOCATION, ModelWanderer::createBodyLayer);
		event.registerLayerDefinition(ModelSecondChance.LAYER_LOCATION, ModelSecondChance::createBodyLayer);
		event.registerLayerDefinition(ModelSperm.LAYER_LOCATION, ModelSperm::createBodyLayer);
		event.registerLayerDefinition(ModelEYE.LAYER_LOCATION, ModelEYE::createBodyLayer);
		event.registerLayerDefinition(Modelfarts.LAYER_LOCATION, Modelfarts::createBodyLayer);
		event.registerLayerDefinition(ModelPissBaby.LAYER_LOCATION, ModelPissBaby::createBodyLayer);
		event.registerLayerDefinition(Modeljackhead.LAYER_LOCATION, Modeljackhead::createBodyLayer);
		event.registerLayerDefinition(ModelRubberDuck.LAYER_LOCATION, ModelRubberDuck::createBodyLayer);
		event.registerLayerDefinition(ModelFleshBall.LAYER_LOCATION, ModelFleshBall::createBodyLayer);
		event.registerLayerDefinition(Modeljacklegs.LAYER_LOCATION, Modeljacklegs::createBodyLayer);
		event.registerLayerDefinition(Modelstabb.LAYER_LOCATION, Modelstabb::createBodyLayer);
		event.registerLayerDefinition(Modelbingchilling.LAYER_LOCATION, Modelbingchilling::createBodyLayer);
	}
}
