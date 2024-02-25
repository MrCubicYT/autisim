
package net.mcreator.jackmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.jackmod.entity.SpermBossEntity;
import net.mcreator.jackmod.client.model.ModelSperm;

public class SpermBossRenderer extends MobRenderer<SpermBossEntity, ModelSperm<SpermBossEntity>> {
	public SpermBossRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSperm(context.bakeLayer(ModelSperm.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<SpermBossEntity, ModelSperm<SpermBossEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("jacksautismembodied:textures/entities/sperm.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SpermBossEntity entity) {
		return new ResourceLocation("jacksautismembodied:textures/entities/sperm.png");
	}
}
