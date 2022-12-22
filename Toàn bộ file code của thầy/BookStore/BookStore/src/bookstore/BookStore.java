package bookstore;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hasu
 */
public class BookStore {

    private final ArrayListBook bookList;
    private final List<ArrayListBook> serialBookList;

    public ArrayListBook getBookList() {
        return bookList;
    }

    public List<ArrayListBook> getSerialBookList() {
        return serialBookList;
    }

    public BookStore() {
        this.bookList = new ArrayListBook();
        this.serialBookList = new ArrayList();
    }

    public boolean add(IBook book) {
        if (book == null) {
            return false;
        }
        return this.bookList.add(book);
    }

    public boolean remove(IBook book) {
        if (book == null) {
            return false;
        }
        return this.bookList.remove(book);
    }

    public List<IBook> filterByAuthor(String authorId) {
        if (authorId != null) {
            Author author = new Author();
            try {
                author.setId(authorId);
            } catch (BookStoreException ex) {
                Logger.getLogger(BookStore.class.getName()).log(Level.SEVERE, null, ex);
            }

            return filterByAuthor(author);
        }
        return null;
    }

    public List<IBook> filterByAuthor(Author author) {
        if (author != null) {
            return this.bookList
                    .stream()
                    .filter(book -> book.getAuthorList().contains(author))
                    .toList();
        }
        return null;
    }

    public List<IBook> filterByCategory(Category category) {
        if (category != null) {
            return this.bookList
                    .stream()
                    .filter(book -> category.equals(book.getCategory()))
                    .toList();
        }
        return null;
    }

    public List<IBook> filterByPublisher(String publisherId) {
        if (publisherId != null) {
            return this.bookList
                    .stream()
                    .filter(book -> publisherId.equals(book.getPublisher().getId()))
                    .toList();
        }
        return null;
    }

    public List<IBook> filterByPublisher(Publisher publisher) {
        if (publisher != null) {
            return this.bookList
                    .stream()
                    .filter(book -> publisher.equals(book.getPublisher()))
                    .toList();
        }
        return null;
    }

}
