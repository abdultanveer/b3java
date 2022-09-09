package abstraction;

public class Wiring {
	
	public static void main(String[] args) {
		SwitchBoardListener sbl = new GEAppliances(); 
				//new HavellsAppliances(); //connection/wiring
		//user click the switches
		sbl.switchOne();
		sbl.switchTwo();
		sbl.switchThree();
		sbl.switchFour();

	}

}
