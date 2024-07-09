
package net.mcreator.horizonrpmod.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.horizonrpmod.procedures.FatedMomentOnEffectActiveTickProcedure;
import net.mcreator.horizonrpmod.procedures.FatedMomentEffectStartedappliedProcedure;

public class FatedMomentMobEffect extends MobEffect {
	public FatedMomentMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -154);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		FatedMomentEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FatedMomentOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
