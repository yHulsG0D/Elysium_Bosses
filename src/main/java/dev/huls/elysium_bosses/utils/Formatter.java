package dev.huls.elysium_bosses.utils;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Locale;

public class Formatter extends JavaPlugin {

    public static String formatDecimals(Double value, int decimalsQuantity){
        return String.format(Locale.GERMAN, "%,."+decimalsQuantity+"f", value);
    }

    public static String formatDecimals(Integer value, int decimalsQuantity){
        return String.format(Locale.GERMAN, "%,."+decimalsQuantity+"f", Double.parseDouble(String.valueOf(value)));
    }

    public static String formatDecimals(Double value, int decimalsQuantity, boolean limited){
        if(limited && value > 999999999){
        }
        return String.format(Locale.GERMAN, "%,."+decimalsQuantity+"f", Double.parseDouble(String.valueOf(value)));
    }

    public static String formatDecimals(Integer value, int decimalsQuantity, boolean limited){
        if(limited && value > 999999999){
        }
        return String.format(Locale.GERMAN, "%,."+decimalsQuantity+"f", Double.parseDouble(String.valueOf(value)));
    }
}