
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beloruslubitbabah.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.beloruslubitbabah.potion.ZAbilityCooldownMobEffect;
import net.mcreator.beloruslubitbabah.potion.XAbilityCooldownMobEffect;
import net.mcreator.beloruslubitbabah.potion.StunMobEffect;
import net.mcreator.beloruslubitbabah.potion.EatenGuraGuraNoMiMobEffect;
import net.mcreator.beloruslubitbabah.potion.EarthshakingMobEffect;
import net.mcreator.beloruslubitbabah.potion.CAbilityCooldownMobEffect;
import net.mcreator.beloruslubitbabah.BelorusLubitBabahMod;

public class BelorusLubitBabahModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, BelorusLubitBabahMod.MODID);
	public static final RegistryObject<MobEffect> STUN = REGISTRY.register("stun", () -> new StunMobEffect());
	public static final RegistryObject<MobEffect> EATEN_GURA_GURA_NO_MI = REGISTRY.register("eaten_gura_gura_no_mi", () -> new EatenGuraGuraNoMiMobEffect());
	public static final RegistryObject<MobEffect> Z_ABILITY_COOLDOWN = REGISTRY.register("z_ability_cooldown", () -> new ZAbilityCooldownMobEffect());
	public static final RegistryObject<MobEffect> X_ABILITY_COOLDOWN = REGISTRY.register("x_ability_cooldown", () -> new XAbilityCooldownMobEffect());
	public static final RegistryObject<MobEffect> C_ABILITY_COOLDOWN = REGISTRY.register("c_ability_cooldown", () -> new CAbilityCooldownMobEffect());
	public static final RegistryObject<MobEffect> EARTHSHAKING = REGISTRY.register("earthshaking", () -> new EarthshakingMobEffect());
}
