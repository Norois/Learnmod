package net.norois.learnmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.norois.learnmod.LearnMod;
import net.norois.learnmod.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup TOUHOU_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(LearnMod.MOD_ID, "talisman"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.touhou"))
                    .icon(() -> new ItemStack(ModItems.TALISMAN)).entries((displayContext, entries) -> {
                        // Bullets
                        entries.add(ModItems.TALISMAN);

                        // Memes
                        entries.add(ModItems.LE);

                        // Blocks
                        entries.add(ModBlocks.LE_BLOCK);
                        entries.add(ModBlocks.JUNKO_BLOCK);
                        entries.add(ModBlocks.JUNKO_ORE);

                        // Ores
                        entries.add(ModItems.JUNKO);
                        entries.add(ModItems.JUNKO_RAW);

                        // Tools
                        entries.add(ModItems.GEODE_DETECTOR);
                        entries.add(ModItems.PHILOSOPHERS_STONE);
                    }).build());

    public static void registerItemGroups(){
        LearnMod.LOGGER.info("Registering item groups for: " + LearnMod.MOD_ID);
    }
}
