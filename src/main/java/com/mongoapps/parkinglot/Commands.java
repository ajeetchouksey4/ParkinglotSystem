package com.mongoapps.parkinglot;

import java.lang.reflect.Method;
import java.util.Map;

public class Commands {
	public Map<String, Method> commandsMap;

	public Commands() {
		commandsMap = new HashMap<String,Method>();
	}
}
