
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beloruslubitbabah.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.beloruslubitbabah.BelorusLubitBabahMod;

public class BelorusLubitBabahModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BelorusLubitBabahMod.MODID);
	public static final RegistryObject<SoundEvent> GURA_AIR_BREAK = REGISTRY.register("gura_air-break", () -> new SoundEvent(new ResourceLocation("belorus_lubit_babah", "gura_air-break")));
	public static final RegistryObject<SoundEvent> GURA_FASTAIR_BREAK = REGISTRY.register("gura_fastair-break", () -> new SoundEvent(new ResourceLocation("belorus_lubit_babah", "gura_fastair-break")));
}
