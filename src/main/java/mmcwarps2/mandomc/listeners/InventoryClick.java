package mmcwarps2.mandomc.listeners;

import mmcwarps2.mandomc.MMCWarps;
import mmcwarps2.mandomc.handlers.IC;
import mmcwarps2.mandomc.handlers.ISC;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import static org.bukkit.Material.MELON_SEEDS;
import static org.bukkit.Material.SMOOTH_RED_SANDSTONE;

public class InventoryClick implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {

        Player player = (Player) event.getWhoClicked();

        if (event.getCurrentItem() == null) {
            return;
        }

        Inventory warps = IC.createWarp(player);

        Inventory geonosis = IC.createGeonosis(player);

        Inventory tatooine = IC.createTatooine(player);

        Inventory concordia = IC.createConcordia(player);

        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "MandoMC Warps")) {
            event.setCancelled(true);
            switch (event.getSlot()) {
                case 45:
                    Location morak = new Location(Bukkit.getWorld("Morak"), -342, 117, -292, -52.1f, -3.4f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWarps" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Morak" + ChatColor.GRAY + "!");
                    player.teleport(morak);
                    player.updateInventory();
                    break;
                case 33:
                    Location ilum = new Location(Bukkit.getWorld("Ilum"), 11.6, -60, -55.6, 1.8f, 4.5f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWarps" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.AQUA + "" + ChatColor.BOLD + "Ilum" + ChatColor.GRAY + "!");
                    player.teleport(ilum);
                    player.updateInventory();
                    break;
                case 51:
                    Location mandalore = new Location(Bukkit.getWorld("Mandalore"), -33, -60, 20, -92.75f, -5.2f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWarps" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Mandalore" + ChatColor.GRAY + "!");
                    player.teleport(mandalore);
                    player.updateInventory();
                    break;
                case 9:
                    Location dathomir = new Location(Bukkit.getWorld("Dathomir"), 21, 66, -58, -34.3f, 2.7f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWarps" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.DARK_RED + "" + ChatColor.BOLD + "Dathomir" + ChatColor.GRAY + "!");
                    player.teleport(dathomir);
                    player.updateInventory();
                    break;
                case 15:
                    Location umbara = new Location(Bukkit.getWorld("Umbara"), -23, 73, -21, 44.1f, -2.1f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWarps" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.BLUE + "" + ChatColor.BOLD + "Umbara" + ChatColor.GRAY + "!");
                    player.teleport(umbara);
                    player.updateInventory();
                    break;
                case 29:
                    Location kashyyyk = new Location(Bukkit.getWorld("Kashyyyk"), -163, 39, 17, -138.83f, -3.23f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWarps" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Kashyyyk" + ChatColor.GRAY + "!");
                    player.teleport(kashyyyk);
                    player.updateInventory();
                    break;
                case 17:
                    Location alderaan = new Location(Bukkit.getWorld("Alderaan"), -169, 42, 184, -161.8f, -6.8f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWarps" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Alderaan" + ChatColor.GRAY + "!");
                    player.teleport(alderaan);
                    player.updateInventory();
                    break;
                case 49:
                    Location hoth = new Location(Bukkit.getWorld("Hoth"), -38, 98, -140, -25.5f, 8.6f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWarps" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.WHITE + "" + ChatColor.BOLD + "Hoth" + ChatColor.GRAY + "!");
                    player.teleport(hoth);
                    player.updateInventory();
                    break;
                case 31:
                    Location naboo = new Location(Bukkit.getWorld("Naboo"), -12868, 142, 1262, -3.27f, -1.83f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWarps" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.AQUA + "" + ChatColor.BOLD + "Naboo" + ChatColor.GRAY + "!");
                    player.teleport(naboo);
                    player.updateInventory();
                    break;
                case 27:
                    player.openInventory(concordia);
                    break;
                case 47:
                    player.openInventory(tatooine);
                    break;
                case 11:
                    Location mustafar = new Location(Bukkit.getWorld("Mustafar"), -3, 62, -43, 51.9f, -17.8f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWarps" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.DARK_RED + "" + ChatColor.BOLD + "Mustafar" + ChatColor.GRAY + "!");
                    player.teleport(mustafar);
                    player.updateInventory();
                    break;
                case 13:
                    Location Earth = new Location(Bukkit.getWorld("Earth"), -3, 62, -43, 51.9f, -17.8f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWarps" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.GREEN + "" + ChatColor.BOLD + "Earth" + ChatColor.GRAY + "!");
                    player.teleport(Earth);
                    player.updateInventory();
                case 35:
                    player.openInventory(geonosis);
                    break;
            }
        }
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.GOLD + "" + ChatColor.BOLD + "Geonosis")) {
            event.setCancelled(true);
            switch (event.getSlot()) {
                case 19:
                    /*Location arena = new Location(Bukkit.getWorld("GeonosisArena"),15424, 44, -2061, 83.05f, -3.2f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWarps" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to the " + ChatColor.GOLD + "" + ChatColor.BOLD + "Geonosis Arena" + ChatColor.GRAY + "!");
                    player.teleport(arena);
                    player.updateInventory();
                    break;*/
                case 42:
                    Location geonosisLoc = new Location(Bukkit.getWorld("Geonosis"), 59, 66, -152, 110.8f, 0.4f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWarps" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.GOLD + "" + ChatColor.BOLD + "Geonosis" + ChatColor.GRAY + "!");
                    player.teleport(geonosisLoc);
                    player.updateInventory();
                    break;
            }
        }
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.GOLD + "" + ChatColor.BOLD + "Tatooine")) {
            event.setCancelled(true);
            switch (event.getSlot()) {
                case 24:
                    Location spawn = new Location(Bukkit.getWorld("Tatooine"),1883, 60, 161, 98.00916f, 5.051999f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWarps" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.GOLD + "" + ChatColor.BOLD + "Mos Eisley" + ChatColor.GRAY + "!");
                    player.teleport(spawn);
                    player.updateInventory();
                    break;
                case 34:
                    Location blackMarket = new Location(Bukkit.getWorld("Tatooine"),1682, 51, 181, 179.0379f, 4.9510083f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWarps" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to the " + ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Black Market" + ChatColor.GRAY + "!");
                    player.teleport(blackMarket);
                    player.updateInventory();
                    break;
                case 37:
                    Location jabba = new Location(Bukkit.getWorld("JabbasPalace"),-122, -50, 142, 180f, 0f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWarps" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Jabba's Palace" + ChatColor.GRAY + "!");
                    player.teleport(jabba);
                    player.updateInventory();
                    break;
            }
        }
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.GOLD + "" + ChatColor.BOLD + "Concordia")) {
            event.setCancelled(true);
            switch (event.getSlot()) {
                case 24:
                    Location mines = new Location(Bukkit.getWorld("Concordia"),15424, 44, -2061, 83.05f, -3.2f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWarps" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to the " + ChatColor.AQUA + "" + ChatColor.BOLD + "Concordian Mines" + ChatColor.GRAY + "!");
                    player.teleport(mines);
                    player.updateInventory();
                    break;
                case 38:
                    Location arena = new Location(Bukkit.getWorld("Concordia"),16093, 34, -3176, 151.46f, -2.23f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWarps" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to the " + ChatColor.BLUE + "" + ChatColor.BOLD + "Death Watch Arena" + ChatColor.GRAY + "!");
                    player.teleport(arena);
                    player.updateInventory();
                    break;
            }
        }
    }

}
