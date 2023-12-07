package net.mcreator.beloruslubitbabah.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.beloruslubitbabah.init.BelorusLubitBabahModMobEffects;
import net.mcreator.beloruslubitbabah.BelorusLubitBabahMod;

public class SeashakingOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(BelorusLubitBabahModMobEffects.Z_ABILITY_COOLDOWN.get()) : false)) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(BelorusLubitBabahModMobEffects.EATEN_GURA_GURA_NO_MI.get()) : false) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("belorus_lubit_babah:gura_air-break")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("belorus_lubit_babah:gura_air-break")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				BelorusLubitBabahMod.queueServerWork(20, () -> {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(BelorusLubitBabahModMobEffects.STUN.get(), 25, 1));
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, (entity.getLookAngle().x + x), y, (entity.getLookAngle().z + z), 6, Explosion.BlockInteraction.BREAK);
				});
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(BelorusLubitBabahModMobEffects.Z_ABILITY_COOLDOWN.get(), 240, 0));
			}
		} else if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(BelorusLubitBabahModMobEffects.Z_ABILITY_COOLDOWN.get()) : false) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A7l Your \"Z\" ability is on cooldown for " + ""
						+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(BelorusLubitBabahModMobEffects.Z_ABILITY_COOLDOWN.get()) ? _livEnt.getEffect(BelorusLubitBabahModMobEffects.Z_ABILITY_COOLDOWN.get()).getDuration() : 0)
						+ "\u00A7l more ticks!")), (true));
		}
	}
}
