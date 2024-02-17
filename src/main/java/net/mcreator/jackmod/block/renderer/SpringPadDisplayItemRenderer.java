package net.mcreator.jackmod.block.renderer;

public class SpringPadDisplayItemRenderer extends GeoItemRenderer<SpringPadDisplayItem> {
	public SpringPadDisplayItemRenderer() {
		super(new SpringPadDisplayModel());
	}

	@Override
	public RenderType getRenderType(SpringPadDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}