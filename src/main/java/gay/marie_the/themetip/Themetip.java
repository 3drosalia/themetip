package gay.marie_the.themetip;

import gay.marie_the.themetip.config.ThemetipConfig;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Themetip implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "themetip";
    public static final Logger LOGGER = LoggerFactory.getLogger("themetip");

	@Override
	public void onInitialize() {
		ThemetipConfig.HANDLER.load();
		LOGGER.atInfo().log("themetip initialized");
	}

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}