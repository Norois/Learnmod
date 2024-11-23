package net.norois.learnmod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RoofTopBlock extends Block {
    public RoofTopBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {

        if(!world.isClient) {
            int top = 20;
            int side = -10;

            for (int i = 0; i <= 20; i++) {
                for (int j = 0; j <= 20; j++) {
                    BlockPos BlockToReplace = pos.up(top).north(side + i).east(side + j);
                    replace(world.getBlockState(BlockToReplace), Blocks.OAK_PLANKS.getDefaultState(), world, BlockToReplace, 0);
                }
            }
        }

        return ActionResult.SUCCESS;
    }
}
