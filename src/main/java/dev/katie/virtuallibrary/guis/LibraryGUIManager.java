package dev.katie.virtuallibrary.guis;

import dev.katie.virtuallibrary.BooksFile;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.meta.BookMeta;

import java.util.ArrayList;
import java.util.List;

public class LibraryGUIManager {

    private Player guiRequester;
    //private Inventory gui = Bukkit.createInventory(null, 27, guiRequester.getName() + "'s Library");;
    private List<BookMeta> bookMetas = new ArrayList<>();


    public LibraryGUIManager(Player guiRequester) {
        this.guiRequester = guiRequester; // init requester

        // Loop through all the books the player has on file and add them for bookMetas list
        for (String key : BooksFile.get().getConfigurationSection("books." + guiRequester.getUniqueId()).getKeys(false)) {
            BookMeta bookMeta = (BookMeta) BooksFile.get().get("books." + guiRequester.getUniqueId() + "." + key); // FIXME
            bookMetas.add(bookMeta);
        }
    }



    // -------- new ---------- view -------- add --------



}
