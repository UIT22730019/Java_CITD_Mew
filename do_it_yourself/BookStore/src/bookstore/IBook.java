package bookstore;

import java.util.List;

/**
 *
 * @author hasu
 */
public interface IBook {
    String getId();
    List<Author> getAuthorList();
    Category getCategory();
    Publisher getPublisher();
    void output();
}
