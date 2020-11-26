package com.estudos.spring;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("Teste executou");
		Assert.assertTrue(true);
	}

}
