package com.shrapnitek.ssi2;

import com.shrapnitek.ssi2.blocks.ModBlocks;
import com.shrapnitek.ssi2.items.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SSI2 implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	public static final String MOD_ID = "ssi2";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Begin loading " + MOD_ID);

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		LOGGER.info("Finished loading " + MOD_ID);
	}
}
