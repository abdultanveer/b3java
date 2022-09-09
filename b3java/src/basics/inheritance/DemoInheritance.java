package basics.inheritance;

public class DemoInheritance {
	public static void main(String[] args) {
		IncomeTax incomeTax = new IncomeTax();
		int tax = incomeTax.calculateTax(10000);
		System.out.println(tax);
		Gst gst = new Gst();
		int newTax = gst.calculateTax(30000);
		System.out.println("gst ="+newTax);
	}

}
