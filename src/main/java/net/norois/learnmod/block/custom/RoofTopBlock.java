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

        int top = pos.getY() + 20;
        int sideX = pos.getX() - 10;
        int sideZ = pos.getZ() - 10;


        for(int i = 0; i <= 20; i++){
            BlockPos BlockToReplace = new BlockPos(sideX, sideZ, top);
            replace(world.getBlockState(BlockToReplace), Blocks.OAK_PLANKS.getDefaultState(), world, BlockToReplace, 0);
            sideZ ++;
            sideX ++;
        }
//        replace(world.getBlockState(new BlockPos(pos.getX(), pos.getZ(), pos.getY() + 1)),
//                Blocks.OAK_PLANKS.getDefaultState(), world,
//                new BlockPos(pos.getX(), pos.getZ(), pos.getY() + 1), 0);

        return ActionResult.SUCCESS;
    }
}
