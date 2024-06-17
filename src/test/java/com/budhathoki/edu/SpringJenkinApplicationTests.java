package com.budhathoki.edu;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import ch.qos.logback.classic.Logger;

@SpringBootTest
class SpringJenkinApplicationTests {
	static Logger logger=(Logger) LoggerFactory.getLogger(SpringJenkinApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test case executing...");
		assertEquals(true, true);
	}
	private void assertEquals(boolean b, boolean c) {
		// TODO Auto-generated method stub
		
	}

}
