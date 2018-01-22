package com.dvdrental.web.controllers;

import com.dvdrental.web.persistence.service.ActorService;
import com.dvdrental.web.ui.model.Actor;
import com.dvdrental.web.util.RestMappings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by atul on 1/22/2018.
 */
@RestController
@RequestMapping(RestMappings.ACTOR)
public class ActorController {
    @Autowired
    ActorService actorService;
    @RequestMapping(method = RequestMethod.GET)
    public List<Actor> getAll(ModelMap model){
        return actorService.findAll();
    }
}
