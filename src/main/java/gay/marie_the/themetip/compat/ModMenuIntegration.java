package gay.marie_the.themetip.compat;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import gay.marie_the.themetip.config.ThemetipConfig;
import gay.marie_the.themetip.Themetip;

public class ModMenuIntegration implements ModMenuApi {
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        Themetip.LOGGER.atInfo().log("Loading themetip config");
        return screen -> ThemetipConfig.HANDLER.generateGui().generateScreen(screen);

    }
}
