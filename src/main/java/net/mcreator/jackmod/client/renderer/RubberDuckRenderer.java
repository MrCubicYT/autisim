
package net.mcreator.jackmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jackmod.entity.RubberDuckEntity;
import net.mcreator.jackmod.client.model.ModelRubberDuck;

public class RubberDuckRenderer extends MobRenderer<RubberDuckEntity, ModelRubberDuck<RubberDuckEntity>> {
	public RubberDuckRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelRubberDuck(context.bakeLayer(ModelRubberDuck.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RubberDuckEntity entity) {
		return new ResourceLocation("jacksautismembodied:textures/entities/ruber.png");
	}
}
