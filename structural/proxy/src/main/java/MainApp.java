
import example.internet.Internet;
import example.internet.ProxyInternet;
import example.video.CachedLibrary;
import example.video.BookProvider;

  public class MainApp {


    public static void main(String[] args) {

        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("banned.com");

        System.out.println("==========================================");

        BookProvider bookProvider = new CachedLibrary();
        bookProvider.getBook("The Great Gatsby");
        bookProvider.getBook("The Great Gatsby");
        bookProvider.getBook("To Kill a Mockingbird");
        bookProvider.getBook("To Kill a Mockingbird");
        bookProvider.getBook("The Great Gatsby");

    }

}
