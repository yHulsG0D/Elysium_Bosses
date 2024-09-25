package dev.huls.elysium_bosses.commands;

import dev.huls.elysium_bosses.items.SkeletonItemCreator;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GiveInvocatorCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§cEste comando só pode ser executado por um jogador");
            return true;
        }
        if (!(sender.hasPermission("elysium.bosses.give"))) {
            sender.sendMessage("§cVocê não tem permissão para executar este comando");
            return true;
        } else {
            if (strings.length == 0) {
                sender.sendMessage("§cUtilize /giveboss <player>");
                return true;
            }
            Player target = Bukkit.getPlayer(strings[0]);
            if (target == null) {
                sender.sendMessage("§cO jogador informado está offline ou não existe.");
                return true;
            }
            target.getInventory().addItem(SkeletonItemCreator.skeletonspawn);
            target.sendMessage("§aVocê recebeu um invocador de boss esqueleto.");
            return true;
        }
    }
}
