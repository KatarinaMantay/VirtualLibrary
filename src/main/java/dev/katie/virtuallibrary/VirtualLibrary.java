package dev.katie.virtuallibrary;

import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

public final class VirtualLibrary extends JavaPlugin {

    @Override
    public void onEnable() {
        BooksFile.setupFile();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
