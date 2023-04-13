
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spearsoflonginus.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SpearsOfLonginusModTabs {
	public static CreativeModeTab TAB_SPEARS_OF_LONGINUS;

	public static void load() {
		TAB_SPEARS_OF_LONGINUS = new CreativeModeTab("tabspears_of_longinus") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SpearsOfLonginusModItems.TRIDENT_TRUE_LONGINUS.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
