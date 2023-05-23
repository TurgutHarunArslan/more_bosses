
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.morebosses.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MoreBossesModTabs {
	public static CreativeModeTab TAB_MORE_BOSSES;

	public static void load() {
		TAB_MORE_BOSSES = new CreativeModeTab("tabmore_bosses") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MoreBossesModItems.FIRE_FEATHER.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
