package com.shrapnitek.ssi2.blocks;

import com.shrapnitek.ssi2.SSI2;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    public static final Block PURPLE_GEM_BLOCK = registerBlock("purple_gem_block",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(6f)
                    .requiresTool()),
            ItemGroup.MISC);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(SSI2.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(SSI2.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));

    }

    public static void registerModBlocks() {
        SSI2.LOGGER.info("Registering ModBlocks for " + SSI2.MOD_ID);
    }
}