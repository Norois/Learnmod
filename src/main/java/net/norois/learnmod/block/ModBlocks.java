package net.norois.learnmod.block;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ExperienceBottleItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.norois.learnmod.LearnMod;
import net.norois.learnmod.block.custom.CokeDispenerBlock;
import net.norois.learnmod.block.custom.RoofTopBlock;

public class ModBlocks {

    // I hate life
    public static final Block LE_BLOCK = registerBlock("le_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));

    public static final Block JUNKO_BLOCK = registerBlock("junko_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));

    public static final Block GODOT = registerBlock("godot",
            new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS)));

    public static final Block JUNKO_ORE = registerBlock("junko_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4f), UniformIntProvider.create(10, 30)));

    public static final Block COKE_DISPENSER = registerBlock("coke_dispenser",
            new CokeDispenerBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block ROOF_TOP = registerBlock("roof_top",
            new RoofTopBlock(FabricBlockSettings.create().instrument(Instrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(LearnMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(LearnMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        LearnMod.LOGGER.info("Registering ModBlocks for " + LearnMod.MOD_ID);
    }
}
