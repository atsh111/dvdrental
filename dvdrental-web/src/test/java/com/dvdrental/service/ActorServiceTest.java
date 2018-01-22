package com.dvdrental.service;

import com.dvdrental.DvdrentalWebApplicationTests;
import com.dvdrental.web.persistence.dao.ActorRepository;
import com.dvdrental.web.persistence.service.ActorService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import static org.junit.Assert.*;
/**
 * Created by atul on 1/22/2018.
 */
@SpringBootTest
@Import(ActorRepository.class)
public class ActorServiceTest {

    @Autowired
    ActorService service;
    @Test
    public void findAll(){
       assertTrue(service.findAll().size()>0);
    }
}
