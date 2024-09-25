package dev.huls.elysium_bosses.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class CancelDamageListener implements Listener {

    @EventHandler
    public void cancelDamage(EntityDamageEvent event) {
        if (event.getEntity().hasMetadata("boss")) {
            if(!(event.getCause() == EntityDamageEvent.DamageCause.ENTITY_ATTACK)) {
                event.setCancelled(true);
            }
        }
    }
}
