
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horizonrpmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.horizonrpmod.item.RiItem;
import net.mcreator.horizonrpmod.item.OkaneItem;
import net.mcreator.horizonrpmod.item.LilyPlushItem;
import net.mcreator.horizonrpmod.item.DenariItem;
import net.mcreator.horizonrpmod.item.CrownItem;
import net.mcreator.horizonrpmod.HorizonrpmodMod;

public class HorizonrpmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HorizonrpmodMod.MODID);
	public static final RegistryObject<Item> LILYPLUSH = REGISTRY.register("lilyplush", () -> new LilyPlushItem());
	public static final RegistryObject<Item> DENARI = REGISTRY.register("denari", () -> new DenariItem());
	public static final RegistryObject<Item> OKANE = REGISTRY.register("okane", () -> new OkaneItem());
	public static final RegistryObject<Item> RI = REGISTRY.register("ri", () -> new RiItem());
	public static final RegistryObject<Item> CROWN = REGISTRY.register("crown", () -> new CrownItem());
	// Start of user code block custom items
	// End of user code block custom items
}
