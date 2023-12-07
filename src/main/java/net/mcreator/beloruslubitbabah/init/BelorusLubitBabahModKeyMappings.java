
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beloruslubitbabah.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.beloruslubitbabah.network.ThirdFruitAbilityMessage;
import net.mcreator.beloruslubitbabah.network.SecondFruitAbilityMessage;
import net.mcreator.beloruslubitbabah.network.SeashakingMessage;
import net.mcreator.beloruslubitbabah.BelorusLubitBabahMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BelorusLubitBabahModKeyMappings {
	public static final KeyMapping SECOND_FRUIT_ABILITY = new KeyMapping("key.belorus_lubit_babah.second_fruit_ability", GLFW.GLFW_KEY_X, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				BelorusLubitBabahMod.PACKET_HANDLER.sendToServer(new SecondFruitAbilityMessage(0, 0));
				SecondFruitAbilityMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping THIRD_FRUIT_ABILITY = new KeyMapping("key.belorus_lubit_babah.third_fruit_ability", GLFW.GLFW_KEY_C, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				BelorusLubitBabahMod.PACKET_HANDLER.sendToServer(new ThirdFruitAbilityMessage(0, 0));
				ThirdFruitAbilityMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SEASHAKING = new KeyMapping("key.belorus_lubit_babah.seashaking", GLFW.GLFW_KEY_Z, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				BelorusLubitBabahMod.PACKET_HANDLER.sendToServer(new SeashakingMessage(0, 0));
				SeashakingMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(SECOND_FRUIT_ABILITY);
		event.register(THIRD_FRUIT_ABILITY);
		event.register(SEASHAKING);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				SECOND_FRUIT_ABILITY.consumeClick();
				THIRD_FRUIT_ABILITY.consumeClick();
				SEASHAKING.consumeClick();
			}
		}
	}
}
