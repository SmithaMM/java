class Bicycle{
String color;
float price;
String brand;
BicycleType type = BicycleType.FIXED_GEAR_CYCLE;

Bicycle(String color, float price, String brand)
{
	System.out.println("invoked Bicycle with string float and string");
	this.color = color;
	this.price = price;
	this.brand = brand;
}

void brake()
{
	System.out.println("Bicycle brake");
}

void move()
{
	System.out.println("Bicycle Moves");
}

void displayDetails()
{
	System.out.println("Bicycle type is "+type);
	System.out.println("Bicycle color is "+color);
	System.out.println("Bicycle brand is "+brand);
	System.out.println("Bicycle price is "+price);
}
}