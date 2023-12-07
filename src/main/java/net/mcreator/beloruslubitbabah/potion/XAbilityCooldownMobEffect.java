
package net.mcreator.beloruslubitbabah.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class XAbilityCooldownMobEffect extends MobEffect {
	public XAbilityCooldownMobEffect() {
		super(MobEffectCategory.NEUTRAL, -3355648);
	}

	@Override
	public String getDescriptionId() {
		return "effect.belorus_lubit_babah.x_ability_cooldown";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
