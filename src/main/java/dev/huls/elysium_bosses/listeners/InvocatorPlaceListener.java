package dev.huls.elysium_bosses.listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class InvocatorPlaceListener implements Listener {

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        if(event.getBlock().getType() == Material.PLAYER_HEAD) {
            event.setCancelled(true);
            event.getPlayer().sendMessage("§c§lVocê não pode colocar este bloco!");
        }
    }
}
