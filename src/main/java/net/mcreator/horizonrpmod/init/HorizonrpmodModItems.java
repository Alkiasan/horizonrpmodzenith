
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horizonrpmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.horizonrpmod.item.LilyPlushItem;
import net.mcreator.horizonrpmod.HorizonrpmodMod;

public class HorizonrpmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HorizonrpmodMod.MODID);
	public static final RegistryObject<Item> LILY_PLUSH = REGISTRY.register("lily_plush", () -> new LilyPlushItem());
	// Start of user code block custom items
	// End of user code block custom items
}
