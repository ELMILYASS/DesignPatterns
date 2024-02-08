
package example.video;

public class Library implements BookProvider {

    @Override
    public Book getBook(String title) {
        System.out.println("Searching in the library database...");
        System.out.println("Retrieving Book Information");
        return new Book(title);
    }

}
