package com.example.usrmn;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserManagementTests {

	@Test
	void myFirstTest() {
		assertThat(43).isEqualTo(43);
	}


}
