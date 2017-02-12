package com.sd.emperialfleet;

import java.util.Scanner;

public class EmperialFleetMenu {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		AnthanPrimeOrbitalDockYard selection = new AnthanPrimeOrbitalDockYard();

		int choice;
		selection.seasonedFighter();
		// Initiating a do while loop to take input from user. Input taken in
		// will be stored in the int choice.

		do {
			System.out.println("-------------------------------");
			System.out.println("Orbital Fleet Dock Station Menu");
			System.out.println("-------------------------------");
			System.out.println("1.--List Fleet-----------------");
			System.out.println("-------------------------------");
			System.out.println("2.--View Fastest Fighter-------");
			System.out.println("-------------------------------");
			System.out.println("3.--View Fighter Range---------");
			System.out.println("-------------------------------");
			System.out.println("4---Add to Fleet Inventory-----");
			System.out.println("-------------------------------");
			System.out.println("5---Quit-----------------------");
			System.out.println("-------------------------------");
			System.out.println("---Enter your command----------");
			System.out.print("-------------------------------");
			choice = kb.nextInt();
			// User's input 'now choice' is ran through a switch statement which
			// will execute based on which number the user choose.
			switch (choice) {

			case 1:
				selection.listFighters();
				break;

			case 2:
				selection.sortSpeed();
				break;

			case 3:
				selection.sortRange();
				break;

			case 4:
				selection.addFighter();
				break;
			}
		} while (choice != 5);
		System.out.println("System Terminated");

	}

}
