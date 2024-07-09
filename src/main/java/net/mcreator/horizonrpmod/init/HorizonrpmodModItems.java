
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horizonrpmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.horizonrpmod.item.WornnotepadItem;
import net.mcreator.horizonrpmod.item.VoidessenceItem;
import net.mcreator.horizonrpmod.item.UsbstickItem;
import net.mcreator.horizonrpmod.item.RiItem;
import net.mcreator.horizonrpmod.item.PearlshardItem;
import net.mcreator.horizonrpmod.item.PearlItem;
import net.mcreator.horizonrpmod.item.OkaneItem;
import net.mcreator.horizonrpmod.item.NotepadItem;
import net.mcreator.horizonrpmod.item.MortarandpestleItem;
import net.mcreator.horizonrpmod.item.LilyPlushItem;
import net.mcreator.horizonrpmod.item.KeycardItem;
import net.mcreator.horizonrpmod.item.FloppydiskItem;
import net.mcreator.horizonrpmod.item.DenariItem;
import net.mcreator.horizonrpmod.item.CrownItem;
import net.mcreator.horizonrpmod.item.AmuletItem;
import net.mcreator.horizonrpmod.HorizonrpmodMod;

public class HorizonrpmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HorizonrpmodMod.MODID);
	public static final RegistryObject<Item> LILYPLUSH = REGISTRY.register("lilyplush", () -> new LilyPlushItem());
	public static final RegistryObject<Item> DENARI = REGISTRY.register("denari", () -> new DenariItem());
	public static final RegistryObject<Item> OKANE = REGISTRY.register("okane", () -> new OkaneItem());
	public static final RegistryObject<Item> RI = REGISTRY.register("ri", () -> new RiItem());
	public static final RegistryObject<Item> CROWN = REGISTRY.register("crown", () -> new CrownItem());
	public static final RegistryObject<Item> KEYCARD = REGISTRY.register("keycard", () -> new KeycardItem());
	public static final RegistryObject<Item> FLOPPYDISK = REGISTRY.register("floppydisk", () -> new FloppydiskItem());
	public static final RegistryObject<Item> MORTARANDPESTLE = REGISTRY.register("mortarandpestle", () -> new MortarandpestleItem());
	public static final RegistryObject<Item> USBSTICK = REGISTRY.register("usbstick", () -> new UsbstickItem());
	public static final RegistryObject<Item> PEARL = REGISTRY.register("pearl", () -> new PearlItem());
	public static final RegistryObject<Item> PEARLSHARD = REGISTRY.register("pearlshard", () -> new PearlshardItem());
	public static final RegistryObject<Item> NOTEPAD = REGISTRY.register("notepad", () -> new NotepadItem());
	public static final RegistryObject<Item> WORNNOTEPAD = REGISTRY.register("wornnotepad", () -> new WornnotepadItem());
	public static final RegistryObject<Item> AMULET = REGISTRY.register("amulet", () -> new AmuletItem());
	public static final RegistryObject<Item> VOIDESSENCE = REGISTRY.register("voidessence", () -> new VoidessenceItem());
	// Start of user code block custom items
	// End of user code block custom items
}
