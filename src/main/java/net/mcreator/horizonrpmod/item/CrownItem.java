
package net.mcreator.horizonrpmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CrownItem extends Item {
	public CrownItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
