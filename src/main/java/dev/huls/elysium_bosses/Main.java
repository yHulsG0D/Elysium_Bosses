package dev.huls.elysium_bosses;

import dev.huls.elysium_bosses.listeners.*;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new BossSpawnListener(), this);
        getServer().getPluginManager().registerEvents(new InvocatorPlaceListener(), this);
        getServer().getPluginManager().registerEvents(new BossDeathListener(), this);
        getServer().getPluginManager().registerEvents(new BossDamageListener(), this);
        getServer().getPluginManager().registerEvents(new CancelDamageListener(), this);
        Objects.requireNonNull(getCommand("giveboss")).setExecutor(new dev.huls.elysium_bosses.commands.GiveInvocatorCommand());
    }
    @Override
    public void onDisable() {
    }
}
