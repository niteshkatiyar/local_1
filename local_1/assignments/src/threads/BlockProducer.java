package threads;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockProducer {
	
	private BlockingQueue<Integer> sharedQue = new ArrayBlockingQueue<Integer>(10);
	Random random = new Random();
	
	public BlockProducer(BlockingQueue sharedQue)
	{
		this.sharedQue = sharedQue;
	}
	
	public void produce()
	{
		while(true)
		{
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int value= random.nextInt(100);
				sharedQue.add(value);
				System.out.println("Produced: "+value + "	Que size: "+sharedQue.size());
		}
	}
}
