package oops;

public class Parent 
{
	public String familyName;
	public String language;
	public int offsprings;
	
	public Parent(String familyName, String language, int offsprings)
	{
		this.familyName = familyName;
		this.language = language;
		this.offsprings = offsprings;
	}
	public Parent(String familyName)
	{
		this.familyName = familyName;
	}
	
	public void displayInfo()
	{
		System.out.println("Parent information.");
		System.out.println("Family Name: "+familyName + " & Language Spoken: "+language +" & has "+offsprings + " ofsprings");
		
	}
	public void getOffsprings()
	{
		System.out.println("Offsprings: "+offsprings);
	}
	
	public String getLanguage()
	{
		return language;
	}
	
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public void setOffsprings(int offsprings) {
		this.offsprings = offsprings;
	}
	
}
