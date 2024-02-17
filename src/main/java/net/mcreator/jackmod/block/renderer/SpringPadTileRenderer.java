package net.mcreator.jackmod.block.renderer;

public class SpringPadTileRenderer extends GeoBlockRenderer<SpringPadTileEntity> {
	public SpringPadTileRenderer() {
		super(new SpringPadBlockModel());
	}

	@Override
	public RenderType getRenderType(SpringPadTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}