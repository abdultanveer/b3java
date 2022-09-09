package basics.inheritance;

public class Gst extends IncomeTax {

	@Override
	public int calculateTax(int income) {
		int newTax = 0;
		if(income <= 10000) {
			int oldTax = super.calculateTax(income);
			newTax = oldTax;
		}


		if(income > 10000 && income < 50000) {
			newTax =  income/100 * 15;
		}

		return newTax;
	}

}
