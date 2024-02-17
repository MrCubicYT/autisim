package net.mcreator.jackmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.jackmod.entity.KabeemEntity;

public class KabeemModel extends GeoModel<KabeemEntity> {
	@Override
	public ResourceLocation getAnimationResource(KabeemEntity entity) {
		return new ResourceLocation("jacksautismembodied", "animations/kabeem.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(KabeemEntity entity) {
		return new ResourceLocation("jacksautismembodied", "geo/kabeem.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(KabeemEntity entity) {
		return new ResourceLocation("jacksautismembodied", "textures/entities/" + entity.getTexture() + ".png");
	}

}
