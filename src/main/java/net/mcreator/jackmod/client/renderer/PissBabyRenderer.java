
package net.mcreator.jackmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.jackmod.entity.PissBabyEntity;
import net.mcreator.jackmod.client.model.ModelPissBaby;

public class PissBabyRenderer extends MobRenderer<PissBabyEntity, ModelPissBaby<PissBabyEntity>> {
	public PissBabyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPissBaby(context.bakeLayer(ModelPissBaby.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<PissBabyEntity, ModelPissBaby<PissBabyEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("jacksautismembodied:textures/entities/peeeyes.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PissBabyEntity entity) {
		return new ResourceLocation("jacksautismembodied:textures/entities/texture.png");
	}
}
