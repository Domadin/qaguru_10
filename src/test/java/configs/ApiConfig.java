package configs;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.Sources;

import java.net.URL;

import static org.aeonbits.owner.Config.LoadType.MERGE;

@LoadPolicy(MERGE)
@Sources({"classpath:api.properties",
        "system:properties",
        "file:~/secret_token"})
public interface ApiConfig extends Config {

    @Key("api.url")
    URL url();

    @Key("api.token")
    String token();
}
