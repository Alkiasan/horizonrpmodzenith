
package net.mcreator.horizonrpmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class KeycardItem extends Item {
	public KeycardItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
