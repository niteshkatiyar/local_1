package citrusPay;

public enum EnumSingleton {
	INSTANCE;
	
	public void displayMessage()
	{
		System.out.println("Singleton created using ENUM.");
	}
}
