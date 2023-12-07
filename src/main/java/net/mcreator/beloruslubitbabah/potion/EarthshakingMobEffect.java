
package net.mcreator.beloruslubitbabah.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.beloruslubitbabah.procedures.EarthshakingOnEffectActiveTickProcedure;

public class EarthshakingMobEffect extends MobEffect {
	public EarthshakingMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16724737);
	}

	@Override
	public String getDescriptionId() {
		return "effect.belorus_lubit_babah.earthshaking";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EarthshakingOnEffectActiveTickProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
