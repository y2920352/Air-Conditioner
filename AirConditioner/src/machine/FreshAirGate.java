package machine;
import AirCon.aircon;

public class FreshAirGate extends aircon{
	public FreshAirGate(String Fr){
		setfreshAirGateStatus(Fr);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	FreshAirGate FAG1 = new FreshAirGate("Open");
	FreshAirGate FAG2 = new FreshAirGate("Close");
	}
}


