package mmcwarps2.mandomc.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Spawn implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            Location spawn = new Location(Bukkit.getWorld("Naboo"), -12868, 142, 1262, -3.27f, -1.83f);
            player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWarps" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.GOLD + "" + ChatColor.BOLD + "Naboo" + ChatColor.GRAY + "!");
            player.teleport(spawn);
        }

        return true;
    }
}
