package eu.blacky62.alwaysnv.utils;

import eu.blacky62.alwaysnv.NightVisionMain;
import org.bukkit.Bukkit;

public class Managers {


    private static NightVisionMain instance;
    private Managers managers;

    public void load(NightVisionMain instance) {
        this.instance = instance;
        this.managers = this;

        Bukkit.getConsoleSender().sendMessage("§2[§dAlwaysNV§2] §aPlugin succesfully loaded !"); // Sending a console message when the plugin is succesfully loaded.

    }

    public void unload() {

        Bukkit.getConsoleSender().sendMessage("§2[§dAlwaysNV§2] §aPlugin succesfully unloaded !"); // Sending a console message when the plugin is succesfully unloaded.

    }

    public NightVisionMain getInstance() {
        return instance;
    }
}
