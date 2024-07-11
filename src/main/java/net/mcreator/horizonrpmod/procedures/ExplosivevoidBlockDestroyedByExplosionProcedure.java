package net.mcreator.horizonrpmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

import net.mcreator.horizonrpmod.HorizonrpmodMod;

public class ExplosivevoidBlockDestroyedByExplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		HorizonrpmodMod.queueServerWork(2, () -> {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 15, Level.ExplosionInteraction.BLOCK);
		});
	}
}
