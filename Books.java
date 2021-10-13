class Books{
BookNames name = BookNames.BOOK1;
String author;
float price;
int noOfPages;
String language;

Books()
{
    System.out.println("invoked books with no arguments");
}

Books(BookNames name, String author)
{
	 this();
	 System.out.println("invoked books with BookNames and string");
	 this.name=name;
	 this.author=author;
}

Books(float price)
{
	//this(BOOK3, "Robin Sharma");
	System.out.println("invoked books with float");
	this.price=price;
}
}