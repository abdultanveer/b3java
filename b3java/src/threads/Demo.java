package threads;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * Accountant accountant1 = new Accountant(); Accountant accountant2 = new
		 * Accountant();
		 * 
		 * accountant1.run(); accountant2.run();
		 */
		
		Joyce joyce = new Joyce("joyce");
		Virkin virkin = new Virkin();
		Zach zach = new Zach();
		
		virkin.setName("virkin");
		virkin.start();
		zach.start();
		
		zach.join();//waiting for zach to complete and join us for lunch
		
		joyce.start();
	}
}
