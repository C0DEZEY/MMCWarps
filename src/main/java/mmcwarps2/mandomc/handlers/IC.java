package mmcwarps2.mandomc.handlers;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import java.util.Base64;



public class IC {



    public static Inventory createWarp(Player player){
        Inventory warps = Bukkit.createInventory(player, 54, createString("&2&lMandoMC Warps"));


        // All warps in descending order

        warps.setItem(9, ISC.createItem(Material.RED_GLAZED_TERRACOTTA, createString("&4&lDathomir"),  createString("&c→ Claimable")));
        warps.setItem(11, ISC.createItem(Material.MAGMA_BLOCK, createString("&4&lMustafar"), createString("&c→ Claimable")));
        warps.setItem(13, ISC.createItem(Material.MANGROVE_WOOD, createString("&a&lEarth"), createString("&c→ Factions")));
        warps.setItem(15, ISC.createItem(Material.WARPED_HYPHAE, createString("&1&lUmbara"), createString("&c→ Claimable")));
        warps.setItem(17, ISC.createItem(Material.GREEN_CONCRETE_POWDER, createString("&a&lAlderaan"), createString("&c→ Claimable")));
        warps.setItem(27, ISC.createItem(Material.MUD_BRICKS, createString("&9&lConcordia"), createString("&9→ Mines"), createString("&4→ PvP Arena")));
        warps.setItem(29, ISC.createItem(Material.JUNGLE_WOOD, createString("&2&lKashyyyk"), createString("&6→ Farms")));
        warps.setItem(31, ISC.createItem(Material.PRISMARINE, createString("&b&lNaboo"), createString("&a→ Spawn"), createString("&c→ Claimable")));
        warps.setItem(33, ISC.createItem(Material.BLUE_ICE, createString("&b&lIlum"), createString("&6→ Kyber Crystals")));
        warps.setItem(35, ISC.createItem(Material.SMOOTH_RED_SANDSTONE, createString("&6&lGeonosis"), createString("&c→ Claimable")));
        warps.setItem(45, ISC.createItem(Material.MANGROVE_WOOD, createString("&2&lMorak"), createString("&c→ Claimable")));
        warps.setItem(47, ISC.createItem(Material.SANDSTONE, createString("&6&lTatooine"), createString("&a→ Shops"), createString("&6→ Boss Fight"), createString("&8→ Black Market")));
        warps.setItem(49, ISC.createItem(Material.SNOW_BLOCK, createString("&f&lHoth"), createString("&c→ Claimable"), createString("&f→ KOTH")));
        warps.setItem(51, ISC.createItem(Material.NETHERITE_BLOCK, createString("&8&lMandalore"), createString("&6→ Boss Fight"), createString("&7→ Mines")));

        for (int slot = 0; slot < 54; slot++) {
            ItemStack item = warps.getItem(slot);if (item == null || item.getType() == Material.AIR) {
                warps.setItem(slot, ISC.createItem(Material.BLACK_STAINED_GLASS_PANE, createString("&a"),  createString("&a")));
            }
        }


        return warps;
    }

    public static Inventory createTatooine(Player player){

        Inventory tatooine = Bukkit.createInventory(player, 54, createString("&6&lTatooine"));

        tatooine.setItem(24, ISC.createItem(Material.CHISELED_SANDSTONE, createString("&6&lMos Eisley"), createString("&a→ Shops")));
        tatooine.setItem(34, ISC.createItem(Material.TINTED_GLASS, createString("&8&lBlack Market"), createString("&8→ Black Market")));
        tatooine.setItem(37, ISC.createItem(Material.GREEN_TERRACOTTA, createString("&2&lJabba's Palace"), createString("&6→ Boss Fight")));

        for (int slot = 0; slot < 54; slot++) {
            ItemStack item = tatooine.getItem(slot);if (item == null || item.getType() == Material.AIR) {
                tatooine.setItem(slot, ISC.createItem(Material.BLACK_STAINED_GLASS_PANE, createString("&a"),  createString("&a")));
            }
        }

        return tatooine;
    }

    public static Inventory createConcordia(Player player){

        Inventory concordia = Bukkit.createInventory(player, 54, createString("&6&lConcordia"));

        concordia.setItem(38, ISC.createItem(Material.BLACKSTONE_WALL, createString("&9&lDeath Watch Arena"), createString("&4→ PvP Arena")));
        concordia.setItem(24, ISC.createItem(Material.DIAMOND_ORE, createString("&b&lConcordian Mines"), createString("&9→ Mines")));

        for (int slot = 0; slot < 54; slot++) {
            ItemStack item = concordia.getItem(slot);if (item == null || item.getType() == Material.AIR) {
                concordia.setItem(slot, ISC.createItem(Material.BLACK_STAINED_GLASS_PANE, createString("&a"),  createString("&a")));
            }
        }

        return concordia;
    }

    public static Inventory createGeonosis(Player player){

        Inventory geonosis = Bukkit.createInventory(player, 54, ChatColor.GOLD + "" + ChatColor.BOLD + "Geonosis");

        geonosis.setItem(19, ISC.createItem(Material.RED_SANDSTONE_WALL, createString("&6&lGeonosis Arena"), createString("&6→ Boss Fight &oComing soon...")));
        geonosis.setItem(42, ISC.createItem(Material.BONE_BLOCK, createString("&6&lGeonosis"), createString("&c→ Claimable")));
        for (int slot = 0; slot < 54; slot++) {
            ItemStack item = geonosis.getItem(slot);if (item == null || item.getType() == Material.AIR) {
                geonosis.setItem(slot, ISC.createItem(Material.BLACK_STAINED_GLASS_PANE, createString("&a"),  createString("&a")));
            }
        }
        return geonosis;
    }

    public static String createString(String s){
        return ChatColor.translateAlternateColorCodes('&', s);
    }

}
