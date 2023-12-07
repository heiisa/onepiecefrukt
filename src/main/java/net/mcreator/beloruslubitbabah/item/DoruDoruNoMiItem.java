
package net.mcreator.beloruslubitbabah.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.beloruslubitbabah.procedures.DoruDoruNoMiPlayerFinishesUsingItemProcedure;
import net.mcreator.beloruslubitbabah.init.BelorusLubitBabahModTabs;

import java.util.List;

public class DoruDoruNoMiItem extends Item {
	public DoruDoruNoMiItem() {
		super(new Item.Properties().tab(BelorusLubitBabahModTabs.TAB_ONE_PIECE_FRUITS).stacksTo(1).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(-8).saturationMod(2f).alwaysEat()

				.build()));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("???"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		DoruDoruNoMiPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
