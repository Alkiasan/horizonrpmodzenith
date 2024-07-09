
package net.mcreator.horizonrpmod.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.horizonrpmod.procedures.EmberDetonationEffectExpiresProcedure;

public class EmberDetonationMobEffect extends MobEffect {
	public EmberDetonationMobEffect() {
		super(MobEffectCategory.HARMFUL, -26368);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		EmberDetonationEffectExpiresProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
