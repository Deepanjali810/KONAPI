package com.app.service;

import org.springframework.stereotype.Service;

import com.app.domain.Event;

@Service
public class AppServiceImpl implements AppService{

	@Override
	public String saveEvent(Event event) {
		// here need to write logic to convert to google protocol buffer
		// after converting send in to second app that will save to database
		return null;
	}

}
