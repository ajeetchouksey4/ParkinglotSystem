package com.mongoapps.parkinglot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Ajeet Chouksey
 * @version 1.0.0
 * @since SEPT 2021
 *
 */
public class Main {
	static FetchInput inputParser = new FetchInput();

	public static void main(String[] args) throws InterruptedException {

		showWelcomeMessage();
		showInputRefMessage();

		switch (args.length) {
		case 0:
			System.out.println("to exit! Please enter 'exit' anytime");

			// Running an infinite loop to fetch input as per user requirements
			for (;;) {
				try {
					BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
					String inputString = bufferRead.readLine();
					if (inputString.equalsIgnoreCase("exit")) {
						Thread.sleep(500);
						System.out.println("Thankyou for using Digital Car Parking System..!!");

						Thread.sleep(500);
						System.out.print("See you soon!!   ");

						Thread.sleep(500);
						System.out.println("Bye Bye");
						break;
					} else if ((inputString == null) || (inputString.isEmpty())) {
						// Do nothing
					} else {
						inputParser.parseTextInput(inputString.trim());
					}
				} catch (IOException e) {
					System.out.println("Oops! We're Sorry");
					System.out.println("Something Went Wrong, Please re run the progrm");
					e.printStackTrace();
				}
			}

		}

	}

	private static void showWelcomeMessage() {
		System.out.println("\n\n\n\n\n");
		System.out.println("===================================================================");
		System.out.println("=================== Welcome to ParkingLot System ====================");
		System.out.println("**************  The New System Towards Digital Parking *************");
		System.out.println("===================================================================");

	}

	private static void showInputRefMessage() {
		StringBuffer buffer = new StringBuffer();
		buffer = buffer.append("--------------Please Ensure the pattern of your input -----------------------")
				.append("\n");
		buffer = buffer.append("1) For creating parking lot of size n               ---> create_parking_lot {capacity}")
				.append("\n");
		buffer = buffer
				.append("2) To park a car                                    ---> park <<car_number>> {car_clour}")
				.append("\n");
		buffer = buffer.append("3) Remove car from parking                  ---> leave {slot_number}").append("\n");
		buffer = buffer.append("4) Print status of parking slot                     ---> status").append("\n");
		buffer = buffer.append(
				"5) Get cars registration no for the given car color ---> registration_numbers_for_cars_with_color {car_color}")
				.append("\n");
		buffer = buffer.append(
				"6) Get slot numbers for the given car color         ---> slot_numbers_for_cars_with_color {car_color}")
				.append("\n");
		buffer = buffer.append(
				"7) Get slot number for the given car number         ---> slot_number_for_registration_number {car_number}")
				.append("\n");
		System.out.println(buffer.toString());
	}

}
