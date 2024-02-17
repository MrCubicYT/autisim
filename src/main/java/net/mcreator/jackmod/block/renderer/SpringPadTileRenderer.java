package net.mcreator.jackmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.jackmod.block.model.SpringPadBlockModel;
import net.mcreator.jackmod.block.entity.SpringPadTileEntity;

public class SpringPadTileRenderer extends GeoBlockRenderer<SpringPadTileEntity> {
	public SpringPadTileRenderer() {
		super(new SpringPadBlockModel());
	}

	@Override
	public RenderType getRenderType(SpringPadTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
