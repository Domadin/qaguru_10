package tests;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import configs.ApiConfig;

public class ApiTest {
    @Test
    void test() {
        ApiConfig props = ConfigFactory.create(ApiConfig.class);
        System.out.println(props.token());
        System.out.println(props.url());
    }
}
