class BooksStarter{
public static void main(String[] args)
{
	Books book = new Books();
	System.out.println(book.name);
	System.out.println(book.author);
    System.out.println(book.noOfPages);
    System.out.println(book.price);
	System.out.println(book.language);
	
	Books book1=new Books(BookNames.BOOK2, "Robin Sharma");
	System.out.println(book1.name);
	System.out.println(book1.author);
	book1.price = 500.0f;
	System.out.println(book1.price);
	
	Books book2=new Books(250);
	System.out.println(book2.name);
	System.out.println(book2.author);
    System.out.println(book2.noOfPages);
    System.out.println(book2.price);
	System.out.println(book2.language);
	
	
	
	
	
    	
}
}