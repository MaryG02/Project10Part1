public class Main {
    public static void main(String[] args){
         Books book1 = new Books("1984", "George Orwell");
         Books.printBooks(book1);
         Books.changes(book1);
         Books.printBooks(book1);
         object obj1 = new object(); //Creatin object of a class
         obj1.colour  = "Green";
         obj1.shape = "Square";
         object obj2; 
         obj2 = obj1; //Changing the object property
        System.out.println("Obj2: " + obj2.colour+" "+obj2.shape); // Checking if the values are the same
    }
}
