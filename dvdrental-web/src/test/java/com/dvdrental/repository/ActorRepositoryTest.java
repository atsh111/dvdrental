package com.dvdrental.repository;

import com.dvdrental.web.persistence.dao.ActorRepository;
import com.dvdrental.web.persistence.service.ActorService;
import com.dvdrental.web.persistence.spring.ContextConfig;
import com.dvdrental.web.persistence.spring.JPAConfig;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by atul on 1/22/2018.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ContextConfig.class)
public class ActorRepositoryTest {

    @Autowired
    ActorService actorService;
    @Autowired
    ActorRepository repository;

    @Test
    public void findAll(){
        assertTrue(repository.findAll().size()>0);
    }
}
