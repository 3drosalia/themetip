package gay.marie_the.themetip.compat;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import gay.marie_the.themetip.config.ThemetipConfig;

public class ModMenuIntegration implements ModMenuApi {
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return screen -> ThemetipConfig.HANDLER.generateGui().generateScreen(screen);
    }
}
