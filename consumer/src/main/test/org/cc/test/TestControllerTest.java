package org.cc.test;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.PrintWriter;

import org.cc.application.Application;
import org.cc.controller.TestController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class TestControllerTest {
	@Autowired
	private TestController raiderController;
	private MockMvc mockMvc;

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.standaloneSetup(raiderController).build();
	}

	@Test
	public void testView() {
		try {
			MvcResult mvcResult = mockMvc
					.perform(MockMvcRequestBuilders.get("/test").contentType(MediaType.APPLICATION_JSON)
							.characterEncoding("utf-8"))
					.andExpect(status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();
			PrintWriter printWriter = mvcResult.getResponse().getWriter();
			System.out.println(printWriter.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("成功", raiderController.test());
	}
}
