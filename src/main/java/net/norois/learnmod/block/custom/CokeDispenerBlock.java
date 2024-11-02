package net.norois.learnmod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CokeDispenerBlock extends Block {
    public CokeDispenerBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {

        player.damage(player.getDamageSources().magic(), 6);

        ItemStack coke = new ItemStack(Registries.ITEM.get(new Identifier("learnmod:coke")));
        player.dropItem(coke, false);

        return ActionResult.SUCCESS;
    }

}
