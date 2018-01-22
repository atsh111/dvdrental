package com.dvdrental.web.persistence.service;

import com.dvdrental.web.mapper.ActorMapper;
import com.dvdrental.web.persistence.dao.ActorRepository;
import com.dvdrental.web.persistence.model.ActorEntity;
import com.dvdrental.web.ui.model.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by atul on 1/22/2018.
 */
@Service
public class ActorService {
    @Autowired
    ActorRepository repository;

    public List<Actor> findAll(){
        return repository.findAll().stream()
                    .map(x-> ActorMapper.getActor(x))
                    .collect(Collectors.<Actor> toList());
    }

    public void save(Actor actor){
        repository.save(ActorMapper.getActor(actor));
    }


}
