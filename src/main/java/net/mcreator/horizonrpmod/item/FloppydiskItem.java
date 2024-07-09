
package net.mcreator.horizonrpmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FloppydiskItem extends Item {
	public FloppydiskItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
