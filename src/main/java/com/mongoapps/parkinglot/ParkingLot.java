package com.mongoapps.parkinglot;

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
}
