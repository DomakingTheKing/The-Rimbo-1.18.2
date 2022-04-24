package net.domakingo.therimbo.item;

import net.domakingo.therimbo.TheRimbo;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TheRimbo.MOD_ID);

    public static final RegistryObject<Item> WALKINGBOWL = ITEMS.register("walking_bowl",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.THERIMBO_TAB).stacksTo(1)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
