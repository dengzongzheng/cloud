package com.dzz;

import com.dzz.test.Bean1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebApplicationTests {

	@Autowired
	private Bean1 bean1;

	@Test
	public void contextLoads() {

		System.out.println(bean1.getClass());
	}

}
