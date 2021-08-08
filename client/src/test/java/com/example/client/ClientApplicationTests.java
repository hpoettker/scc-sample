package com.example.client;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @see https://stackoverflow.com/questions/68702479/disable-config-service-client-activated-with-spring-config-import-in-springboott
 */
@Disabled
@SpringBootTest(properties = "spring.cloud.config.enabled=false")
class ClientApplicationTests {

	@Test
	void contextLoads() {
	}

}
