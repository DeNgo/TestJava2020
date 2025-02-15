package com.imatia.price_service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class PriceServiceApiApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void test1() throws Exception {
		mockMvc.perform(get("/api/prices")
						.param("applicationDate", "2020-06-14-10.00.00")
						.param("productId", "35455")
						.param("brandId", "1"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.priceList").value(1))
				.andExpect(jsonPath("$.price").value(35.50));
	}

	@Test
	public void test2() throws Exception {
		mockMvc.perform(get("/api/prices")
						.param("applicationDate", "2020-06-14-16.00.00")
						.param("productId", "35455")
						.param("brandId", "1"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.priceList").value(2))
				.andExpect(jsonPath("$.price").value(25.45));
	}

	@Test
	public void test3() throws Exception {
		mockMvc.perform(get("/api/prices")
						.param("applicationDate", "2020-06-14-21.00.00")
						.param("productId", "35455")
						.param("brandId", "1"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.priceList").value(1))
				.andExpect(jsonPath("$.price").value(35.50));
	}

	@Test
	public void test4() throws Exception {
		mockMvc.perform(get("/api/prices")
						.param("applicationDate", "2020-06-15-10.00.00")
						.param("productId", "35455")
						.param("brandId", "1"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.priceList").value(3))
				.andExpect(jsonPath("$.price").value(30.50));
	}

	@Test
	public void test5() throws Exception {
		mockMvc.perform(get("/api/prices")
						.param("applicationDate", "2020-06-16-21.00.00")
						.param("productId", "35455")
						.param("brandId", "1"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.priceList").value(4))
				.andExpect(jsonPath("$.price").value(38.95));
	}
}
