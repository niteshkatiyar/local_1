package maths;

public class PrimeScanner {

	private int count;
	
	public void checkPrime(int number)
	{
		count =0;
		for(int i =2; i<=number; i++)
		{
			if(number%i == 0)
				count++;
		}
		if(count ==1 )
			System.out.println("Prime detected: "+number);
		else
			System.out.println(number +" is not Prime.");
	}
	
	public void listOfprimes(int index)
	{
		for(int i=2; i <=index; i++)
		{
			checkPrime(i);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			PrimeScanner obj = new PrimeScanner();
			//obj.checkPrime(9);
			obj.listOfprimes(40);
			
		
	}
	
}
