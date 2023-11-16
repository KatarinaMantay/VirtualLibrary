package dev.katie.virtuallibrary.guis;

import dev.katie.virtuallibrary.Util;
import dev.katie.virtuallibrary.guis.GUIHolder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUISelector implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player player)) return false;

        /*
        We can make an event that listens for when a player clicks in an inventory that has a holder of
        "GUIHolder" and from that point on, we can grab data such as who owns the inventory
         */
        player.openInventory(createInv(player));
        return true;
    }


    private Inventory createInv(Player player) {
        Inventory inventory = Bukkit.createInventory(new GUIHolder(player, GUIType.SELECTOR), 27, player.getName() + "'s Library");

        ItemStack newBook = Util.createGUIItem("New Book", Material.WRITABLE_BOOK, false, null);
        ItemStack library = Util.createGUIItem("Library", Material.ENCHANTED_BOOK, false, null);
        ItemStack addBook = Util.createGUIItem("Add Book", Material.PAPER, false, null);

        inventory.setItem(11,newBook);
        inventory.setItem(13,library);
        inventory.setItem(15,addBook);

        return inventory;
    }

    // 0  1  2  3  4  5  6  7  8
    // 9  10 11 12 13 14 15 16 17
    // 18 19 20 21 22 23 24 25 26

}
