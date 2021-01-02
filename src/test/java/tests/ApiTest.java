package tests;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import properties.ApiProperties;

public class ApiTest {
    @Test
    void test() {
        ApiProperties props = ConfigFactory.create(ApiProperties.class);
        System.out.println(props.token());
        System.out.println(props.url());
    }
}
