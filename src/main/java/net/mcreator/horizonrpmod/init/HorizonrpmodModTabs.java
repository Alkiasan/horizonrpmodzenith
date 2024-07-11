
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horizonrpmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.horizonrpmod.HorizonrpmodMod;

public class HorizonrpmodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HorizonrpmodMod.MODID);
	public static final RegistryObject<CreativeModeTab> HORIZON_RP = REGISTRY.register("horizon_rp",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.horizonrpmod.horizon_rp")).icon(() -> new ItemStack(HorizonrpmodModItems.RI.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HorizonrpmodModItems.DENARI.get());
				tabData.accept(HorizonrpmodModItems.LILYPLUSH.get());
				tabData.accept(HorizonrpmodModItems.OKANE.get());
				tabData.accept(HorizonrpmodModItems.RI.get());
				tabData.accept(HorizonrpmodModItems.CROWN.get());
				tabData.accept(HorizonrpmodModItems.KEYCARD.get());
				tabData.accept(HorizonrpmodModItems.FLOPPYDISK.get());
				tabData.accept(HorizonrpmodModItems.MORTARANDPESTLE.get());
				tabData.accept(HorizonrpmodModItems.USBSTICK.get());
				tabData.accept(HorizonrpmodModItems.PEARL.get());
				tabData.accept(HorizonrpmodModItems.PEARLSHARD.get());
				tabData.accept(HorizonrpmodModItems.NOTEPAD.get());
				tabData.accept(HorizonrpmodModItems.WORNNOTEPAD.get());
				tabData.accept(HorizonrpmodModItems.AMULET.get());
				tabData.accept(HorizonrpmodModItems.VOIDESSENCE.get());
				tabData.accept(HorizonrpmodModItems.VOIDTENDRIL.get());
				tabData.accept(HorizonrpmodModItems.VOIDCHUNK.get());
				tabData.accept(HorizonrpmodModBlocks.SAKURALEAVES.get().asItem());
				tabData.accept(HorizonrpmodModBlocks.VOID_FLOWER.get().asItem());
				tabData.accept(HorizonrpmodModBlocks.BLUELILAC.get().asItem());
				tabData.accept(HorizonrpmodModBlocks.PLANTCORE.get().asItem());
				tabData.accept(HorizonrpmodModBlocks.PLANTMATTER.get().asItem());
				tabData.accept(HorizonrpmodModBlocks.STATICVOID.get().asItem());
				tabData.accept(HorizonrpmodModBlocks.HARDENED_VOID.get().asItem());
				tabData.accept(HorizonrpmodModItems.MUSICBOXCARDINAL.get());
				tabData.accept(HorizonrpmodModItems.MUSICBOXOWEN.get());
				tabData.accept(HorizonrpmodModItems.TREESMELODY.get());
				tabData.accept(HorizonrpmodModItems.MOTHERSMELODY.get());
				tabData.accept(HorizonrpmodModItems.LEFTBEHIND.get());
				tabData.accept(HorizonrpmodModItems.CRIMSON.get());
				tabData.accept(HorizonrpmodModItems.THIRTYMINUTES.get());
				tabData.accept(HorizonrpmodModItems.LIBRARY.get());
				tabData.accept(HorizonrpmodModItems.SCARLET.get());
				tabData.accept(HorizonrpmodModItems.SCARLET_2.get());
				tabData.accept(HorizonrpmodModItems.SCARLETMUSICBOX.get());
				tabData.accept(HorizonrpmodModItems.CARDINALBATTLE.get());
				tabData.accept(HorizonrpmodModItems.PRINCEOFFATE.get());
				tabData.accept(HorizonrpmodModItems.TYINGTHESTRING.get());
				tabData.accept(HorizonrpmodModItems.DENIEDPROPHECY.get());
				tabData.accept(HorizonrpmodModItems.LADYOFPROPHECY.get());
				tabData.accept(HorizonrpmodModItems.WHATWEBECAME.get());
				tabData.accept(HorizonrpmodModItems.FESTIVAL.get());
				tabData.accept(HorizonrpmodModItems.LILYMEMORY.get());
				tabData.accept(HorizonrpmodModItems.THORNYANDSCATTERED.get());
				tabData.accept(HorizonrpmodModItems.WARRIOROFTHELOST.get());
				tabData.accept(HorizonrpmodModItems.ADAIGO.get());
				tabData.accept(HorizonrpmodModItems.WAVES.get());
				tabData.accept(HorizonrpmodModItems.FLOW.get());
				tabData.accept(HorizonrpmodModBlocks.NECTAR.get().asItem());
				tabData.accept(HorizonrpmodModBlocks.VOIDBLOCK.get().asItem());
				tabData.accept(HorizonrpmodModBlocks.EXPLOSIVEVOID.get().asItem());
				tabData.accept(HorizonrpmodModBlocks.CRYSTALIZEDVOID.get().asItem());
			})

					.build());
}
