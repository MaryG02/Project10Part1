// 1.2 Arguments
public class Books {
    String name;
    String author;
    public Books(String name, String author){
        this.author = author;
        this.name = name;
    }
    public static void printBooks(Books books){
        System.out.println("Name: "+ books.name+"\nAuthor: "+books.author);
    }
    public static void changes (Books books){
        books.name = "Harry Potter";
        books.author = "J. K. Rowling";
    }
}
