package dev.huls.elysium_bosses.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class BossDeathListener implements Listener {

    @EventHandler
    public void onBossDeath(org.bukkit.event.entity.EntityDeathEvent event) {
        if (event.getEntity().hasMetadata("boss")) {
            event.setDroppedExp(0);
            event.getDrops().clear();
            if(event.getEntity().getKiller() != null) {
                event.getEntity().getKiller().sendMessage("§2§lPARABENS! §aVocê eliminou o Boss Esqueleto.");
            }
        }
    }
}
