package controlPanel;

import AirCon.aircon;
import machine.Compressor;
import machine.Thermostat;

import java.util.Scanner;

public class TemperatureTuner extends aircon {

	public static Scanner newTemp;

	public TemperatureTuner() {

		System.out.println("Present Temperature is:" + " " + temperature);
		System.out.println("What is the new temperature you want to set? (16-27)");
		newTemp = new Scanner(System.in);
		int nT = newTemp.nextInt();

		if (nT >= 16 && nT < 20) {
			System.out.println("");
			System.out.println("Temperature has been set to" + " " + nT + ".");
			System.out.println("Compressor Speed has been changed to Fast.");
			System.out.println("");
			settemperature(nT);

			if (nT == 16) {
				Thermostat T1 = new Thermostat(16);
			} else if (nT == 17) {
				Thermostat T2 = new Thermostat(17);
			} else if (nT == 18) {
				Thermostat T3 = new Thermostat(18);
			} else if (nT == 19) {
				Thermostat T4 = new Thermostat(19);
			} else {

			}
			Compressor C1 = new Compressor("Fast");
			Monitor m1 = new Monitor();
		} else if (nT >= 20 && nT < 24) {
			System.out.println("");
			System.out.println("Temperature has been set to" + " " + nT + ".");
			System.out.println("Compressor Speed has been changed to Moderate.");
			System.out.println("");
			settemperature(nT);
			if (nT == 20) {
				Thermostat T5 = new Thermostat(20);
			} else if (nT == 21) {
				Thermostat T6 = new Thermostat(21);
			} else if (nT == 22) {
				Thermostat T7 = new Thermostat(22);
			} else if (nT == 23) {
				Thermostat T8 = new Thermostat(23);
			} else {

			}
			Compressor C2 = new Compressor("Moderate");
			Monitor m1 = new Monitor();
		} else if (nT >= 24 && nT <= 27) {
			System.out.println("");
			System.out.println("Temperature has been set to" + " " + nT + ".");
			System.out.println("Compressor Speed has been changed to Slow.");
			System.out.println("");
			settemperature(nT);
			if (nT == 24) {
				Thermostat T9 = new Thermostat(24);
			} else if (nT == 25) {
				Thermostat T10 = new Thermostat(25);
			} else if (nT == 26) {
				Thermostat T11 = new Thermostat(26);
			} else if (nT == 27) {
				Thermostat T12 = new Thermostat(27);
			} else {

			}
			Compressor C3 = new Compressor("Slow");
			Monitor m1 = new Monitor();
		} else {
			System.out.println("");
			System.out.println("Please enter a value between 16 and 27.");
			System.out.println("");
			TemperatureTuner TT1 = new TemperatureTuner();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TemperatureTuner TT1 = new TemperatureTuner();

	}

}
