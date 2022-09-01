package basics.ctrlstmts;
class Student{ 
	
	int rollno;  //partition / instance variable
	String name;  
	float fee;  
	
	Student(int rollno,String name,float fee){  //rollno, name, fee are params
		this.rollno = rollno;  
		this.name = name;  
		this.fee = fee;  
		//in this object there's a partition named fee plz put feeParam value in this object partition named fee
	}  
	void display(){System.out.println(rollno+" "+name+" "+fee);}                                                                                         
}  
 