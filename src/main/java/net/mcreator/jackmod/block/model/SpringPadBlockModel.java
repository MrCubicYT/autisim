package net.mcreator.jackmod.block.model;

public class SpringPadBlockModel extends GeoModel<SpringPadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringPadTileEntity animatable) {
		return new ResourceLocation("jacksautismembodied", "animations/springpad.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringPadTileEntity animatable) {
		return new ResourceLocation("jacksautismembodied", "geo/springpad.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringPadTileEntity entity) {
		return new ResourceLocation("jacksautismembodied", "textures/block/stone.png");
	}
}