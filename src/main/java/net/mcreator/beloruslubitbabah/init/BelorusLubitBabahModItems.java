
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beloruslubitbabah.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.beloruslubitbabah.item.GuraGuraNoMiItem;
import net.mcreator.beloruslubitbabah.item.DoruDoruNoMiItem;
import net.mcreator.beloruslubitbabah.item.ChargedXHandGuraItem;
import net.mcreator.beloruslubitbabah.BelorusLubitBabahMod;

public class BelorusLubitBabahModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BelorusLubitBabahMod.MODID);
	public static final RegistryObject<Item> CHARGED_X_HAND_GURA = REGISTRY.register("charged_x_hand_gura", () -> new ChargedXHandGuraItem());
	public static final RegistryObject<Item> GURA_GURA_NO_MI = REGISTRY.register("gura_gura_no_mi", () -> new GuraGuraNoMiItem());
	public static final RegistryObject<Item> DORU_DORU_NO_MI = REGISTRY.register("doru_doru_no_mi", () -> new DoruDoruNoMiItem());
}
