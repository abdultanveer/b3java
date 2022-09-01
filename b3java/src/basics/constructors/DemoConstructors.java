package basics.constructors;

public class DemoConstructors {

	public static void main(String[] args) {
		StudentBox sb = new StudentBox();
		StudentBox[] studentBoxs = new StudentBox[100] ;
		
		StudentBox sb2 = new StudentBox(20);
		String name = sb2.namePartition;
		String college = StudentBox.COLLEGE_NAME;
		int result = add(10,20);
		System.out.println(result);
	}

	private static int add(int i, int j) {
		System.out.println("adding 2 nos");
		return i + j;
	}

}
