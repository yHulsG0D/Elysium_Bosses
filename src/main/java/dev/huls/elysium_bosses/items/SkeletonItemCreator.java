package dev.huls.elysium_bosses.items;

import dev.huls.elysium_bosses.utils.ItemBuilder;
import dev.huls.elysium_bosses.utils.SkullAPI;
import org.bukkit.inventory.ItemStack;

public class SkeletonItemCreator {

    public static ItemStack skeletonspawn = new ItemBuilder(SkullAPI.skullFromUrl("https://textures.minecraft.net/texture/bb5fb68990d289b922d945137a096011766e1f1460e7dea5b20772f4be54937"))
            .name("§4§lBOSS ESQUELETO")
            .lore("§7Utilize este item para")
            .lore("§7invocar um boss esqueleto")
            .build();
}
