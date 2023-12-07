
package net.mcreator.beloruslubitbabah.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.beloruslubitbabah.procedures.StunOnEffectActiveTickProcedure;

public class StunMobEffect extends MobEffect {
	public StunMobEffect() {
		super(MobEffectCategory.HARMFUL, -10066330);
	}

	@Override
	public String getDescriptionId() {
		return "effect.belorus_lubit_babah.stun";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		StunOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
