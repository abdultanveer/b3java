package threads.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
	static int noJobs = 10;
	static int noWorkers = 5;
	
	public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(noWorkers);//creating a pool of 5 threads  

        for (int jobNo = 0; jobNo < noJobs; jobNo++) {  
            Runnable worker = new WorkerThread("--" + jobNo);  
            executor.execute(worker);//calling execute method of ExecutorService  
        }
        executor.shutdown();  
        while (!executor.isTerminated()) {   }   //waiting for executor to shutdown
        
        
        
        System.out.println("Finished all threads");  

        
	}

}
