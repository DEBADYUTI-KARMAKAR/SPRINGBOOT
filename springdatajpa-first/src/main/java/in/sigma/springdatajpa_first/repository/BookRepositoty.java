package in.sigma.springdatajpa_first.repository;

import in.sigma.springdatajpa_first.entity.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepositoty extends CrudRepository<Book,Integer> {
    public List<Book> findByBookPriceGreaterThan(double price);
    public List<Book> findByBookPriceLessThan(double price);
    public List<Book> findByBookName(String bookName);

    @Query(value = "select * from book where book_price > 250", nativeQuery = true)
    public List<Book> getAllBooks();

    @Query("from Book b where b.bookPrice>250")
    public List<Book> getBooks();
}
