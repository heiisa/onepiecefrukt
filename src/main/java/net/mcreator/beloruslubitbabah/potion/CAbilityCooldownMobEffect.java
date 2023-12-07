
package net.mcreator.beloruslubitbabah.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class CAbilityCooldownMobEffect extends MobEffect {
	public CAbilityCooldownMobEffect() {
		super(MobEffectCategory.NEUTRAL, -26317);
	}

	@Override
	public String getDescriptionId() {
		return "effect.belorus_lubit_babah.c_ability_cooldown";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
