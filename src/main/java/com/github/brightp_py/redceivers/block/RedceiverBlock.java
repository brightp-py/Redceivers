package com.github.brightp_py.redceivers.block;

import com.github.brightp_py.redceivers.init.ModTileEntityTypes;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class RedceiverBlock extends Block {

    public static final BooleanProperty POWERED = BooleanProperty.create("powered");

    public RedceiverBlock(final Properties properties) {
        super(properties);

        this.setDefaultState(this.getDefaultState().
                with(POWERED, false)
        );
    }

    @Override
    public ActionResultType onBlockActivated(final BlockState state, final World worldIn, final BlockPos pos, final PlayerEntity player, final Hand handIn, final BlockRayTraceResult hit) {
        worldIn.setBlockState(pos, this.getDefaultState().with(POWERED, !state.get(POWERED)));
        return ActionResultType.SUCCESS;
    }

    @Override
    public int getLightValue(final BlockState state) {
        return state.get(POWERED) ? 9 : 0;
    }

    @Override
    protected void fillStateContainer(final StateContainer.Builder<Block, BlockState> builder) {
        super.fillStateContainer(builder);
        builder.add(POWERED);
    }

}
