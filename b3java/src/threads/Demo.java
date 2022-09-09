package threads;

public class Demo {
public static void main(String[] args) {
	Accountant accountant1 = new Accountant();
	Accountant accountant2 = new Accountant();
	
	accountant1.run();
	accountant2.run();
}
}
