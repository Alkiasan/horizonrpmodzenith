
package net.mcreator.horizonrpmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DenariItem extends Item {
	public DenariItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
