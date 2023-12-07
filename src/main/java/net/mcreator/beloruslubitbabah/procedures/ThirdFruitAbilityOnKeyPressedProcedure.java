package net.mcreator.beloruslubitbabah.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

import net.mcreator.beloruslubitbabah.init.BelorusLubitBabahModMobEffects;

public class ThirdFruitAbilityOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(BelorusLubitBabahModMobEffects.EATEN_GURA_GURA_NO_MI.get()) : false) {
			if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(BelorusLubitBabahModMobEffects.C_ABILITY_COOLDOWN.get()) : false)) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(BelorusLubitBabahModMobEffects.EARTHSHAKING.get(), 140, 0));
			} else if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(BelorusLubitBabahModMobEffects.C_ABILITY_COOLDOWN.get()) : false) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("\u00A7l Your \"C\" ability is on cooldown for " + ""
							+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(BelorusLubitBabahModMobEffects.C_ABILITY_COOLDOWN.get()) ? _livEnt.getEffect(BelorusLubitBabahModMobEffects.C_ABILITY_COOLDOWN.get()).getDuration() : 0)
							+ "\u00A7l more ticks!")), (true));
			}
		}
	}
}
