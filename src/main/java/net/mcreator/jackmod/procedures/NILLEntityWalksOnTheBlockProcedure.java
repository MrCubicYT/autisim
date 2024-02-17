package net.mcreator.jackmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class NILLEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.5) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sand.step")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sand.step")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (Math.random() < 0.2) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.PETRIFIED_OAK_SLAB.defaultBlockState(), 3);
			} else if (Math.random() < 0.3) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.STONE.defaultBlockState(), 3);
			} else if (Math.random() < 0.1) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.OAK_WOOD.defaultBlockState(), 3);
			} else if (Math.random() < 0.4) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.PISTON_HEAD.defaultBlockState(), 3);
			}
		}
	}
}
