class NewsPaperStarter{
public static void main(String[] args)
{
NewsPaper newsPaper = new NewsPaper("Deccan Herald", 5.0f);
String nme = newsPaper.name;
System.out.println(nme);
float price = newsPaper.price;
System.out.println(price);
NewsPaperLang lang = newsPaper.lang;
System.out.println(lang);
int noOfPages = newsPaper.noOfPages;
System.out.println(noOfPages);
String heading = newsPaper.heading;
System.out.println(heading);

newsPaper.lang = NewsPaperLang.ENGLISH;
lang = newsPaper.lang;
System.out.println(lang);


}
}