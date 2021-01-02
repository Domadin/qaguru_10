package configs;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.Sources;

import static org.aeonbits.owner.Config.LoadType.MERGE;

@LoadPolicy(MERGE)
@Sources({"classpath:${browser.type}.properties",
        "system:properties"})
public interface BrowserConfig extends Config {

    @Key("browser.url")
    String browserRemoteUrl();

    @Key("browser.name")
    String browserName();

    @Key("browser.version")
    String browserVersion();
}
