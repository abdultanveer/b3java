package threads.pool;

public class WorkerThread implements Runnable{

	String message;
	
	
	
	public WorkerThread(String message) {
		this.message = message;
	}

	@Override
	public void run() {
        System.out.println(Thread.currentThread().getName()+" (Start) jobNo = "+message);  
		processMessage();
        System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name  
	}

	private void processMessage() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
