package gay.marie_the.themetip.config;

import com.google.gson.GsonBuilder;
import dev.isxander.yacl3.config.v2.api.ConfigClassHandler;
import dev.isxander.yacl3.config.v2.api.SerialEntry;
import dev.isxander.yacl3.config.v2.api.autogen.*;
import dev.isxander.yacl3.config.v2.api.autogen.Boolean;
import dev.isxander.yacl3.config.v2.api.autogen.Label;
import dev.isxander.yacl3.config.v2.api.serializer.GsonConfigSerializerBuilder;
import gay.marie_the.themetip.Themetip;
import jdk.jfr.Category;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextContent;
import org.w3c.dom.css.RGBColor;

import java.awt.*;
import java.nio.file.Path;
import java.util.List;

public class ThemetipConfig {

    public static final Path configFile = FabricLoader.getInstance().getConfigDir().resolve("themetip.json5");

    private static final String mainConfig = "colors";

    private static final String tooltipBorder = "border";
    private static final String tooltipBackground = "background";
    private static final String misc = "misc";

    @AutoGen(category = mainConfig, group = tooltipBorder)
    @ColorField(allowAlpha = false)
    @SerialEntry
    public Color primaryColor = new Color(0x5000ff);
    // 5000ff

    @AutoGen(category = mainConfig, group = tooltipBorder)
    @MasterTickBox(value = "secondaryColor")
    @SerialEntry
    public boolean gradient = true;

    @AutoGen(category = mainConfig, group = tooltipBorder)
    @ColorField(allowAlpha = false)
    @SerialEntry
    public Color secondaryColor = new Color(0x28007f);
    // 28007f

    @AutoGen(category = mainConfig, group = tooltipBackground)
    @ColorField(allowAlpha = false)
    @SerialEntry
    public Color backgroundColor = new Color(0x100010);

    @AutoGen(category = mainConfig, group = misc)
    @MasterTickBox(value = "importantSetting")
    @SerialEntry
    public boolean importantSetting = true;

    @AutoGen(category = mainConfig, group = misc)
    @Label
    @SerialEntry
    public Text githubButton = Text.translatable("gay.marie_the.themetip.github");




    public static final ConfigClassHandler<ThemetipConfig> HANDLER = ConfigClassHandler.createBuilder(ThemetipConfig.class)
            .id(Themetip.id("config"))
            .serializer(config -> GsonConfigSerializerBuilder.create(config)
                    .setPath(configFile)
                    .appendGsonBuilder(GsonBuilder::setPrettyPrinting)
                    .setJson5(true)
                    .build())
            .build();
}
