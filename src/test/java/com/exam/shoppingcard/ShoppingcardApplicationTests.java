package com.exam.shoppingcard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// @SpringBootTest
class ShoppingcardApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testId(){
		Cart cut = new Cart();
		Long myId = 1L;
		cut.setId(myId);
		assertEquals(myId, cut.getId());
	}

	@Test
	void testCardName(){
		Cart cut = new Cart();
		String name = "Title";
		cut.setProdName(name);
		assertEquals(name, cut.getProdName());
	}
	@Test
	void testCardImage(){
		Cart cut = new Cart();
		String Image = "Title";
		cut.setProdImg(Image);
		assertEquals(Image, cut.getProdImg());
	}
	@Test
	void testCartdescription(){
		Cart cut = new Cart();
		String short_description= "Title";
		cut.setShort_description(short_description);
		assertEquals(short_description, cut.getShort_description());
	}
	
	@Test
	void testCarddescription(){
		Cart cut = new Cart();
		String long_description= "Title";
		cut.setLongDescription(long_description);
		assertEquals(long_description, cut.getLongDescription());
	}
	@Test
	void testCardprice(){
		Cart cut = new Cart();
		Double prodPrice = 4650.1;
		cut.setProdPrice(prodPrice);
		assertEquals(prodPrice, cut.getProdPrice());
	}

}
