package oops;

public class Child extends Parent{
	
	public Child(String familyName, String language, int offsprings) {
		
		super(familyName, language, offsprings);
		// TODO Auto-generated constructor stub
	}

	public Child(String familyName) {
		super(familyName);
	}

	public String getLanguage()
	{
		language += ",French";
		return language;
	}
	
	public void displayInfo()
	{
		System.out.println("Children information.");
		System.out.println("Family Name: "+familyName + " & Language Spoken: "+getLanguage() +" & has "+offsprings + " ofsprings");
		
	}
	
	public static void main(String[] args) {
		
		Parent child = new Child("Bhalla","English", 4);
		Parent parent = new Parent("Sharma","Hindi", 2);
		
		child.displayInfo();
		
		parent.displayInfo();
		
	}
}
