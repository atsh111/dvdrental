package com.dvdrental.web.persistence.dao;

import com.dvdrental.web.persistence.model.ActorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by atul on 1/22/2018.
 */
@Repository
public interface ActorRepository extends JpaRepository<ActorEntity, Long> {
}
