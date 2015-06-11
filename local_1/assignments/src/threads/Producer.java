package threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Producer implements Runnable{

	private List<Integer> sharedList = new ArrayList<Integer>();
	
	public Producer(List sharedList)
	{
		Collections.synchronizedList(sharedList);
		this.sharedList = sharedList;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i <=10; i++)
		{
			sharedList.add(i);
			System.out.println("Produced: "+i + " list size: "+sharedList.size());
		}
		
	}

	
}
