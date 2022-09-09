package threads;

public class Joyce extends Thread {
	public Joyce(String name) {
		super(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("joyce is going for lunch--"+Thread.currentThread().getName());
	}

}
