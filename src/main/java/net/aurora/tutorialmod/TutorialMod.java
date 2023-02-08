package net.aurora.tutorialmod;

import net.aurora.tutorialmod.item.ModItemGroup;
import net.aurora.tutorialmod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registrerItemGroups();
		ModItems.registerModItems();
	}
}
