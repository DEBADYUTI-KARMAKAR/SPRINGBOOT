package in.sigma.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
//@Table()
public class Book {
    @Id
    private Integer bookId;
    private String bookName;
    private Double bookPrice;

}
