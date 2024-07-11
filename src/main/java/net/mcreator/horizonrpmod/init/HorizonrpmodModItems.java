
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horizonrpmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.horizonrpmod.item.WornnotepadItem;
import net.mcreator.horizonrpmod.item.WhatwebecameItem;
import net.mcreator.horizonrpmod.item.WavesItem;
import net.mcreator.horizonrpmod.item.WarriorofthelostItem;
import net.mcreator.horizonrpmod.item.VoidtendrilItem;
import net.mcreator.horizonrpmod.item.VoidessenceItem;
import net.mcreator.horizonrpmod.item.VoidchunkItem;
import net.mcreator.horizonrpmod.item.UsbstickItem;
import net.mcreator.horizonrpmod.item.TyingthestringItem;
import net.mcreator.horizonrpmod.item.TreesmelodyItem;
import net.mcreator.horizonrpmod.item.ThornyandscatteredItem;
import net.mcreator.horizonrpmod.item.ThirtyminutesItem;
import net.mcreator.horizonrpmod.item.ScarletmusicboxItem;
import net.mcreator.horizonrpmod.item.ScarletItem;
import net.mcreator.horizonrpmod.item.Scarlet2Item;
import net.mcreator.horizonrpmod.item.RiItem;
import net.mcreator.horizonrpmod.item.PrinceoffateItem;
import net.mcreator.horizonrpmod.item.PearlshardItem;
import net.mcreator.horizonrpmod.item.PearlItem;
import net.mcreator.horizonrpmod.item.OkaneItem;
import net.mcreator.horizonrpmod.item.NotepadItem;
import net.mcreator.horizonrpmod.item.MusicboxowenItem;
import net.mcreator.horizonrpmod.item.MusicboxcardinalItem;
import net.mcreator.horizonrpmod.item.MothersmelodyItem;
import net.mcreator.horizonrpmod.item.MortarandpestleItem;
import net.mcreator.horizonrpmod.item.LilymemoryItem;
import net.mcreator.horizonrpmod.item.LilyPlushItem;
import net.mcreator.horizonrpmod.item.LibraryItem;
import net.mcreator.horizonrpmod.item.LeftbehindItem;
import net.mcreator.horizonrpmod.item.LadyofprophecyItem;
import net.mcreator.horizonrpmod.item.KeycardItem;
import net.mcreator.horizonrpmod.item.FlowItem;
import net.mcreator.horizonrpmod.item.FloppydiskItem;
import net.mcreator.horizonrpmod.item.FestivalItem;
import net.mcreator.horizonrpmod.item.DeniedprophecyItem;
import net.mcreator.horizonrpmod.item.DenariItem;
import net.mcreator.horizonrpmod.item.CrownItem;
import net.mcreator.horizonrpmod.item.CrimsonItem;
import net.mcreator.horizonrpmod.item.CardinalbattleItem;
import net.mcreator.horizonrpmod.item.AmuletItem;
import net.mcreator.horizonrpmod.item.AdaigoItem;
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
	public static final RegistryObject<Item> VOIDTENDRIL = REGISTRY.register("voidtendril", () -> new VoidtendrilItem());
	public static final RegistryObject<Item> VOIDCHUNK = REGISTRY.register("voidchunk", () -> new VoidchunkItem());
	public static final RegistryObject<Item> SAKURALEAVES = block(HorizonrpmodModBlocks.SAKURALEAVES);
	public static final RegistryObject<Item> VOID_FLOWER = block(HorizonrpmodModBlocks.VOID_FLOWER);
	public static final RegistryObject<Item> BLUELILAC = doubleBlock(HorizonrpmodModBlocks.BLUELILAC);
	public static final RegistryObject<Item> PLANTCORE = block(HorizonrpmodModBlocks.PLANTCORE);
	public static final RegistryObject<Item> PLANTMATTER = block(HorizonrpmodModBlocks.PLANTMATTER);
	public static final RegistryObject<Item> STATICVOID = block(HorizonrpmodModBlocks.STATICVOID);
	public static final RegistryObject<Item> HARDENED_VOID = block(HorizonrpmodModBlocks.HARDENED_VOID);
	public static final RegistryObject<Item> MUSICBOXCARDINAL = REGISTRY.register("musicboxcardinal", () -> new MusicboxcardinalItem());
	public static final RegistryObject<Item> MUSICBOXOWEN = REGISTRY.register("musicboxowen", () -> new MusicboxowenItem());
	public static final RegistryObject<Item> TREESMELODY = REGISTRY.register("treesmelody", () -> new TreesmelodyItem());
	public static final RegistryObject<Item> MOTHERSMELODY = REGISTRY.register("mothersmelody", () -> new MothersmelodyItem());
	public static final RegistryObject<Item> LEFTBEHIND = REGISTRY.register("leftbehind", () -> new LeftbehindItem());
	public static final RegistryObject<Item> CRIMSON = REGISTRY.register("crimson", () -> new CrimsonItem());
	public static final RegistryObject<Item> THIRTYMINUTES = REGISTRY.register("thirtyminutes", () -> new ThirtyminutesItem());
	public static final RegistryObject<Item> LIBRARY = REGISTRY.register("library", () -> new LibraryItem());
	public static final RegistryObject<Item> SCARLET = REGISTRY.register("scarlet", () -> new ScarletItem());
	public static final RegistryObject<Item> SCARLET_2 = REGISTRY.register("scarlet_2", () -> new Scarlet2Item());
	public static final RegistryObject<Item> SCARLETMUSICBOX = REGISTRY.register("scarletmusicbox", () -> new ScarletmusicboxItem());
	public static final RegistryObject<Item> CARDINALBATTLE = REGISTRY.register("cardinalbattle", () -> new CardinalbattleItem());
	public static final RegistryObject<Item> PRINCEOFFATE = REGISTRY.register("princeoffate", () -> new PrinceoffateItem());
	public static final RegistryObject<Item> TYINGTHESTRING = REGISTRY.register("tyingthestring", () -> new TyingthestringItem());
	public static final RegistryObject<Item> DENIEDPROPHECY = REGISTRY.register("deniedprophecy", () -> new DeniedprophecyItem());
	public static final RegistryObject<Item> LADYOFPROPHECY = REGISTRY.register("ladyofprophecy", () -> new LadyofprophecyItem());
	public static final RegistryObject<Item> WHATWEBECAME = REGISTRY.register("whatwebecame", () -> new WhatwebecameItem());
	public static final RegistryObject<Item> FESTIVAL = REGISTRY.register("festival", () -> new FestivalItem());
	public static final RegistryObject<Item> LILYMEMORY = REGISTRY.register("lilymemory", () -> new LilymemoryItem());
	public static final RegistryObject<Item> THORNYANDSCATTERED = REGISTRY.register("thornyandscattered", () -> new ThornyandscatteredItem());
	public static final RegistryObject<Item> WARRIOROFTHELOST = REGISTRY.register("warriorofthelost", () -> new WarriorofthelostItem());
	public static final RegistryObject<Item> ADAIGO = REGISTRY.register("adaigo", () -> new AdaigoItem());
	public static final RegistryObject<Item> WAVES = REGISTRY.register("waves", () -> new WavesItem());
	public static final RegistryObject<Item> FLOW = REGISTRY.register("flow", () -> new FlowItem());
	public static final RegistryObject<Item> NECTAR = block(HorizonrpmodModBlocks.NECTAR);
	public static final RegistryObject<Item> VOIDBLOCK = block(HorizonrpmodModBlocks.VOIDBLOCK);
	public static final RegistryObject<Item> EXPLOSIVEVOID = block(HorizonrpmodModBlocks.EXPLOSIVEVOID);
	public static final RegistryObject<Item> CRYSTALIZEDVOID = block(HorizonrpmodModBlocks.CRYSTALIZEDVOID);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
