package net.norois.learnmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.norois.learnmod.block.ModBlocks;
import net.norois.learnmod.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipieProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> JUNKO_SMELTABLES = List.of(ModItems.JUNKO_RAW,
            ModBlocks.JUNKO_ORE);

    public ModRecipieProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {
        offerSmelting(consumer, JUNKO_SMELTABLES, RecipeCategory.MISC, ModItems.JUNKO,
                3f, 400, "junko");
    }
}
