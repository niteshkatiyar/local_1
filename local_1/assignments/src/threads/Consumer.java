package threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Consumer implements Runnable{
	
	private List<Integer> sharedList = new ArrayList<Integer>();
	public Consumer(List sharedList)
	{
		Collections.synchronizedList(sharedList);
		this.sharedList = sharedList;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		/*try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		if(sharedList.isEmpty())
		{
			System.out.println("Nothing to consume.");
		}
		else
		{
			while(!sharedList.isEmpty())
			{
				int value = sharedList.remove(0);
				System.out.println("Consumed: "+value + " list size: "+sharedList.size());
			}
		}
	}
	
}
