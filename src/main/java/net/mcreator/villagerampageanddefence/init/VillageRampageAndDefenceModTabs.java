
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.villagerampageanddefence.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class VillageRampageAndDefenceModTabs {
	public static CreativeModeTab TAB_SKY_STUFF;

	public static void load() {
		TAB_SKY_STUFF = new CreativeModeTab("tabsky_stuff") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(VillageRampageAndDefenceModBlocks.SKY_SHARD.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
