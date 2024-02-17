package net.mcreator.jackmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.jackmod.block.model.SpringPadDisplayModel;
import net.mcreator.jackmod.block.display.SpringPadDisplayItem;

public class SpringPadDisplayItemRenderer extends GeoItemRenderer<SpringPadDisplayItem> {
	public SpringPadDisplayItemRenderer() {
		super(new SpringPadDisplayModel());
	}

	@Override
	public RenderType getRenderType(SpringPadDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
