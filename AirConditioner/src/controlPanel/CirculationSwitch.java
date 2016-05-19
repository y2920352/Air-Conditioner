package controlPanel;

import AirCon.aircon;
import machine.FreshAirGate;
import java.util.Scanner;

public class CirculationSwitch extends aircon {

	public static Scanner newC;

	public CirculationSwitch() {

		System.out.println("Present Circulation Status is" + " " + circulationStatus);
		System.out.println("Do you want to switch the Circulation Mode? (Y or N)");
		newC = new Scanner(System.in);
		String nC = newC.next();

		switch (nC) {
		case "Y":
			if (circulationStatus == "Off") {
				System.out.println("");
				System.out.println("Circulation Mode has been turned On.");
				System.out.println("Fresh Air Gate has been Opened.");
				System.out.println("");
				setcirculationStatus("On");
				FreshAirGate FAG1 = new FreshAirGate("Open");
				Monitor m1 = new Monitor();
			} else if (circulationStatus == "On") {
				System.out.println("");
				System.out.println("Circulation Mode has been turned Off.");
				System.out.println("Fresh Air Gate has been Close.");
				System.out.println("");
				setcirculationStatus("Off");
				FreshAirGate FAG2 = new FreshAirGate("Close");
				Monitor m1 = new Monitor();
			} else if (circulationStatus == null) {
				System.out.println("");
				System.out.println("Circulation Mode has been turned On.");
				System.out.println("Fresh Air Gate has been Opened.");
				System.out.println("");
				setcirculationStatus("On");
				FreshAirGate FAG1 = new FreshAirGate("Open");
				Monitor m1 = new Monitor();
			}
		case "N":
			System.out.println("");
			System.out.println("No change has been made.");
			System.out.println("");
			Monitor m1 = new Monitor();

		default:
			System.out.println("");
			System.out.println("Do you want to switch the Circulation Mode? (Y or N)");
			CirculationSwitch CS1 = new CirculationSwitch();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CirculationSwitch CS1 = new CirculationSwitch();
	}

}
