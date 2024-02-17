
package net.mcreator.jackmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.jackmod.entity.KevinsEntity;
import net.mcreator.jackmod.client.model.Modelbingchilling;

public class KevinsRenderer extends MobRenderer<KevinsEntity, Modelbingchilling<KevinsEntity>> {
	public KevinsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbingchilling(context.bakeLayer(Modelbingchilling.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<KevinsEntity, Modelbingchilling<KevinsEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("jacksautismembodied:textures/entities/glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(KevinsEntity entity) {
		return new ResourceLocation("jacksautismembodied:textures/entities/bingus.png");
	}
}
