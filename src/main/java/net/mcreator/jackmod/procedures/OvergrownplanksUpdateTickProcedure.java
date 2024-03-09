package net.mcreator.jackmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class OvergrownplanksUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().isRaining()) {
			if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			}
		}
	}
}
