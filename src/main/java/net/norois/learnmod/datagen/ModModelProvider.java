package net.norois.learnmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.norois.learnmod.block.ModBlocks;
import net.norois.learnmod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JUNKO_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JUNKO_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JUNKO_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COKE_DISPENSER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LE_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.LE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TALISMAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GEODE_DETECTOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.JUNKO, Models.GENERATED);
        itemModelGenerator.register(ModItems.JUNKO_RAW, Models.GENERATED);
        itemModelGenerator.register(ModItems.PHILOSOPHERS_STONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.VEIN, Models.GENERATED);

    }
}
