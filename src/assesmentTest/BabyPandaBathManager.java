package assesmentTest;

import java.util.concurrent.*;
import java.util.stream.*;

public class BabyPandaBathManager {
	public static void await(CyclicBarrier cb){
		try {
			cb.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// Handle exception
		}
	}
	
	public static void main(String[] args) {
		final CyclicBarrier cb = new CyclicBarrier(3, () -> System.out.println("Clean!"));
		ExecutorService service = Executors.newScheduledThreadPool(2);
		IntStream.iterate(1, i -> 1).limit(12).forEach(i ->  service.submit(() -> await(cb)));
		service.shutdown();
	}
}


//	The thread pool size is only 2, but CyclicBarrier limit is 3. Even though 12 tasks are all 
//	successfully submitted to the thread executor service, the first two tasks will use up on both
//	available threads and wait indefinitely. Since the third await() is never executed, the barrier
//	is never broken and the program hangs.
//	
//	Conclusion: The number of threads must be the same or bigger than the CyclicBarrier limit.
//	If we change the number or threads to 3 or bigger, the text "Clean!" will be printed 12/3 = 4 times
//	(Iteration limit / CyclicBarrier limit).
