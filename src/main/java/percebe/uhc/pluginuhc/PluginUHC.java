package percebe.uhc.pluginuhc;

import org.bukkit.plugin.java.JavaPlugin;

public final class PluginUHC extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("onEnable is called!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("onDisable is called!");
    }
}
