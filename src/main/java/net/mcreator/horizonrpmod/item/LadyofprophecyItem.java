
package net.mcreator.horizonrpmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class LadyofprophecyItem extends RecordItem {
	public LadyofprophecyItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("horizonrpmod:ladyofprophecy")), new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 10000);
	}
}
