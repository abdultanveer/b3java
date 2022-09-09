package abstraction;

//implements -- providing/complying the socket for switchboard wires to be connect
public class GEAppliances implements SwitchBoardListener{

	@Override
	public void switchOne() {
		System.out.println("GE tubelight is on");

	}

	@Override
	public void switchTwo() {
		System.out.println("GE fan is on");
		
	}

	@Override
	public void switchThree() {
		System.out.println("GE ac is on");
		
	}

	@Override
	public void switchFour() {
		System.out.println("GE geyser is on");
		add(10,20); //10 & 20 are the arguments
		
	}

	//	public int add(int fno, int sno) { --signature of the method
	//	{		return fno + sno;	}
	//fno & sno are the parameters
	
	public int add(int fno, int sno) 
	
	{		return fno + sno;	}
	
}
