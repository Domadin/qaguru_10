package tests;

import com.codeborne.selenide.Configuration;
import configs.BrowserConfig;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public abstract class BaseTest {

    @BeforeAll
    static void setup() {
        addListener("AllureSelenide", new AllureSelenide());
        Configuration.startMaximized = true;

        BrowserConfig config = ConfigFactory.create(BrowserConfig.class);

        if ("remote".equals(System.getProperty("browser.type"))) {
            Configuration.remote = config.browserRemoteUrl();
        }
        Configuration.browser = config.browserName();
        Configuration.browserVersion = config.browserVersion();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
    }
}
