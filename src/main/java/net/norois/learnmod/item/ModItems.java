package net.norois.learnmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.tutorial.TutorialManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.norois.learnmod.LearnMod;

public class ModItems {
    public static final Item TALISMAN = registerItem("talisman", new Item(new FabricItemSettings()));
    public static final Item LE = registerItem("le", new Item(new FabricItemSettings()));
    public static final Item VEIN = registerItem("vein", new Item(new FabricItemSettings()));
    public static final Item JUNKO = registerItem("junko", new Item(new FabricItemSettings()));
    public static final Item JUNKO_RAW = registerItem("junko_raw", new Item(new FabricItemSettings()));

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