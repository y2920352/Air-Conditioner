package machine;
import AirCon.aircon;

public class FanMotor extends aircon{

	public FanMotor(String Fan){
		setfanMotSpeed(Fan);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FanMotor FM1 = new FanMotor("Slow");
		FanMotor FM2 = new FanMotor("Moderate");
		FanMotor FM3 = new FanMotor("Fast");
	}

}
