package net.mcreator.jackmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.jackmod.init.JacksautismembodiedModItems;

import javax.annotation.Nullable;

import java.util.Comparator;

@Mod.EventBusSubscriber
public class SacrifeceProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FIRE) {
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.COAL_BLOCK) {
				if (!world.getEntitiesOfClass(Villager.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).isEmpty()) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("jacksautismembodied:pure_magic"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.DIRT.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					((Entity) world.getEntitiesOfClass(Villager.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 999);
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.LIGHTNING_BOLT.spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					for (int index0 = 0; index0 < 10; index0++) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 10), z, new ItemStack(JacksautismembodiedModItems.HEART.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						for (int index1 = 0; index1 < 2; index1++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.EXPERIENCE_ORB.spawn(_level, BlockPos.containing(x + 2, y + 10, z), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
								}
							}
						}
					}
				}
			}
		}
	}
}
