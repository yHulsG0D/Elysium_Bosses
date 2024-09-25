package dev.huls.elysium_bosses.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Base64;
import java.util.UUID;

public class SkullAPI {
    private static final String DEFAULT_SKULL_URL = "https://textures.minecraft.net/texture/";

    private static final ItemStack DEFAULT_SKULL_ITEM = new ItemStack(Material.PLAYER_HEAD);

    private static Field blockProfileField;

    private static String url;

    public static ItemStack skullFromName(String name) {
        return Bukkit.getUnsafe()
                .modifyItemStack(
                        DEFAULT_SKULL_ITEM.clone(),
                        "{SkullOwner:\"" + name + "\"}"
                ).clone();
    }

    public static ItemStack skullFromBase64(String base64) {
        final UUID hashAsId = new UUID(base64.hashCode(), base64.hashCode());
        return Bukkit.getUnsafe()
                .modifyItemStack(
                        DEFAULT_SKULL_ITEM.clone(),
                        "{SkullOwner:{Id:\"" + hashAsId + "\",Properties:{textures:[{Value:\"" + base64 + "\"}]}}}"
                ).clone();
    }
    private static String urlToBase64(String url) {
        try {
            final URI actualUrl = new URI(url);

            final String toEncode = "{\"textures\":{\"SKIN\":{\"url\":\"" + actualUrl + "\"}}}";
            return Base64.getEncoder()
                    .encodeToString(toEncode.getBytes());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public static ItemStack skullFromUrl(String url) {
        if (!url.startsWith(DEFAULT_SKULL_URL)) url = DEFAULT_SKULL_URL + url;

        final String base64 = urlToBase64(url);
        return skullFromBase64(base64);
    }
}
