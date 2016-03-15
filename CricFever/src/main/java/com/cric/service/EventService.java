package com.cric.service;

import java.util.List;

import com.cric.domain.Event;

public interface EventService {

	public Event getEvent(String id);
	public List<Event> getEvents();
	public Event update(Event event);
	public Event create(Event event);
	public void delete(String id);
}
