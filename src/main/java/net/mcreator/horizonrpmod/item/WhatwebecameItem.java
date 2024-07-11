
package net.mcreator.horizonrpmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class WhatwebecameItem extends RecordItem {
	public WhatwebecameItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("horizonrpmod:whatwebecame")), new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 10000);
	}
}
