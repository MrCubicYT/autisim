package net.mcreator.jackmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jackmod.block.display.SpringPadDisplayItem;

public class SpringPadDisplayModel extends GeoModel<SpringPadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringPadDisplayItem animatable) {
		return new ResourceLocation("jacksautismembodied", "animations/springpad.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringPadDisplayItem animatable) {
		return new ResourceLocation("jacksautismembodied", "geo/springpad.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringPadDisplayItem entity) {
		return new ResourceLocation("jacksautismembodied", "textures/block/stone.png");
	}
}
