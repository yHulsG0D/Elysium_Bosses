package dev.huls.elysium_bosses.listeners;

import dev.huls.elysium_bosses.utils.Formatter;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class BossDamageListener implements Listener {

    @EventHandler
    public void damageBoss(EntityDamageByEntityEvent event) {
        if (!(event.getDamager() instanceof Player)) {
            event.setCancelled(true);
        }
        if (!(event.getEntity().hasMetadata("boss")) && !(event.getDamager() instanceof Player)) {
            return;
        }
        if (event.getEntity().getType() == EntityType.SKELETON) {
            Skeleton boss = (Skeleton) event.getEntity();
            boss.setCustomName("§4§lBOSS ESQUELETO §8(❤" + Formatter.formatDecimals(boss.getHealth(), 0, true) + "§8)");
        }
    }
}