package com.cric.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cric.domain.Event;

public interface EventRepository extends MongoRepository<Event, String> {

	
}
