package com.app.domain;

public class Event {
	
	private Long timestamp;
	private int userId;
	private String event;
	
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	@Override
	public String toString() {
		return "Event [timestamp=" + timestamp + ", userId=" + userId + ", event=" + event + "]";
	}

}
