package com.devopsForDev;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(DevopsForDevApplication.class)
class DevopsForDevApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testGreetingsEndpoint() throws Exception {
		String nam = "Shuchi";

		mockMvc.perform(MockMvcRequestBuilders.get("/greetings/{name}", name))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Hello " + name.split(" ")[0] + " Congratulations you have successfully completed Jenkins CI/CD demo !"));
	}

}
