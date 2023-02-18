package PizzaBillGenerator;

public class Pizza 
{
	private double price;
	private Boolean veg;
	private int extraCheesePrice = 100;
	private int extraToppingAdded = 150;
	private int backpack = 20;
	private int basePizzaPrice = 300;
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppings = false;
	private boolean isTakeAway = false;
	
	public Pizza(Boolean veg) {
		this.veg = veg;
		if (this.veg) {
			this.price = 300;
		} else {
			this.price = 400;
		}

		basePizzaPrice =(int) this.price;
	}
	public void addExtraCheese()
	{
		isExtraCheeseAdded = true;
		this.price +=extraCheesePrice;
	}

	public void addExtraToppings()
	{
		isExtraToppings = true;
		this.price+=extraToppingAdded;
	}
	public void takeAway()
	{
		isTakeAway = true;
		this.price +=backpack;
	}
	
	
	public void getBill()
	{
		String bill = "";
		System.out.println("Pizza "+basePizzaPrice);
		if(isExtraCheeseAdded)
		{
			bill+="Extra Cheese Price :"+extraCheesePrice+"\n";
		}
		if(isExtraToppings)
		{
			bill+="Extra Topping Price :"+extraToppingAdded+"\n";
		}
		if(isTakeAway)
		{
			bill+="Take Away :"+backpack;
		}
		bill+="Total :"+this.price;
		System.out.println(bill);
	}
}
	
	
	
	
	
	
	
	
	