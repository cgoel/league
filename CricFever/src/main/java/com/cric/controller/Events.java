package com.cric.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cric.domain.Event;

@RestController
@RequestMapping("/events")
public class Events {

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Event getEvent(@PathVariable int id) {
		return new Event();
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Event> getAllEvents(@PathVariable String name) {
		
		return new ArrayList<Event>();
	}
}