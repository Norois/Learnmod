package net.norois.learnmod.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PhilosophersStone extends Item {

    public PhilosophersStone(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient()){
            BlockPos positionClicked = context.getBlockPos();
            BlockState state = context.getWorld().getBlockState(context.getBlockPos());
            World world = context.getWorld();
            BlockState goldOreState = Blocks.GOLD_ORE.getDefaultState();

            if(state.isOf(Blocks.IRON_ORE)){
                Block.replace(state, goldOreState, world, positionClicked, 0);
            }

        }

        return ActionResult.SUCCESS;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("learnmod.items.philosophers_stone.tooltip"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
