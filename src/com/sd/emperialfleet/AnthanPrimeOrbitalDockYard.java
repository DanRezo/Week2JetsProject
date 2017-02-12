package com.sd.emperialfleet;
import java.util.Scanner;

public class AnthanPrimeOrbitalDockYard {
	
	Scanner kb = new Scanner(System.in);

	TieFighter[] fighter = new TieFighter[15];
//Initial Method to place TieFighters in DockYard
	public void seasonedFighter() {
		fighter[0] = new TieFighter("Tie Defender", 621f, 6_900f, 99_000_000.0);
		fighter[1] = new TieFighter("Tie Bomber", 528f, 4_500f, 72_900_000.0);
		fighter[2] = new TieFighter("Tie Inteceptor", 776f, 1_380f, 120_600_000.0);
		fighter[3] = new TieFighter("Tie x1 Advanced", 648f, 1_400, 27_900_000.0);
		fighter[4] = new TieFighter("Imperial StarDestroyer", 505f, 10_000, 10_340_000_000.0);

	}
//listing  TieFighters
	public void listFighters() {

		for (int i = 0; i < fighter.length; i++) {
			if (fighter[i] != null) {
				System.out.println((i + 1) + " " + fighter[i].getModel() + " / "+ "Mach:" + fighter[i].getSpeed() + " / "+  "Range:" + fighter[i].getRange() + " miles" + " / " + fighter[i].getPrice() + " Credits");
			}

		}
	}
// Sorting list based on speed	
	public void sortSpeed() {
		TieFighter[] temp = new TieFighter[fighter.length];
		for (int i = 0; i < fighter.length; i++) {
			temp[i] = fighter[i];
		}

		TieFighter e = null;

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != null) {
				for (int j = i; j > 0; j--) {
					if (temp[j - 1].getSpeed() < temp[j].getSpeed()) {
						e = temp[j - 1];
						temp[j - 1] = temp[j];
						temp[j] = e;
					}
				}
			}
		}

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != null) {
				System.out.println(temp[i].getModel() + " / "  + "Mach:" + temp[i].getSpeed());
			}
		}

	}
	// Sorting list based on Range
	public void sortRange() {
		TieFighter[] temp = new TieFighter[fighter.length];
		for (int i = 0; i < fighter.length; i++) {
			temp[i] = fighter[i];
		}

		TieFighter e = null;

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != null) {
				for (int j = i; j > 0; j--) {
					if (temp[j - 1].getRange() < temp[j].getRange()) {
						e = temp[j - 1];
						temp[j - 1] = temp[j];
						temp[j] = e;
					}
				}
			}
		}

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != null) {
				System.out.println(temp[i].getModel() + " " + temp[i].getRange() + " Miles");
			}
		}

	}
///// Adding in a TieFighter	
	public void addFighter() {
		for (int i = 0; i < fighter.length; i++) {
			if (fighter[i] == null) {
				System.out.println("Enter Model Name:");
				String model = kb.next();
				System.out.println("Enter Speed in mph: ");
				Float speed = kb.nextFloat();
				System.out.println("Enter Capable Range: ");
				Float range = kb.nextFloat();
				System.out.println("Price: ");
				Double price = kb.nextDouble();
				fighter[i] = new TieFighter(model, speed, range, price);
				break;
			}
		}

	}
	
	
}

