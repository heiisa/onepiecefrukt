package net.mcreator.beloruslubitbabah.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.mcreator.beloruslubitbabah.init.BelorusLubitBabahModMobEffects;
import net.mcreator.beloruslubitbabah.init.BelorusLubitBabahModItems;

public class SecondFruitAbilityOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(BelorusLubitBabahModMobEffects.EATEN_GURA_GURA_NO_MI.get()) : false) {
			if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(BelorusLubitBabahModMobEffects.X_ABILITY_COOLDOWN.get()) : false)) {
				if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) : false) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(BelorusLubitBabahModItems.CHARGED_X_HAND_GURA.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(BelorusLubitBabahModItems.CHARGED_X_HAND_GURA.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(BelorusLubitBabahModMobEffects.X_ABILITY_COOLDOWN.get(), 200, 0));
			} else if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(BelorusLubitBabahModMobEffects.X_ABILITY_COOLDOWN.get()) : false) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7l Your \"X\" ability is on cooldown for " + ""
							+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(BelorusLubitBabahModMobEffects.X_ABILITY_COOLDOWN.get()) ? _livEnt.getEffect(BelorusLubitBabahModMobEffects.X_ABILITY_COOLDOWN.get()).getDuration() : 0)
							+ "\u00A7l more ticks!")), (true));
			}
		}
	}
}
