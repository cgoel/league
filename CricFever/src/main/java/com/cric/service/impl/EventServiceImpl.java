package com.cric.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Service;

import com.cric.domain.Event;
import com.cric.repository.EventRepository;
import com.cric.service.EventService;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	EventRepository eventRepository;
	
	@Override
	public Event getEvent(String id) {
		return eventRepository.findOne(id);
	}

	@Override
	public List<Event> getEvents() {
		return eventRepository.findAll();
	}

	@Override
	public Event update(Event event) {
		
		Event savedEvent = eventRepository.findOne(event.getId());

        if (savedEvent.getVersion() != event.getVersion()) {
            throw new OptimisticLockingFailureException("Event is stale");
        }

        savedEvent.setName(event.getName());
        savedEvent.setAwayTeam(event.getAwayTeam());
        savedEvent.setCreateDate(event.getCreateDate());
        savedEvent.setCreatedBy(event.getCreatedBy());
        savedEvent.setEventDate(event.getEventDate());
        savedEvent.setHomeTeam(event.getHomeTeam());
        savedEvent.setVenue(event.getVenue());
        
        return eventRepository.save(savedEvent);
	}

	@Override
	public Event create(Event event) {
		return eventRepository.save(event);
	}

	@Override
	public void delete(String id) {
		eventRepository.delete(id);
	}

	
}
