package eu.blacky62.alwaysnv;

import eu.blacky62.alwaysnv.utils.Managers;
import eu.blacky62.alwaysnv.utils.PluginListeners;
import org.bukkit.plugin.java.JavaPlugin;

public class NightVisionMain extends JavaPlugin {
    Managers managers = new Managers();

    @Override
    public void onEnable() {
        managers.load(this);
        getServer().getPluginManager().registerEvents(new PluginListeners(), this);
    }



    @Override
    public void onDisable() {
        managers.unload();
    }
}
