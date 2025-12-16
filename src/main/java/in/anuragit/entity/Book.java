package in.anuragit.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "BOOK_DTLS")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOOK_ID")
    private Integer bookId;

    @Column(name = "BOOK_NAME")
    private String bookName;

    @Column(name = "BOOK_PRICE")
    private Double bookPrice;
}
