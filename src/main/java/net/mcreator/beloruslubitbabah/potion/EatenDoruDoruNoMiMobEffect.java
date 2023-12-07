
package net.mcreator.beloruslubitbabah.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class EatenDoruDoruNoMiMobEffect extends MobEffect {
	public EatenDoruDoruNoMiMobEffect() {
		super(MobEffectCategory.NEUTRAL, -133168);
	}

	@Override
	public String getDescriptionId() {
		return "effect.belorus_lubit_babah.eaten_doru_doru_no_mi";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
