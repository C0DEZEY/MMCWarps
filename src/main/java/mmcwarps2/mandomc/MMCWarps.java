package mmcwarps2.mandomc;

import mmcwarps2.mandomc.commands.Spawn;
import mmcwarps2.mandomc.commands.Warp;
import mmcwarps2.mandomc.listeners.InventoryClick;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class MMCWarps extends JavaPlugin {

    public static HashMap<Player, Boolean> isPlayerTeleporting = new HashMap<>();

    @Override
    public void onEnable() {
        getCommand("warp").setExecutor(new Warp());
        getCommand("spawn").setExecutor(new Spawn());

        getServer().getPluginManager().registerEvents(new InventoryClick(), this);

        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[MMCWarps]: Plugin is enabled!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[MMCWarps]: Plugin is disabled!");
    }

    public static JavaPlugin getPlugin(){
        return getPlugin();
    }
}
