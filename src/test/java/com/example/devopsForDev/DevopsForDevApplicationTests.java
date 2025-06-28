package com.example.devopsForDev;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
class DevopsForDevApplicationTests {

	private MockMvc mockMvc;

	@Test
	public void testGreetingsEndpoint() throws Exception {
		String name = "Shuchi";

		mockMvc.perform(MockMvcRequestBuilders.get("/greetings/{name}", name))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Hello " + name.split(" ")[0] + " Congratulations you have successfully completed Jenkins CI/CD demo !"));
	}

}
