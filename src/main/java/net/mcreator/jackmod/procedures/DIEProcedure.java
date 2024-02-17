package net.mcreator.jackmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.jackmod.network.JacksautismembodiedModVariables;
import net.mcreator.jackmod.init.JacksautismembodiedModBlocks;
import net.mcreator.jackmod.entity.PissBabyEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DIEProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player || entity instanceof EnderDragon || entity instanceof WitherBoss || entity instanceof PissBabyEntity) {
			if ((entity.getCapability(JacksautismembodiedModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new JacksautismembodiedModVariables.PlayerVariables())).Shmungus >= 5) {
				world.setBlock(BlockPos.containing(x, y, z), JacksautismembodiedModBlocks.GOOD_GRAVE.get().defaultBlockState(), 3);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), JacksautismembodiedModBlocks.BAD_GRAVE.get().defaultBlockState(), 3);
			}
		}
	}
}
