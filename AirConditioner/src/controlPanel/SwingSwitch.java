package controlPanel;

import AirCon.aircon;
import machine.SwingMotor;

import java.util.Scanner;

public class SwingSwitch extends aircon {

	public static Scanner newS;

	public SwingSwitch() {
		System.out.println("Present Swing Status is:" + " " + swingStatus);
		System.out.println("Do you want the switch the Swing Mode? (Y or N)");
		newS = new Scanner(System.in);
		String nS = newS.next();

		switch (nS) {
		case "Y":
			if (swingStatus == "Off") {
				System.out.println("");
				System.out.println("Swing Mode has been turned On.");
				System.out.println("Swing Motor has been turned On.");
				System.out.println("");
				setswingStatus("On");
				SwingMotor SM1 = new SwingMotor("On");
				Monitor m1 = new Monitor();
			} else if (swingStatus == "On") {
				System.out.println("");
				System.out.println("Swing Mode has been turned Off.");
				System.out.println("Swing Motor has been turned Off.");
				System.out.println("");
				setswingStatus("Off");
				SwingMotor SM2 = new SwingMotor("Off");
				Monitor m1 = new Monitor();
			} else if (swingStatus == null) {
				System.out.println("");
				System.out.println("Swing Mode has been turned On.");
				System.out.println("Swing Motor has been turned On.");
				System.out.println("");
				setswingStatus("On");
				SwingMotor SM1 = new SwingMotor("On");
				Monitor m1 = new Monitor();
			}
		case "N":
			System.out.println("");
			System.out.println("No Change has been made.");
			System.out.println("");
			Monitor m1 = new Monitor();

		default:
			System.out.println("");
			System.out.println("Please enter Y or N.");
			System.out.println("");
			SwingSwitch SS1 = new SwingSwitch();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingSwitch SS1 = new SwingSwitch();

	}

}
