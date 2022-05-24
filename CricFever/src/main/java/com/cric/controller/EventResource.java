package com.cric.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cric.domain.Event;
import com.cric.service.EventService;

@RestController
@RequestMapping("/events")
public class EventResource {
	
	@Autowired
	EventService eventService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Event getEvent(@PathVariable String id) {
		return eventService.getEvent(id);
		getEvent
			getEvent
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Event> getAllEvents(@PathVariable String name) {
		return eventService.getEvents();
		getEvent
			
			getEvent
			getEvent
			getEvent
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Event update(@RequestBody Event event) {
		return eventService.update(event);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Event create(@RequestBody Event event) {
		return eventService.create(event);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable String id) {
		eventService.delete(id);
	}
}
