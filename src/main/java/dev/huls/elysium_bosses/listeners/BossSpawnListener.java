package dev.huls.elysium_bosses.listeners;

import dev.huls.elysium_bosses.bosses.SkeletonBoss;
import dev.huls.elysium_bosses.items.SkeletonItemCreator;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class BossSpawnListener implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        if (event.getItem() == null) {
            return;
        }
        if (!(event.getAction().isRightClick())) {
            return;
        }
        if (!(event.getItem().getType() == Material.PLAYER_HEAD)) {
            return;
        }
        if (!(event.getItem()).getItemMeta().getDisplayName().equals("§4§lBOSS ESQUELETO")) {
            return;
        }
        event.getPlayer().sendMessage("§c§lBoss spawned!");
        SkeletonBoss.MobSpawnLocation = event.getInteractionPoint();
        SkeletonBoss.spawnSkeleton();
        event.getPlayer().getInventory().removeItem(SkeletonItemCreator.skeletonspawn);
    }
}