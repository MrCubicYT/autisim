
package net.mcreator.jackmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.jackmod.entity.WatcherEntity;
import net.mcreator.jackmod.client.model.ModelEYE;

public class WatcherRenderer extends MobRenderer<WatcherEntity, ModelEYE<WatcherEntity>> {
	public WatcherRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEYE(context.bakeLayer(ModelEYE.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<WatcherEntity, ModelEYE<WatcherEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("jacksautismembodied:textures/entities/boo.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(WatcherEntity entity) {
		return new ResourceLocation("jacksautismembodied:textures/entities/boo.png");
	}
}
