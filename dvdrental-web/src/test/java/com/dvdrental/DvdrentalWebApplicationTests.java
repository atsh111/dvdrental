package com.dvdrental;

import com.dvdrental.web.persistence.spring.JPAConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@SuppressWarnings("SpringJavaAutowiringInspection")
@ComponentScan(basePackageClasses = {com.dvdrental.web.persistence.service.ActorService.class,
com.dvdrental.web.persistence.dao.ActorRepository.class})
@ContextConfiguration(classes = JPAConfig.class)
public class DvdrentalWebApplicationTests {

	@Autowired

	@Test
	public void contextLoads() {
	}

}
