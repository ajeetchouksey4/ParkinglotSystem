package com.mongoapps.parkinglot;

/**
 * @author Ajeet Chouksey
 * @version 1.0.0
 * @since SEPT 2021
 *
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("\n\n\n\n\n");
		System.out.println("===================================================================");
		System.out.println("=================== Welcome to ParkingLot System ====================");
		System.out.println("===================================================================");

		showMessage();

	}

	private static void showMessage() {
		StringBuffer buffer = new StringBuffer();
		buffer = buffer.append("--------------Please Ensure the pattern of your input -----------------------")
				.append("\n");
		buffer = buffer.append("A) For creating parking lot of size n               ---> create_parking_lot {capacity}")
				.append("\n");
	
		System.out.println(buffer.toString());
	}

}
