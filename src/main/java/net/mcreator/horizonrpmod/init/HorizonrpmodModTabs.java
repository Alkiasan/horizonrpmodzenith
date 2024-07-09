
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
			})

					.build());
}
