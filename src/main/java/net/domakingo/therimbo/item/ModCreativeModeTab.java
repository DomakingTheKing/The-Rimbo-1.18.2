package net.domakingo.therimbo.item;

import net.domakingo.therimbo.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
        public static final CreativeModeTab THERIMBO_TAB = new CreativeModeTab("therimbotab") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(ModBlocks.CAGE.get());
            }
        };
    }

