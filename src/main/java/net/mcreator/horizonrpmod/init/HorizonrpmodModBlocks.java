
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horizonrpmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.horizonrpmod.block.VoidFlowerBlock;
import net.mcreator.horizonrpmod.block.SakuraleavesBlock;
import net.mcreator.horizonrpmod.block.BluelilacBlock;
import net.mcreator.horizonrpmod.HorizonrpmodMod;

public class HorizonrpmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HorizonrpmodMod.MODID);
	public static final RegistryObject<Block> SAKURALEAVES = REGISTRY.register("sakuraleaves", () -> new SakuraleavesBlock());
	public static final RegistryObject<Block> VOID_FLOWER = REGISTRY.register("void_flower", () -> new VoidFlowerBlock());
	public static final RegistryObject<Block> BLUELILAC = REGISTRY.register("bluelilac", () -> new BluelilacBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
