package com.dvdrental.web.mapper;

import com.dvdrental.web.persistence.model.ActorEntity;
import com.dvdrental.web.ui.model.Actor;

/**
 * Created by atul on 1/22/2018.
 */
public class ActorMapper {

    public static Actor getActor(ActorEntity entity){
        Actor actor = new Actor();
        actor.setActorId(entity.getActorId());
        actor.setFirstName(entity.getFirstName());
        actor.setLastName(entity.getLastName());
        return actor;
    }
    public static ActorEntity getActor(Actor actor){
        ActorEntity actorEntity = new ActorEntity();
        actorEntity.setFirstName(actor.getFirstName());
        actorEntity.setLastName(actor.getFirstName());
        return actorEntity;
    }
}
