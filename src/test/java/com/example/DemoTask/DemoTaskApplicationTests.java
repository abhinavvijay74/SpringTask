package com.example.DemoTask;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class DemoTaskApplicationTests {

	private Calculator c=new Calculator();
	@Test
    void checksum()
	{
		int expectedResult=17;
		int result=c.dosum(12,5);
		assertThat(result).isEqualTo(expectedResult);
	}

	@Test
	void checkproduct()
	{
		int expectedResult=60;
		int result=c.doproduct(5,12);
		assertThat(result).isEqualTo(expectedResult);
	}
}
