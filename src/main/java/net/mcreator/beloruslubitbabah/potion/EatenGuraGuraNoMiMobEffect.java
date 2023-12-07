
package net.mcreator.beloruslubitbabah.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.beloruslubitbabah.procedures.EatenGuraGuraNoMiEffectExpiresProcedure;

public class EatenGuraGuraNoMiMobEffect extends MobEffect {
	public EatenGuraGuraNoMiMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16724737);
	}

	@Override
	public String getDescriptionId() {
		return "effect.belorus_lubit_babah.eaten_gura_gura_no_mi";
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		EatenGuraGuraNoMiEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
