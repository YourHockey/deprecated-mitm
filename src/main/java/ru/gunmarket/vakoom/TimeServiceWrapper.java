package ru.gunmarket.vakoom;

import vakoom.gunmarket.ru.TimeService;

import java.time.LocalDateTime;

public class TimeServiceWrapper {
	public LocalDateTime time() {
		return TimeService.utcNow();
	}
}
