package threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App {

	private static BlockingQueue<Integer> arrayQue = new ArrayBlockingQueue<Integer>(10);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockConsumer consumer = new BlockConsumer(arrayQue);
		BlockProducer producer = new BlockProducer(arrayQue);
		
		Thread t1Thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				producer.produce();
			}
		});
		
		Thread t2Thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				consumer.consume();
			}
		});
	
		t1Thread.start();
		
		t2Thread.start();
		
	}

}
