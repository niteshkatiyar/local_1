package threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockConsumer {
	
	private BlockingQueue<Integer> sharedQue = new ArrayBlockingQueue<Integer>(10);
	
	public BlockConsumer(BlockingQueue sharedQue)
	{
		this.sharedQue = sharedQue;
	}
	
	public void consume()
	{
		try
		{
			Thread.sleep(1000);
			while(true)
			{
				System.out.println("Consumed: " + sharedQue.take() + "	Que size: "+sharedQue.size());
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println("Consumer Interrupted");
		}
	}
	
}
