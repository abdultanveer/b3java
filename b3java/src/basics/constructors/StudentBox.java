package basics.constructors;

public class StudentBox {
	
	String namePartition;
	int agePartition;
	static String COLLEGE_NAME = "IIT";
	
	//joyce
	public StudentBox() {
		System.out.println("hey this is a default constructor--joyce");
	}
	
	public StudentBox(int sAge) {
		agePartition = sAge;
		System.out.println("virkin -- parameterized constructor with age param ="+sAge);	
	}
	
	public  static int calculateAverage(int m1, int m2,int m3) {
		return m1+m2+m3 /3;
	}

}
