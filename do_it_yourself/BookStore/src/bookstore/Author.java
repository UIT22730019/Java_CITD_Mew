package bookstore;

/**
 * Author.
 *
 * @author hasu
 */
public class Author extends BookStoreObject {

    public Author() {
    }

    public Author(String id, String name) throws BookStoreException {
        super(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Author author) {
            return this.getId().equalsIgnoreCase(author.getId());
        }
        return super.equals(obj);
    }

   
}
