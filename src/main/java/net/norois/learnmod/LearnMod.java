package net.norois.learnmod;

import net.fabricmc.api.ModInitializer;

import net.norois.learnmod.block.ModBlocks;
import net.norois.learnmod.item.ModItemGroups;
import net.norois.learnmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LearnMod implements ModInitializer {
	public static final String MOD_ID = "learnmod";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}