package net.norois.learnmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.tutorial.TutorialManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.norois.learnmod.LearnMod;
import net.norois.learnmod.item.custom.GeodeDetectorItem;
import net.norois.learnmod.item.custom.PhilosophersStone;

public class ModItems {
    public static final Item TALISMAN = registerItem("talisman", new Item(new FabricItemSettings().food(ModFoodComponents.TALISMAN)));
    public static final Item LE = registerItem("le", new Item(new FabricItemSettings()));
    public static final Item VEIN = registerItem("vein", new Item(new FabricItemSettings()));
    public static final Item JUNKO = registerItem("junko", new Item(new FabricItemSettings()));
    public static final Item JUNKO_RAW = registerItem("junko_raw", new Item(new FabricItemSettings()));
    public static final Item GEODE_DETECTOR = registerItem("geode_detector",
            new GeodeDetectorItem(new FabricItemSettings().maxDamage(64)));
    public static final Item PHILOSOPHERS_STONE = registerItem("philosophers_stone",
            new PhilosophersStone(new FabricItemSettings()));
    public static final Item COKE = registerItem("coke", new Item(new FabricItemSettings().food(ModFoodComponents.COKE)));

    private static void addItemsToIngredientsTabItemGroup(FabricItemGroupEntries entries){
        entries.add(VEIN);
    }

    private static Item registerItem(String name, Item item ){
        return Registry.register(Registries.ITEM, new Identifier(LearnMod.MOD_ID, name), item);

    }

    public static void registerModItems(){
        LearnMod.LOGGER.info("Registering Mod Items for " + LearnMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsTabItemGroup);
    }
}
