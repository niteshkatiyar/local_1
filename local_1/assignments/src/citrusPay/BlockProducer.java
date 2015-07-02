package citrusPay;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockProducer {
	
	private BlockingQueue<Integer> sharedQue;
	Random random = new Random();
	
	public BlockProducer(BlockingQueue sharedQue)
	{
		this.sharedQue = sharedQue;
	}
	
	public void produce()
	{
		for(int i =1; i<=10; i++)
		{
			try {
				Thread.sleep(100);
				sharedQue.offer(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Produced: "+i + "	Que size: "+sharedQue.size());
		}
	}
}
