package bookstore;

import java.util.Scanner;

/**
 * BookStoreObject.
 *
 * @author hasu
 */
public abstract class BookStoreObject {

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public final void setId(String id) throws BookStoreException {
        if (id == null || id.isBlank()) {
            throw new BookStoreException("Id is null or empty");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) throws BookStoreException {
        if (name == null || name.isBlank()) {
            throw new BookStoreException("Nane is null or empty");
        }
        this.name = name;
    }

    public BookStoreObject() {
    }

    public BookStoreObject(String id, String name) throws BookStoreException {
        this.setId(id);
        this.setName(name);
    }
    public  void input() throws BookStoreException{
        Scanner sc = new Scanner(System.in);
        System.out.print("id: ");
        this.setId(sc.nextLine());
        System.out.print("name: ");
        this.setName(sc.nextLine());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        return sb.toString();
    }
}
