
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horizonrpmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.horizonrpmod.block.VoidFlowerBlock;
import net.mcreator.horizonrpmod.block.StaticvoidBlock;
import net.mcreator.horizonrpmod.block.SakuraleavesBlock;
import net.mcreator.horizonrpmod.block.PlantmatterBlock;
import net.mcreator.horizonrpmod.block.PlantcoreBlock;
import net.mcreator.horizonrpmod.block.HardenedVoidBlock;
import net.mcreator.horizonrpmod.block.BluelilacBlock;
import net.mcreator.horizonrpmod.HorizonrpmodMod;

public class HorizonrpmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HorizonrpmodMod.MODID);
	public static final RegistryObject<Block> SAKURALEAVES = REGISTRY.register("sakuraleaves", () -> new SakuraleavesBlock());
	public static final RegistryObject<Block> VOID_FLOWER = REGISTRY.register("void_flower", () -> new VoidFlowerBlock());
	public static final RegistryObject<Block> BLUELILAC = REGISTRY.register("bluelilac", () -> new BluelilacBlock());
	public static final RegistryObject<Block> PLANTCORE = REGISTRY.register("plantcore", () -> new PlantcoreBlock());
	public static final RegistryObject<Block> PLANTMATTER = REGISTRY.register("plantmatter", () -> new PlantmatterBlock());
	public static final RegistryObject<Block> STATICVOID = REGISTRY.register("staticvoid", () -> new StaticvoidBlock());
	public static final RegistryObject<Block> HARDENED_VOID = REGISTRY.register("hardened_void", () -> new HardenedVoidBlock());

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			SakuraleavesBlock.blockColorLoad(event);
		}
	}
}
