class NewsPaper{
NewsPaperLang lang = NewsPaperLang.KANNADA;
String name = null;
int noOfPages;
float price;
String heading;

NewsPaper()
{
	System.out.println("invoked NewsPaper with no arguments");
}

NewsPaper(String name, float price)
{
	System.out.println("invoked NewsPaper with String and float");
	this.name=name;
	this.price=price;
	this();
}

NewsPaper(int noOfPages)
{
	System.out.println("invoked NewsPaper with int");
	this("THE HINDHU", 3.5f);
	this.noOfPages=noOfPages;
}

NewsPaper(String name)
{
	System.out.println("invoked NewsPaper with String");
	this.name=name;
}
}