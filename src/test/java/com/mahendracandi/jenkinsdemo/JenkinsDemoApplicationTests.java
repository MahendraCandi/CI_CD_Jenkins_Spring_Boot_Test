package com.mahendracandi.jenkinsdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//@SpringBootTest
class JenkinsDemoApplicationTests {

	Calculator underTest = new Calculator();

	@Test
	void itShouldAddTwoNumbers() {
		// given
		int first = 20;
		int second = 30;

		// when
		int result = underTest.add(first, second);

		// then
		assertThat(result).isEqualTo(50);
	}

	@Test
	void itShouldZero() {
		// given
		int first = 10;
		int second = 10;

		// when
		int result = underTest.subtract(first, second);

		// then
		assertThat(result).isEqualTo(0);
	}

	class Calculator {
		int add(int a, int b) {
			return a + b;
		}
		int subtract(int a, int b) {
			return a - b;
		}
	}

}
