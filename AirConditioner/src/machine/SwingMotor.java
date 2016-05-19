package machine;
import AirCon.aircon;

public class SwingMotor extends aircon{
	
	public SwingMotor(String Sw){
		setswingMotStatus(Sw);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingMotor SM1 = new SwingMotor("On");
		SwingMotor SM2 = new SwingMotor("Off");
	}

}
