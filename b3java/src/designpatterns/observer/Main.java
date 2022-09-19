package designpatterns.observer;
public class Main {

	public static void main(String[] args) {

		//village setup
		PostOffice postoffice = new PostOffice();
		
		Person chris = new Person("Chris");
		Person john = new Person("John");
		
		//action begins
		
		Passport passport = new Passport("John", "Dundee", "You've got a secret lover");

		postoffice.subscribe(chris);
		postoffice.subscribe(john);

		//
		postoffice.addMail(passport);
	}
}