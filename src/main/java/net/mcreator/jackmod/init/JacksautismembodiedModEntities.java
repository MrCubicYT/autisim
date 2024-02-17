
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jackmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.jackmod.entity.WatcherEntity;
import net.mcreator.jackmod.entity.RifleEntity;
import net.mcreator.jackmod.entity.PissBabyEntity;
import net.mcreator.jackmod.entity.PUREPISSEntity;
import net.mcreator.jackmod.entity.KevinsEntity;
import net.mcreator.jackmod.entity.HumanEntity;
import net.mcreator.jackmod.JacksautismembodiedMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JacksautismembodiedModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, JacksautismembodiedMod.MODID);
	public static final RegistryObject<EntityType<PissBabyEntity>> PISS_BABY = register("piss_baby",
			EntityType.Builder.<PissBabyEntity>of(PissBabyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PissBabyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PUREPISSEntity>> PUREPISS = register("projectile_purepiss",
			EntityType.Builder.<PUREPISSEntity>of(PUREPISSEntity::new, MobCategory.MISC).setCustomClientFactory(PUREPISSEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KevinsEntity>> KEVINS = register("kevins",
			EntityType.Builder.<KevinsEntity>of(KevinsEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KevinsEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RifleEntity>> RIFLE = register("projectile_rifle",
			EntityType.Builder.<RifleEntity>of(RifleEntity::new, MobCategory.MISC).setCustomClientFactory(RifleEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WatcherEntity>> WATCHER = register("watcher",
			EntityType.Builder.<WatcherEntity>of(WatcherEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WatcherEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HumanEntity>> HUMAN = register("human",
			EntityType.Builder.<HumanEntity>of(HumanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HumanEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			PissBabyEntity.init();
			KevinsEntity.init();
			WatcherEntity.init();
			HumanEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PISS_BABY.get(), PissBabyEntity.createAttributes().build());
		event.put(KEVINS.get(), KevinsEntity.createAttributes().build());
		event.put(WATCHER.get(), WatcherEntity.createAttributes().build());
		event.put(HUMAN.get(), HumanEntity.createAttributes().build());
	}
}
