package com.mongoapps.parkinglot;

public class FetchInput {
	Commands commands;
	
	public void parseTextInput(String inputString) {
		
		String[] inputs = inputString.split(" ");
		switch(inputs.length){
		case 1:
			try {
				Method method = commands.commandsMap.get(inputString);
			}
		}
		
	}

}
