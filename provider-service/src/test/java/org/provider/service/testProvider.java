package org.provider.service;



import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.service.api.Say;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:Application.xml" })
public class testProvider {
	@Autowired
	private Say helloService;
	@Test
	public void testdubbo() throws IOException {
		System.out.println(helloService.getName());
		System.in.read();
		System.out.println("ok");
		
	}

}
