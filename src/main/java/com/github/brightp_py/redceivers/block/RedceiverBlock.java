package com.github.brightp_py.redceivers.block;

import com.github.brightp_py.redceivers.init.ModTileEntityTypes;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class RedceiverBlock extends Block {

    public static final BooleanProperty POWERED = BooleanProperty.create("powered");
    public static final IntegerProperty WEAKPOWER = IntegerProperty.create("weakpower", 0, 15);

    public RedceiverBlock(final Properties properties) {
        super(properties);

        this.setDefaultState(this.getDefaultState()
                .with(POWERED, false)
                .with(WEAKPOWER, 0)
        );
    }

    @Override
    public ActionResultType onBlockActivated(final BlockState state, final World worldIn, final BlockPos pos, final PlayerEntity player, final Hand handIn, final BlockRayTraceResult hit) {
        worldIn.setBlockState(pos, this.getDefaultState().with(POWERED, !state.get(POWERED)).with(WEAKPOWER, state.get(POWERED) ? 0 : 15));
        return ActionResultType.SUCCESS;
    }

    @Override
    public int getLightValue(final BlockState state) {
        return state.get(WEAKPOWER);
    }

    @Override
    protected void fillStateContainer(final StateContainer.Builder<Block, BlockState> builder) {
        super.fillStateContainer(builder);
        builder.add(POWERED);
        builder.add(WEAKPOWER);
    }

    @Override
    public boolean canProvidePower(BlockState state) {
        return state.get(POWERED);
    };

    @Override
    public int getWeakPower(BlockState blockState, IBlockReader blockAccess, BlockPos pos, Direction side) {
        return blockState.get(WEAKPOWER);
    }

}
