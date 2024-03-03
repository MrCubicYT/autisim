
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jackmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.jackmod.block.entity.SpringPadTileEntity;
import net.mcreator.jackmod.block.entity.OakPlankBluePrintBlockEntity;
import net.mcreator.jackmod.block.entity.OakDoorBlueprintBlockEntity;
import net.mcreator.jackmod.block.entity.IronWorkingTableBlockEntity;
import net.mcreator.jackmod.JacksautismembodiedMod;

public class JacksautismembodiedModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, JacksautismembodiedMod.MODID);
	public static final RegistryObject<BlockEntityType<SpringPadTileEntity>> SPRING_PAD = REGISTRY.register("spring_pad", () -> BlockEntityType.Builder.of(SpringPadTileEntity::new, JacksautismembodiedModBlocks.SPRING_PAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> OAK_PLANK_BLUE_PRINT = register("oak_plank_blue_print", JacksautismembodiedModBlocks.OAK_PLANK_BLUE_PRINT, OakPlankBluePrintBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OAK_DOOR_BLUEPRINT = register("oak_door_blueprint", JacksautismembodiedModBlocks.OAK_DOOR_BLUEPRINT, OakDoorBlueprintBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> IRON_WORKING_TABLE = register("iron_working_table", JacksautismembodiedModBlocks.IRON_WORKING_TABLE, IronWorkingTableBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
