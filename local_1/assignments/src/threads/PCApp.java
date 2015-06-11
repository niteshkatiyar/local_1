package threads;

import java.util.ArrayList;
import java.util.List;

public class PCApp {

	private static List<Integer> producerList =  new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Producer(producerList));
		Thread t2 = new Thread(new Consumer(producerList));
		
		t1.start();
		t2.start();
	}

}
