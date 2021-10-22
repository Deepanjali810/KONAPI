package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.domain.Event;
import com.app.service.AppService;

@RestController
@RequestMapping("/app")
public class AppController {
	@Autowired
	AppService appService;
	
	@PostMapping(value = "/saveEvent", consumes = MediaType.APPLICATION_JSON_VALUE )
	public String saveEvent(@RequestBody Event event){
		return appService.saveEvent(event);
	}
}
