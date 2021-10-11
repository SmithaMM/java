class MonitorStarter{
public static void main(String[] args)
{
Monitor monitor=new Monitor(5000, "Color TFT-Disp", 5);
System.out.println(monitor);
System.out.println(monitor.cost);
System.out.println(monitor.displayDevice);
System.out.println(monitor.screenSize);

Monitor monitor1=new Monitor("200mV", "one 4.0cm round", "ear phone jack and input and output audio jack");
System.out.println(monitor1);
System.out.println(monitor1.audioOutput);
System.out.println(monitor1.loudSpeaker);
System.out.println(monitor1.connectingTerminal);

Monitor monitor2=new Monitor(25, "18x25", 5);
System.out.println(monitor2);
System.out.println(monitor2.powerSupply);
System.out.println(monitor2.outerDimension);
System.out.println(monitor2.weight);

Monitor monitor3=new Monitor("150:1", "300cd/m2");
System.out.println(monitor3);
System.out.println(monitor3.contrast);
System.out.println(monitor3.brightness);

Monitor monitor4=new Monitor(">5000 lumen", 100, "front projection");
System.out.println(monitor4);
System.out.println(monitor4.lightOutput);
System.out.println(monitor4.visualAngle);
System.out.println(monitor4.type);

}
}