package gay.marie_the.themetip;

import gay.marie_the.themetip.config.ThemetipConfig;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Themetip implements ModInitializer {
	public static final String MOD_ID = "themetip";
    public static final Logger LOGGER = LoggerFactory.getLogger("themetip");
	public final String version = getClass().getPackage().getImplementationVersion();

	@Override
	public void onInitialize() {
		ThemetipConfig.HANDLER.load();
		// if it says vers null, you're in a dev env.
		LOGGER.atInfo().log(String.format("themetip vers %s initialized",version));
	}

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}