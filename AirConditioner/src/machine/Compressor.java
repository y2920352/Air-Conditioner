package machine;
import AirCon.aircon;

public class Compressor extends aircon{
	
	public Compressor(String Com){
		setcompressorSpeed(Com);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compressor C1 = new Compressor("Fast"); 
		Compressor C2 = new Compressor("Moderate"); 
		Compressor C3 = new Compressor("Slow"); 
	}

}
