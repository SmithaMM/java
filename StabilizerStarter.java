class StabilizerStarter
{
public static void main(String[] args)
{

Stabilizer stabilizer= new Stabilizer("SERVo", "RED", 3000, 3500, 85);
System.out.println(stabilizer);
System.out.println(stabilizer.brand);
System.out.println(stabilizer.color);
System.out.println(stabilizer.capacity);
System.out.println(stabilizer.cost);
System.out.println(stabilizer.freequency);

Stabilizer stabilizer1= new Stabilizer("SERVo", "RED", 3000, 3500, 85);
System.out.println(stabilizer1);
System.out.println(stabilizer1.brand);
System.out.println(stabilizer1.color);
System.out.println(stabilizer1.capacity);
System.out.println(stabilizer1.cost);
System.out.println(stabilizer1.freequency);

Stabilizer stabilizer2= new Stabilizer("Indoor / Outdoor", "Natural Oil-Cooled");
System.out.println(stabilizer2);
System.out.println(stabilizer2.installation);
System.out.println(stabilizer2.cooling);

Stabilizer stabilizer3= new Stabilizer(100);
System.out.println(stabilizer3);
System.out.println(stabilizer3.loadVariation);

Stabilizer stabilizer4= new Stabilizer(350, 400, 99);
System.out.println(stabilizer4);
System.out.println(stabilizer4.inputVoltage);
System.out.println(stabilizer4.outputVoltage);
System.out.println(stabilizer4.efficiency);

Stabilizer stabilizer5= new Stabilizer("SERVO");
System.out.println(stabilizer5);
System.out.println(stabilizer5.brand);
}
}