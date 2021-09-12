package com.mongoapps.parkinglot;

import java.lang.reflect.Method;

public class FetchInput {
	Commands commands;
	
	public void parseTextInput(String inputString) {
		
		String[] inputs = inputString.split(" ");
		switch(inputs.length){
		case 1:
			try {
				Method method = commands.commandsMap.get(inputString);
			}catch(Exception e) {
				System.out.println("Error occur!!");
			}
		}
		
	}

}
