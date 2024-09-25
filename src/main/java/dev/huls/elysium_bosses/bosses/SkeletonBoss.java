package dev.huls.elysium_bosses.bosses;

import dev.huls.elysium_bosses.Main;
import dev.huls.elysium_bosses.utils.Formatter;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Skeleton;

public class SkeletonBoss {

    public static Location MobSpawnLocation = new Location(Bukkit.getWorld("world"), 0, 0, 0);

    public static void spawnSkeleton() {
        Skeleton boss = (Skeleton) MobSpawnLocation.getWorld().spawnEntity(MobSpawnLocation, EntityType.SKELETON);
        boss.setMaxHealth(20);
        boss.setHealth(20);
        boss.setCustomName("§4§lBOSS ESQUELETO §8(❤" + Formatter.formatDecimals(boss.getHealth(), 0, true) + "§8)");
        boss.setCustomNameVisible(true);
        boss.setMetadata("boss", new org.bukkit.metadata.FixedMetadataValue(Main.getPlugin(Main.class), true));
        ((LivingEntity) boss).setCollidable(false);
        ((LivingEntity) boss).setAI(false);
        ((LivingEntity) boss).setSilent(true);
    }
}
