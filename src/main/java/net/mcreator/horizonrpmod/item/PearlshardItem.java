
package net.mcreator.horizonrpmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PearlshardItem extends Item {
	public PearlshardItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}