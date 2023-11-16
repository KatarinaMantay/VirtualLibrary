package dev.katie.virtuallibrary.guis;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public class GUIHolder implements InventoryHolder {

    private Player player;
    private GUIType guiType;

    public GUIHolder(Player player, GUIType guiType) {
        this.player = player;
        this.guiType = guiType;
    }


    @Override
    public Inventory getInventory() {
        return null;
    }

    public Player getPlayer() {
        return player;
    }

    public GUIType guiType() {
        return guiType;
    }
}
