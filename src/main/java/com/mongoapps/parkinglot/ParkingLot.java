package com.mongoapps.parkinglot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ajeet Chouksey
 *
 */

public class ParkingLot {
	int MAX_SIZE = 0;

	private class Car {
		String regNo;
		String color;

		public Car(String regNo, String color) {
			this.regNo = regNo;
			this.color = color;
		}
	}

	// availableSlotList: this is used to check for available slot list
	ArrayList<Integer> availableSlotList;
	//map1: for combination for slot with Car
	Map<String, Car> map1;
	//map2: for combination for regNo with slot
	Map<String, String> map2;
	//map2: for combination for Color with List of RegNo
	Map<String, ArrayList<String>> map3;

	public void createParkingLot(String lotCount) {
		try {
			this.MAX_SIZE = Integer.parseInt(lotCount);
		} catch (Exception e) {
			System.out.println("Invalid lot count");
			System.out.println();
		}
		this.availableSlotList = new ArrayList<Integer>() {
		};
		for (int i = 1; i <= this.MAX_SIZE; i++) {
			availableSlotList.add(i);
		}
		this.map1 = new HashMap<String, Car>();
		this.map2 = new HashMap<String, String>();
		this.map3 = new HashMap<String, ArrayList<String>>();
		System.out.println("Created parking lot with " + lotCount + " slots");
		System.out.println();
	}

	public void park(String regNo, String color) {
	}

	public void leave(String slotNo) {
	}

	public void status() {
	}

	public void getRegistrationNumbersFromColor(String color) {
	}

	public void getSlotNumbersFromColor(String color) {
	}

	public void getSlotNumberFromRegNo(String regNo) {
	}
}
