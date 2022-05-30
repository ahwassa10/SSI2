package com.shrapnitek.ssi2.items;

import com.shrapnitek.ssi2.SSI2;
import com.shrapnitek.ssi2.items.custom.MetalDetector;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item PURPLE_GEM = registerItem("purple_gem",
            new Item(new FabricItemSettings().group(ModItemGroup.SSI2_ITEMGROUP)));

    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetector(new FabricItemSettings()
                    .group(ModItemGroup.SSI2_ITEMGROUP)
                    .maxDamage(32)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SSI2.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SSI2.LOGGER.info("Registering Mod Items for " + SSI2.MOD_ID);

    }

}
