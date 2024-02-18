package net.mcreator.jackmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class TheSlabItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("playing") != 1) {
			itemstack.getOrCreateTag().putDouble("playing", 1);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jacksautismembodied:lethal")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("jacksautismembodied:lethal")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		world.setBlock(BlockPos.containing(x, y + 10, z), Blocks.SAND.defaultBlockState(), 3);
	}
}
