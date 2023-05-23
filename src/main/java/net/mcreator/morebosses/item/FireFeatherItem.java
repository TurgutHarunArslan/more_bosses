
package net.mcreator.morebosses.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.morebosses.init.MoreBossesModTabs;

public class FireFeatherItem extends Item {
	public FireFeatherItem() {
		super(new Item.Properties().tab(MoreBossesModTabs.TAB_MORE_BOSSES).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
