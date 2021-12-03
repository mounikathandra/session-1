
public class BookStore
{
private String bookName;
private int bookPrice;
private String bookCategory;
public BookStore(String bookName,int bookPrice, String bookCategory)
{
this.bookName=bookName;
this.bookPrice=bookPrice;
this.bookCategory=bookCategory;
}public String getBookName() {
return bookName;
}public void setBookName(String bookName) {
this.bookName = bookName;
}public int getBookPrice() {
return bookPrice;
}public void setBookPrice(int bookPrice) {
this.bookPrice = bookPrice;
}public String getBookCategory() {
return bookCategory;
}public void setBookCategory(String bookCategory) {
this.bookCategory = bookCategory;
}
public void discount()
{
}@Override
public String toString() {
return "BookSellerShop [bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookCategory=" + bookCategory + "]";
}
}

public class Main
{
public static void main(String[] args)
{
BookStore b = new BookStore("Circe",500,"Fantasy");
BookStore b1 = new BookStore("Ninth House",600,"Fantasy");
BookStore b2 = new BookStore("The Help",700,"Fiction");
BookStore b3 = new BookStore("One Hundred Years of Solitude",400,"Fiction");
BookStore b4 = new BookStore("The Ninth Fire",300,"Mystery");
BookStore b5 = new BookStore("The Advantures of Sherloch Holmes",800,"Mystery");
//ArrayList<BookSellerShop> bookType =new ArrayList();
List<BookStore> booksList = Arrays.asList(b,b1,b2,b3,b4,b5);
// int count=0;
for(BookStore books : booksList)
{
// if(books.getBookCategory().equals("Fiction"))
// {
// getBookName();
System.out.println(books.getBookName());
//// int discount= bookType.getBookPrice()*10/100;
// }
}
// for(BookSellerShop books : bookType)
// {
// System.out.println(books);
//// count++;
// }
// for(BookSellerShop book : bookType)
// {
// System.out.println(book);
// }// Predicate<BookSellerShop> bookGroup =input->input.geBookCategory().equalsIgnoreCase("fiction");
// List<BookSellerShop> adminBook = booksList.stream().filter(bookGroup).collect(Collectors.toList());
}
}

[Yesterday 18:41] Rajashekar Reddy Emmadi
package stringExamples;import java.lang.reflect.Array;
import java.util.Scanner;public class TotalNum { public static void main(String[] args) {
int count = 0;
Scanner scan = new Scanner(System.in);
System.out.println("enter the data");
String data = scan.nextLine();
for (int i = 0; i < data.length(); i++) {
count= count+1;
}
System.out.println(count);
}
}

