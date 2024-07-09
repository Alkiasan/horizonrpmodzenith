
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.horizonrpmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.horizonrpmod.potion.FatedMomentMobEffect;
import net.mcreator.horizonrpmod.potion.EmberDetonationMobEffect;
import net.mcreator.horizonrpmod.HorizonrpmodMod;

public class HorizonrpmodModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, HorizonrpmodMod.MODID);
	public static final RegistryObject<MobEffect> EMBER_DETONATION = REGISTRY.register("ember_detonation", () -> new EmberDetonationMobEffect());
	public static final RegistryObject<MobEffect> FATED_MOMENT = REGISTRY.register("fated_moment", () -> new FatedMomentMobEffect());
}
