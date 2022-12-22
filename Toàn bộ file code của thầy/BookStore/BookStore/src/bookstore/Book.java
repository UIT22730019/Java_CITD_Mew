package bookstore;

import java.time.Year;
import java.util.List;
import java.util.Scanner;

/**
 * Book.
 *
 * @author hasu
 */
public class Book extends BookStoreObject implements IBook {
    
    private List<Author> authorList;
    private Category category;
    private float price;
    private Publisher publisher;
    private Year publicYear;
    
    public List<Author> getAuthorList() {
        return authorList;
    }
    
    public final void setAuthorList(List<Author> authorList) throws BookStoreException {
        if (authorList == null || authorList.isEmpty()) {
            throw new BookStoreException("Author is null or empty");
        }
        this.authorList = authorList;
    }
    
    public Category getCategory() {
        return category;
    }
    
    public final void setCategory(Category category) throws BookStoreException {
        if (category == null) {
            throw new BookStoreException("Category is null");
        }
        this.category = category;
    }
    
    public float getPrice() {
        return price;
    }
    
    public final void setPrice(float price) throws BookStoreException {
        if (price < 0) {
            throw new BookStoreException("Price < 0");
        }
        this.price = price;
    }
    
    public Publisher getPublisher() {
        return publisher;
    }
    
    public final void setPublisher(Publisher publisher) throws BookStoreException {
        if (publisher == null) {
            throw new BookStoreException("Publisher is null");
        }
        this.publisher = publisher;
    }
    
    public Year getPublicYear() {
        return publicYear;
    }
    
    public final void setPublicYear(Year publicYear) throws BookStoreException {
        if (publicYear == null || publicYear.isAfter(Year.now())) {
            throw new BookStoreException("Public year is null");
        }
        this.publicYear = publicYear;
    }
    
    public Book() {
    }
    
    public Book(
            String id,
            String name,
            List<Author> authorList,
            Category category,
            float price,
            Publisher publisher,
            Year publicYear) throws BookStoreException {
        super(id, name);
        this.setAuthorList(authorList);
        this.setCategory(category);
        this.setPrice(price);
        this.setPublisher(publisher);
        this.setPublicYear(publicYear);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book{");
        sb.append(super.toString());
        sb.append(", authorList=").append(authorList);
        sb.append(", category=").append(category);
        sb.append(", price=").append(price);
        sb.append(", publisher=").append(publisher);
        sb.append(", publicYear=").append(publicYear);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public void input() throws BookStoreException {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Author: ");
//        
//         private List<Author> authorList;
        System.out.print("Category: ");
        this.setCategory(category.valueOf(sc.nextLine()));
//    private Category category;
//    private float price;
//    private Publisher publisher;
//    private Year publicYear;
    }
    
    @Override
    public void output() {
        System.out.println(toString());
    }
}
