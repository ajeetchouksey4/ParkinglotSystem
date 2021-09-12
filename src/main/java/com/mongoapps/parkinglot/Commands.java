package com.mongoapps.parkinglot;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Commands {
	public Map<String, Method> commandsMap;

	public Commands() {
		commandsMap = new HashMap<String, Method>();

		try {
			generateCustomCommands();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();

		}
	}

	private void generateCustomCommands() throws NoSuchMethodException {
		commandsMap.put("create_parking_lot", ParkingLot.class.getMethod("createParkingLot", String.class));
		

	}

}
