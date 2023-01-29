package com.conductrator.blueprint;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class BlueprintApplicationTests {

	@Test
	void contextLoads() {
    BlueprintApplication.main(new String[] {});
    assertTrue(true);
	}

}
