package practice.dto;

import practice.Category;
import practice.Publisher;

import java.util.List;

public class BookInsertDTO {
    private String code;
    private String name;
    private List<String> author;
    private String category;
    private Double price;
    private PublisherInsertDTO publisher;
    private int publicYear;

    public BookInsertDTO(String code, String name, List<String> author, String category, Double price, PublisherInsertDTO publisher, int publicYear) {
        this.code = code;
        this.name = name;
        this.author = author;
        this.category = category;
        this.price = price;
        this.publisher = publisher;
        this.publicYear = publicYear;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAuthor() {
        return author;
    }

    public void setAuthor(List<String> author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public PublisherInsertDTO getPublisher() {
        return publisher;
    }

    public void setPublisher(PublisherInsertDTO publisher) {
        this.publisher = publisher;
    }

    public int getPublicYear() {
        return publicYear;
    }

    public void setPublicYear(int publicYear) {
        this.publicYear = publicYear;
    }
}
