package practice;

import practice.dto.BookInsertDTO;
import practice.dto.PublisherInsertDTO;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Book> books = initBookData();

        sortByAuthor(books);

        sortByCategory(books);

        sortByPublisherName(books);
    }

    private static List<Book> sortByAuthor(List<Book> books) {
        Collections.sort(books, new Comparator<Book>() {

            public int compare(Book o1, Book o2) {
                return o2.getAuthor().get(0).compareTo(o1.getAuthor().get(0));
            }
        });

        return books;
    }

    private static List<Book> sortByCategory(List<Book> books) {
        Collections.sort(books, new Comparator<Book>() {

            public int compare(Book o1, Book o2) {
                return o2.getCategory().compareTo(o1.getCategory());
            }
        });

        return books;
    }

    private static List<Book> sortByPublisherName(List<Book> books) {
        Collections.sort(books, new Comparator<Book>() {

            public int compare(Book o1, Book o2) {
                return o2.getPublisher().getName().compareTo(o1.getPublisher().getName());
            }
        });

        return books;
    }

    private static List<Book> initBookData() {
        PublisherInsertDTO kimDong = new PublisherInsertDTO("KD", "Kim Dong", "0123456789", "Ha Noi");
        PublisherInsertDTO giaoDuc = new PublisherInsertDTO("GD", "Giao duc", "0123456789", "Ha Noi");

        List<BookInsertDTO> bookInsertDTOList = Arrays.asList(
            new BookInsertDTO("NGK", "Nha Gia Kim", Arrays.asList("Paulo Coelho"), "NOVEL", 100000d, giaoDuc, 2000),
            new BookInsertDTO("TDB", "Tren duong bang", Arrays.asList("Tony"), "CHILDREN", 100000d, kimDong, 2000)
        );

        List<Book> books = new ArrayList<>();

        for (BookInsertDTO bookInsertDTO : bookInsertDTOList) {
            validateBook(bookInsertDTO);
            Book book = convertBookDTOToBook(bookInsertDTO);
            books.add(book);
        }

        return books;
    }

    private static void validateBook(BookInsertDTO bookInsertDTO) {
        if (bookInsertDTO.getCode().isBlank() || bookInsertDTO.getCode() == null) {
            throw new UnsupportedOperationException("Book code must not be null or blank");
        }

        if (bookInsertDTO.getName().isBlank() || bookInsertDTO.getName() == null) {
            throw new UnsupportedOperationException("Book name must not be null or blank");
        }

        if (bookInsertDTO.getAuthor() == null || bookInsertDTO.getAuthor().size() == 0) {
            throw new UnsupportedOperationException("Book author must not be null or empty");
        }

        if (bookInsertDTO.getCategory().isBlank() || bookInsertDTO.getCategory() == null) {
            throw new UnsupportedOperationException("Book category must not be null or empty");
        }

        if (bookInsertDTO.getPrice() < 0 || bookInsertDTO.getCategory() == null) {
            throw new UnsupportedOperationException("Book price must not be null or less than 0");
        }

        if (bookInsertDTO.getPublisher() == null) {
            throw new UnsupportedOperationException("Book publisher must not be null");
        }

        if (bookInsertDTO.getPublicYear() < 0 || bookInsertDTO.getCategory() == null) {
            throw new UnsupportedOperationException("Book publish year must not be null or less than 0");
        }
    }

    private static Publisher convertPublishDTOToPublisher(PublisherInsertDTO publisherInsertDTO) {
        Publisher publisher = new Publisher();
        publisher.setCode(publisherInsertDTO.getCode());
        publisher.setName(publisherInsertDTO.getName());
        publisher.setPhone(publisherInsertDTO.getPhone());
        publisher.setAddress(publisherInsertDTO.getAddress());
        return publisher;
    }

    private static Book convertBookDTOToBook(BookInsertDTO bookInsertDTO) {
        Book book = new Book();
        book.setCode(bookInsertDTO.getCode());
        book.setAuthor(bookInsertDTO.getAuthor());
        book.setCategory(Category.valueOf(bookInsertDTO.getCategory()));
        book.setPrice(bookInsertDTO.getPrice());
        book.setPublicYear(bookInsertDTO.getPublicYear());
        book.setPublisher(convertPublishDTOToPublisher(bookInsertDTO.getPublisher()));

        return book;
    }
}
