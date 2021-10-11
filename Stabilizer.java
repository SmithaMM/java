class Stabilizer{
String brand;
String color;
float capacity;
int cost;
int freequency;
String installation;
String cooling;
int loadVariation;
int inputVoltage;
int outputVoltage;
float efficiency;
String mounting;
String correctionRate;
String controlModule;
String responseTime;


Stabilizer(String installation, String cooling)
{
	System.out.println("Invoked Stabilizer with String and string");
	System.out.println(this);
	System.out.println(installation);
	System.out.println(cooling);
	this.installation=installation;
	this.cooling=cooling;	
	System.out.println("End of constructor");
}

Stabilizer(int loadVariation)
{
	System.out.println("Invoked Stabilizer with int");
	System.out.println(this);
	System.out.println(loadVariation);
	this.loadVariation=loadVariation;	
	System.out.println("End of constructor");
}

Stabilizer(int inputVoltage, int outputVoltage, float efficiency)
{
	System.out.println("Invoked Stabilizer with int, int and float");
	System.out.println(this);
	System.out.println(inputVoltage);
	System.out.println(outputVoltage);
	System.out.println(efficiency);
	this.inputVoltage=inputVoltage;
	this.outputVoltage=outputVoltage;
	this.efficiency=efficiency;
	System.out.println("End of constructor");
}

Stabilizer(String brand)
{
	System.out.println("Invoked Stabilizer with int");
	System.out.println(this);
	System.out.println(brand);
	this.brand=brand;	
	System.out.println("End of constructor");
}

Stabilizer(String brand, String color, float capacity, int cost, int freequency)
{
	System.out.println("Invoked Stabilizer with String,string,float,int and int");
	System.out.println(this);
	System.out.println(brand);
	System.out.println(color);
	System.out.println(capacity);
	System.out.println(cost);
	System.out.println(freequency);
	this.brand=brand;
	this.color=color;
	this.capacity=capacity;
	this.cost=cost;
	this.freequency=freequency;
	System.out.println("End of constructor");
}
}