
package net.mcreator.horizonrpmod.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class StaticvoidBlock extends Block {
	public StaticvoidBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.SCULK).strength(1.1f, 10f).friction(0.5f).jumpFactor(0.9f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
