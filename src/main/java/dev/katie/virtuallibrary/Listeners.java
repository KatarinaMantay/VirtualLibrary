package dev.katie.virtuallibrary;

import dev.katie.virtuallibrary.guis.GUIHolder;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class Listeners implements Listener {

    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent event) {
        if (event.getInventory().getHolder() == null || !(event.getInventory().getHolder() instanceof GUIHolder)) return;
        GUIHolder guiHolder = (GUIHolder) event.getInventory().getHolder();
        
        if (event.getCurrentItem() == null) return;
        Player player = (Player) event.getWhoClicked();
        
        switch (guiHolder.guiType()) {
            case SELECTOR -> {
               whenSelectorGUI(player, event.getCurrentItem());


            }
            
            case LIBRARY -> {
                //
            }
        }
    }


    public void whenSelectorGUI(Player player, ItemStack clickedItem) {

        switch (clickedItem.getType()) {

            case WRITABLE_BOOK -> {
                player.getInventory().addItem(new ItemStack(Material.WRITABLE_BOOK));
                player.closeInventory();
            }

            case ENCHANTED_BOOK -> {

            }

            case PAPER -> {

            }
        }

    }
    
}
