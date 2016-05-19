package controlPanel;

import AirCon.aircon;
import machine.FanMotor;

import java.util.Scanner;

public class WindTuner extends aircon {

	public static Scanner newWind;

	public WindTuner() {

		System.out.println("Present Wind Strength is:" + " " + windStrength);
		System.out.println("Whic Wind Strength do you want to choose?");
		System.out.println("(W for Weak; M for Moderate; S for Strong)");
		newWind = new Scanner(System.in);
		String nW = newWind.next();

		switch (nW) {
		case "W":
			System.out.println("");
			System.out.println("Wind Strength has been changed to Weak.");
			System.out.println("Fan Motor Speed has been changed to Slow.");
			System.out.println("");
			setwindStrength("Weak");
			FanMotor FM1 = new FanMotor("Slow");
			Monitor m1 = new Monitor();

		case "M":
			System.out.println("");
			System.out.println("Wind Strength has been changed to Moderate.");
			System.out.println("Fan Motor Speed has been changed to Moderate.");
			System.out.println("");
			setwindStrength("Moderate");
			FanMotor FM2 = new FanMotor("Moderate");
			Monitor m2 = new Monitor();

		case "S":
			System.out.println("");
			System.out.println("Wind Strength has been changed to Strong.");
			System.out.println("Fan Motor Speed has been changed to Fast.");
			System.out.println("");
			setwindStrength("Strong");
			FanMotor FM3 = new FanMotor("Fast");
			Monitor m3 = new Monitor();

		default:
			System.out.println("");
			System.out.println("Please enter W for Weak; M for Moderate; S for Strong.");
			System.out.println("");
			WindTuner WT1 = new WindTuner();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindTuner WT1 = new WindTuner();

	}

}
