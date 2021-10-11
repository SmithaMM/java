class Monitor{
int cost;
String displayDevice;
float screenSize;
String audioOutput;
String loudSpeaker;
String connectingTerminal;
int powerSupply;
String outerDimension;
int weight;
String resolution;
String contrast;
String brightness;
String lightOutput;
int visualAngle;
String type;

Monitor(int cost, String displayDevice, float screenSize)
{
	System.out.println(this);
	this.cost=cost;
	this.displayDevice=displayDevice;
	this.screenSize=screenSize;
	System.out.println("End of constructor");
}

Monitor(String audioOutput, String loudSpeaker, String connectingTerminal)
{
	System.out.println(this);
	this.audioOutput=audioOutput;
	this.loudSpeaker=loudSpeaker;
	this.connectingTerminal=connectingTerminal;
	System.out.println("End of constructor");
}

Monitor(int powerSupply, String outerDimension, int weight)
{
	System.out.println(this);
	this.powerSupply=powerSupply;
	this.outerDimension=outerDimension;
	this.weight=weight;
	System.out.println("End of constructor");
}

Monitor(String contrast, String brightness)
{
	System.out.println(this);
	this.contrast=contrast;
	this.brightness=brightness;
	System.out.println("End of constructor");
}

Monitor(String lightOutput, int visualAngle, String type)
{
	System.out.println(this);
	this.lightOutput=lightOutput;
	this.visualAngle=visualAngle;
	this.type=type;
	System.out.println("End of constructor");
}
}