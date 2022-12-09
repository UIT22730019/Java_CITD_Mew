/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhasach;

import java.time.Year;
import java.util.List;

/**
 *
 * @author 84793
 */
public class Book extends BookStoreObject implements IBook {

    private List<Author> authorList;// tác giả có thể 1 hoặc nhiều
    private Category category;
    private float price;
    private Publisher publisher;
    private Year publicYear;

    public List<Author> getAuthorList() {
        return authorList;
    }

    public final void setAuthorList(List<Author> authorList) throws BookStoreExeption {
        if (authorList == null || authorList.isEmpty()) {
            throw new BookStoreExeption("Author is null or Empty");
        }
        this.authorList = authorList;
    }

    public Category getCategory() {
        return category;
    }

    public final void setCategory(Category category) throws BookStoreExeption {
        if (category == null) {
            throw new BookStoreExeption("Category is null");
        }
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public final void setPrice(float price) throws BookStoreExeption {
        if (price < 0) {
            throw new BookStoreExeption("Price < 0");
        }
        this.price = price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public final void setPublisher(Publisher publisher) throws BookStoreExeption {
        if (publisher == null) {
            throw new BookStoreExeption("Publisher is null or Empty");
        }
        this.publisher = publisher;
    }

    public Year getPublicYear() {
        return publicYear;
    }

    public final void setPublicYear(Year publicYear) throws BookStoreExeption {
        if (publicYear == null || publicYear.isAfter(Year.now())) {
            throw new BookStoreExeption("Public year is null");
        }
        this.publicYear = publicYear;
    }

    public Book() {
    }

    public Book(String id,
            String name,
            List<Author> authorList,
            Category category,
            float price,
            Publisher publisher,
            Year publicYear
    ) throws BookStoreExeption {
        super(id, name);
        this.setAuthorList(authorList);
        this.setCategory(category);
        this.setPrice(price);
        this.setPublisher(publisher);
        this.setPublicYear(publicYear);
    }

}
