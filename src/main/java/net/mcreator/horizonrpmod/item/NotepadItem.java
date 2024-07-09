
package net.mcreator.horizonrpmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NotepadItem extends Item {
	public NotepadItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
