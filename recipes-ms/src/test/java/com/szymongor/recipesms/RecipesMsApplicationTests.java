package com.szymongor.recipesms;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = { "spring.cloud.config.debug: true", "port: 4200" })
class RecipesMsApplicationTests {

	@Test
	void contextLoads() {
	}

}
