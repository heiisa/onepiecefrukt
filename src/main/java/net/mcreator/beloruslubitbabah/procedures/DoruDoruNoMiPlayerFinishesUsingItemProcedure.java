package net.mcreator.beloruslubitbabah.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.beloruslubitbabah.init.BelorusLubitBabahModMobEffects;

public class DoruDoruNoMiPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(BelorusLubitBabahModMobEffects.EATEN_GURA_GURA_NO_MI.get()) : false) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(BelorusLubitBabahModMobEffects.EATEN_DORU_DORU_NO_MI.get(), 9999, 0));
		} else {
			entity.hurt(DamageSource.GENERIC, 90000);
		}
	}
}
