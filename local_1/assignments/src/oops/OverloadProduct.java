package oops;

public class OverloadProduct {

	private int productId;
	private String productName;
	private double cost;
	
	
	public OverloadProduct(int id, String name, double cost)
	{
		this.productId = id;
		this.productName = name;
		this.cost = cost;
	}
	
	public void getProductDetails()
	{
		System.out.println(productId +" "+ productName +" "+ cost) ;
	}
	public String getProductDetails(int id)
	{
		if(this.productId == id)
		return productName;
		return "no such product";
	}
	
	public void calculateTotalCost()
	{
		System.out.println("Actual cost: "+ cost);
		System.out.println("Calculated cost: "+ (cost+200));
	}
	
	public void calculateTotalCost(double tax)
	{
		if(tax <=100)
		{
			cost += (cost* (tax/100));
			
			System.out.println("Product : "+ productName + " Costs after Tax: " +cost);
		}
		else
		{
			System.out.println("tax cannot be more than 100");
		}
	}
	public double calculateTotalCost(float multiplier)
	{
		cost += (cost*multiplier/10);
		return Double.valueOf(cost).intValue();
	}
	public double calculateTotalCost(double cost, double productionCost)
	{
		return cost+productionCost;
	}
	
	
	public static void main(String[] args) 
	{
		OverloadProduct p1  = new OverloadProduct(1, "Microwave", 12000);
		OverloadProduct p2  = new OverloadProduct(2, "Refridgerator", 25000);
		p1.getProductDetails();
		p2.getProductDetails();
		
		p1.calculateTotalCost(30.50);
		System.out.println("Updated Cost for "+p2.getProductDetails(2) + " is :"+p2.calculateTotalCost(1.4f));
	}
}
