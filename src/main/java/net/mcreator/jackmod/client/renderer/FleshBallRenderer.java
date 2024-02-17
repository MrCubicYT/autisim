
package net.mcreator.jackmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jackmod.entity.FleshBallEntity;
import net.mcreator.jackmod.client.model.ModelFleshBall;

public class FleshBallRenderer extends MobRenderer<FleshBallEntity, ModelFleshBall<FleshBallEntity>> {
	public FleshBallRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFleshBall(context.bakeLayer(ModelFleshBall.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FleshBallEntity entity) {
		return new ResourceLocation("jacksautismembodied:textures/entities/ikikkik.png");
	}
}
