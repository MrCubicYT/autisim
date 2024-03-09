package net.mcreator.jackmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.jackmod.init.JacksautismembodiedModBlocks;

public class FakePlanksUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().isRaining()) {
			if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
				if (Math.random() < 0.5) {
					world.setBlock(BlockPos.containing(x, y, z), JacksautismembodiedModBlocks.OVERGROWNPLANKS.get().defaultBlockState(), 3);
				} else {
					world.destroyBlock(BlockPos.containing(x, y, z), false);
				}
			}
		}
	}
}
