package citrusPay;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockConsumer {
	
	private BlockingQueue<Integer> sharedQue;
	
	public BlockConsumer(BlockingQueue sharedQue)
	{
		this.sharedQue = sharedQue;
	}
	
	public void consume()
	{
		try
		{
			Thread.sleep(200);
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
