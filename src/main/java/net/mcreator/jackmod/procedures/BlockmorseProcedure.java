package net.mcreator.jackmod.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class BlockmorseProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jacksautismembodied:block.zfightamb")), SoundSource.BLOCKS, (float) 0.5, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jacksautismembodied:block.zfightamb")), SoundSource.BLOCKS, (float) 0.5, 1, false);
			}
		}
	}
}
