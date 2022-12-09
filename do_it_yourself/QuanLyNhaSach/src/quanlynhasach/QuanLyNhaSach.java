/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlynhasach;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 84793
 */
public class QuanLyNhaSach {

    private ArrayListBook bookList;
    private List<ArrayListBook> serialBookList;

    public QuanLyNhaSach() {
        this.bookList = new ArrayListBook();
        this.serialBookList = new ArrayList();
    }
    
    public boolean add (IBook book){
        if(book != null ){
            return false;
        }
            this.bookList.add(book);
    }
    public boolean add (IBook book){
        if(book != null ){
            return false;
        }
            this.bookList.add(book);
    }
    public boolean remove (IBook book){
        if(book != null ){
            return false;
        }
            this.bookList.remove(book);
    }

    public List<IBook> getBookList() {
        return bookList;
    }

    public void setBookList(List<IBook> bookList) {
        if (bookList != null) {
            this.bookList = bookList;
        }
    }

    public List<List<IBook>> getSerialBookList() {
        return serialBookList;
    }

    public void setSerialBookList(List<List<IBook>> serialBookList) {
        if (serialBookList != null) {
            this.serialBookList = serialBookList;
        }
    }

    public List<IBook> filterByAuthor(Author author) {
        if (author != null) {
            this.bookList
                    .stream()
                    .filter(book -> author.getId().equalsIgnoreCase(book.getId()))
                    .toList();
        }
        return null;
    }

    public List<IBook> filterByCategory(Category category) {
        if (category != null) {
            this.bookList
                    .stream()
                    .filter(book -> category.equals(book.getCategory()))
                    .toList();
        }
        return null;
    }
    public List<IBook> filterByPublisher(Publisher publisher) {
        if (publisher != null) {
            this.bookList
                    .stream()
                    .filter(book -> publisher.equals(book.getPublisher()))
                    .toList();
        }
        return null;
    }
}
