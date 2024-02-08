

package example.video;

import java.util.HashMap;
import java.util.Map;

public class CachedLibrary implements BookProvider {

    private final Map<String, Book> bookCache = new HashMap<>();
    private final BookProvider library = new Library();

    @Override
    public Book getBook(String title) {
        if (!bookCache.containsKey(title)) {
            bookCache.put(title, library.getBook(title));
        }
        System.out.println("Retrieving book from cache...");
        System.out.println("-----------------------");
        return bookCache.get(title);
    }

}

