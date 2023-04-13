
package net.mcreator.spearsoflonginus.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.spearsoflonginus.init.SpearsOfLonginusModTabs;

import java.util.List;

public class SpinePartItem extends Item {
	public SpinePartItem() {
		super(new Item.Properties().tab(SpearsOfLonginusModTabs.TAB_SPEARS_OF_LONGINUS).stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Segment of a dragons spine"));
	}
}
