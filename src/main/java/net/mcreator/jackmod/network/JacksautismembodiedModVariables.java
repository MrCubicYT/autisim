package net.mcreator.jackmod.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.jackmod.JacksautismembodiedMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JacksautismembodiedModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		JacksautismembodiedMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.theaut = original.theaut;
			clone.hasalreadyjoined = original.hasalreadyjoined;
			clone.isgay = original.isgay;
			clone.ObeaseChecker = original.ObeaseChecker;
			clone.FU = original.FU;
			clone.lactose = original.lactose;
			clone.lactated = original.lactated;
			if (!event.isWasDeath()) {
				clone.Shmungus = original.Shmungus;
				clone.isdepressed = original.isdepressed;
				clone.ObeaseLevel = original.ObeaseLevel;
				clone.hasbenngiven = original.hasbenngiven;
				clone.used = original.used;
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("jacksautismembodied", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double theaut = 0;
		public double hasalreadyjoined = 0;
		public double Shmungus = 0;
		public double isdepressed = 0;
		public double isgay = 0;
		public double ObeaseChecker = 0;
		public double ObeaseLevel = 0;
		public double hasbenngiven = 0;
		public double FU = 0;
		public double used = 0;
		public double lactose = 0;
		public double lactated = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				JacksautismembodiedMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("theaut", theaut);
			nbt.putDouble("hasalreadyjoined", hasalreadyjoined);
			nbt.putDouble("Shmungus", Shmungus);
			nbt.putDouble("isdepressed", isdepressed);
			nbt.putDouble("isgay", isgay);
			nbt.putDouble("ObeaseChecker", ObeaseChecker);
			nbt.putDouble("ObeaseLevel", ObeaseLevel);
			nbt.putDouble("hasbenngiven", hasbenngiven);
			nbt.putDouble("FU", FU);
			nbt.putDouble("used", used);
			nbt.putDouble("lactose", lactose);
			nbt.putDouble("lactated", lactated);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			theaut = nbt.getDouble("theaut");
			hasalreadyjoined = nbt.getDouble("hasalreadyjoined");
			Shmungus = nbt.getDouble("Shmungus");
			isdepressed = nbt.getDouble("isdepressed");
			isgay = nbt.getDouble("isgay");
			ObeaseChecker = nbt.getDouble("ObeaseChecker");
			ObeaseLevel = nbt.getDouble("ObeaseLevel");
			hasbenngiven = nbt.getDouble("hasbenngiven");
			FU = nbt.getDouble("FU");
			used = nbt.getDouble("used");
			lactose = nbt.getDouble("lactose");
			lactated = nbt.getDouble("lactated");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.theaut = message.data.theaut;
					variables.hasalreadyjoined = message.data.hasalreadyjoined;
					variables.Shmungus = message.data.Shmungus;
					variables.isdepressed = message.data.isdepressed;
					variables.isgay = message.data.isgay;
					variables.ObeaseChecker = message.data.ObeaseChecker;
					variables.ObeaseLevel = message.data.ObeaseLevel;
					variables.hasbenngiven = message.data.hasbenngiven;
					variables.FU = message.data.FU;
					variables.used = message.data.used;
					variables.lactose = message.data.lactose;
					variables.lactated = message.data.lactated;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
