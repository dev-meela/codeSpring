package org.zerock.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)

//Test for Controller
@WebAppConfiguration  // Servlet의 ServletContext를 이용하기 위해서 적용하는 어노테이션, WebApplicationContext를 이용하기 위해서
@ContextConfiguration(classes = {
		org.zerock.config.RootConfig.class,
		org.zerock.config.ServletConfig.class})
@Log4j
public class BoardControllerTests {
	
	@Setter(onMethod_ = {@Autowired})
	private WebApplicationContext ctx;
	
	private MockMvc mockMvc; // 가짜로 url과 파라미터 등을 브라우저에서 쓰는것처럼 만들어서 Controller를 실행해 볼 수 있게 함
	
	@Before  // 모든 테스트 전에 매번 실행되는 메서드를 지정하는 어노테이션 
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	/*
	@Test
	public void testList() throws Exception {
		log.info(
			mockMvc.perform(MockMvcRequestBuilders.get("/board/list"))  // get 방식의 호출 
			.andReturn()
			.getModelAndView()
			.getModelMap());
	}
	
	@Test
	public void testRegister() throws Exception{
		
		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/board/register")  // post 방식으로 데이터 전달
				.param("title", "테스트 새글 제목")  // param() 으로 전달해야할 파라미터들을 지정
				.param("content", "테스트 새글 내용")
				.param("writer", "user00")
		).andReturn().getModelAndView().getViewName();
		
		log.info(resultPage);
		
	}
	
	@Test
	public void testGet() throws Exception {
		
		log.info(mockMvc.perform(MockMvcRequestBuilders
				.get("/board/get")
				.param("bno", "10"))  // 게시물을 조회할때 'bno'라는 파라미터가 반드시 필요하므로 param()을 통해서 추가하고 실행함 
				.andReturn()
				.getModelAndView().getModelMap());
	}
	
	@Test
	public void testModify() throws Exception {
		
		String resultPage = mockMvc
				.perform(MockMvcRequestBuilders.post("/board/modify")
				.param("bno", "1")
				.param("title", "수정된 테스트 새글 제목")
				.param("content", "수정된 테스트 새글 내용")
				.param("writer", "user00"))
			.andReturn().getModelAndView().getViewName();
		
		log.info(resultPage);
		
	}
	*/
	@Test
	public void testRemove() throws Exception{
		
		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/board/remove")
				.param("bno", "11"))
				.andReturn().getModelAndView().getViewName();
		
		log.info(resultPage);
	}
}
