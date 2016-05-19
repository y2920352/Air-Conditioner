package controlPanel;

import AirCon.aircon;
import java.util.Scanner;

public class Monitor extends aircon {

	public static Scanner whatChange;

	public static void TurnOn() {
		setcompressorSpeed("Moderate");
		setthermostatSetTemp(25);
		setfanMotSpeed("Moderate");
		setswingMotStatus("Off");
		setfreshAirGateStatus("Off");

		settemperature(25);
		setwindStrength("Moderate");
		setswingStatus("Off");
		setcirculationStatus("Off");
	}

	public Monitor() {
		System.out.println("Machine Status:");
		System.out.println("Compressor Speed:" + " " + compressorSpeed);
		System.out.println("Thermostat-Set Temperature:" + " " + thermostatSetTemp);
		System.out.println("Fan Motor Speed:" + " " + fanMotSpeed);
		System.out.println("Swing Motor Status:" + " " + swingMotStatus);
		System.out.println("Fresh Air Gate Status:" + " " + freshAirGateStatus);
		System.out.println(" ");

		System.out.println("Control Panel");
		System.out.println("Temperature:" + " " + temperature);
		System.out.println("Wind Stength:" + " " + windStrength);
		System.out.println("Swing Status:" + " " + swingStatus);
		System.out.println("Circulation Status:" + " " + circulationStatus);
		System.out.println(" ");

		System.out.println("What do you want to change?");
		System.out.println("T for Temperature; W for Wind Strength;");
		System.out.println("S for Swing Status; C for Circulation Status");
		whatChange = new Scanner(System.in);
		String wC = whatChange.next();
		
		switch (wC) {
		
		case "T":
			System.out.println("");
			TemperatureTuner TT1 = new TemperatureTuner();
		
		case "W":
			System.out.println("");
			WindTuner WT1 = new WindTuner();
		
		case "S":
			System.out.println("");
			SwingSwitch SS1 =  new SwingSwitch();
		
		case "C":
			System.out.println("");
			CirculationSwitch CS1 = new CirculationSwitch();
		
		default:
			System.out.println("");
			System.out.println("Please enter T, W, S, or C.");
			System.out.println("");
			Monitor m1 = new Monitor();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TurnOn();
		Monitor m1 = new Monitor();
	
		
		
		
	}
}