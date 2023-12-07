
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beloruslubitbabah.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BelorusLubitBabahModTabs {
	public static CreativeModeTab TAB_ONE_PIECE_FRUITS;

	public static void load() {
		TAB_ONE_PIECE_FRUITS = new CreativeModeTab("tabone_piece_fruits") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BelorusLubitBabahModItems.GURA_GURA_NO_MI.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
