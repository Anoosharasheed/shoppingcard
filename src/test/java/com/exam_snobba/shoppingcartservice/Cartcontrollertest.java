package com.exam_snobba.shoppingcartservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import static org.mockito.BDDMockito.*;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import com.exam.shoppingcard.CartRepository;
import com.exam.shoppingcard.Cartcontroller;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@AutoConfigureJsonTesters
@SpringBootTest
@AutoConfigureMockMvc
public class Cartcontrollertest {
    
    @Autowired
    private MockMvc mvc;

    @Mock
    private CartRepository cartRepo;

	@InjectMocks
	private Cartcontroller cartController;

	@BeforeEach
	public void setUp(){
		JacksonTester.initFields(this, new ObjectMapper());
		mvc = MockMvcBuilders.standaloneSetup(cartController).build();
	}
       
    @Test
    public void canDeleteACartById() throws Exception{
        Long id = 1L;
        ResultActions response = mvc.perform(delete("/cart/{id}", id));
        response.andExpect(status().isOk());
        verify(cartRepo,times(1)).deleteById(id);
    }

    @Test
    public void canDeleteAllInCart() throws Exception{
        mvc.perform(delete("/cart/all")).andExpect(status().isOk());
        verify(cartRepo,times(1)).deleteAll();
    }


}