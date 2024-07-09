
package net.mcreator.horizonrpmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RiItem extends Item {
	public RiItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
