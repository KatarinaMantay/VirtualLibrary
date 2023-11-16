package dev.katie.virtuallibrary;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class BooksFile {

    private static File file;
    private static YamlConfiguration booksFile;


    public static void setupFile() {
        file = new File("books.yml");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        booksFile = YamlConfiguration.loadConfiguration(file);
    }

    public static YamlConfiguration get() {
        return booksFile;
    }

    public static void save() {
        try {
            booksFile.save(file);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // TODO: add reload method if necessary
}
