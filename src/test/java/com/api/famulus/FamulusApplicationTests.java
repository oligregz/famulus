package com.api.famulus;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/*
 * add @SpringBootTest annotation again for create tests
 * and import > org.springframework.boot.test.context.SpringBootTest;
 * 
 * remove @SpringBootApplication(exclude = { DataSourceAutoConfiguration.class }) 
 * annotation for create tests
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
class FamulusApplicationTests {

	@Test
	void contextLoads() {
	}

}
