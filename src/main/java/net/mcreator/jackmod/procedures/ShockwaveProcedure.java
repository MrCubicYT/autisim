package net.mcreator.jackmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Comparator;

public class ShockwaveProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double particleRadius = 0;
		double particleAmount = 0;
		BlockState stood = Blocks.AIR.defaultBlockState();
		sx = -3;
		for (int index0 = 0; index0 < 6; index0++) {
			sy = -3;
			for (int index1 = 0; index1 < 6; index1++) {
				sz = -3;
				for (int index2 = 0; index2 < 6; index2++) {
					if (world instanceof ServerLevel _level)
						FallingBlockEntity.fall(_level, BlockPos.containing(x + sx, y + sy + 2.5, z + sz), (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))));
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator == entity) {
					entityiterator.setDeltaMovement(new Vec3(0, 0.5, 0));
				} else if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("minecraft:falling_block")))) {
					entityiterator.setDeltaMovement(new Vec3((Mth.nextDouble(RandomSource.create(), 0.05 * (entityiterator.getX() - x), 0.1 * (entityiterator.getX() - x))), Math.abs(0.3 * (entityiterator.getY() - y)),
							(Mth.nextDouble(RandomSource.create(), 0.05 * (entityiterator.getZ() - z), 0.1 * (entityiterator.getZ() - z)))));
				} else if (!entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("minecraft:falling_block")))) {
					entityiterator.setDeltaMovement(new Vec3((Mth.nextDouble(RandomSource.create(), 0.99 * (entityiterator.getX() - x), 1.99 * (entityiterator.getX() - x))), Math.abs(0.3 * (entityiterator.getY() - y)),
							(Mth.nextDouble(RandomSource.create(), 0.99 * (entityiterator.getZ() - z), 1.99 * (entityiterator.getZ() - z)))));
				}
			}
		}
	}
}
