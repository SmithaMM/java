class BicycleStarter{
public static void main(String[] values)
{
Bicycle bicycle = new Bicycle("BLACK", 15000.0f, "HERO");
bicycle.brake();
bicycle.move();
bicycle.displayDetails();
}
}