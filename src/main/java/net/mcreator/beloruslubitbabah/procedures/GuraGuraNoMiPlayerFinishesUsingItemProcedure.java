package net.mcreator.beloruslubitbabah.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.beloruslubitbabah.init.BelorusLubitBabahModMobEffects;

public class GuraGuraNoMiPlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 1, Explosion.BlockInteraction.BREAK);
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(BelorusLubitBabahModMobEffects.EATEN_GURA_GURA_NO_MI.get(), 999999, 1, (false), (false)));
	}
}
