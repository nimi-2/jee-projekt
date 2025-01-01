package bp.books.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Tytuł nie może być pusty")
    @Size(min = 1, max = 100, message = "Tytuł musi mieć od 1 do 100 znaków")
    private String title;

    @NotNull(message = "Autor nie może być pusty")
    @Size(min = 1, max = 100, message = "Autor musi mieć od 1 do 100 znaków")
    private String author;

    @NotNull(message = "Rok wydania nie może być pusty")
    @Min(value = 1000, message = "Rok wydania musi być większy niż 1000")
    private Integer publicationYear;

    @Size(max = 50, message = "Gatunek nie może być dłuższy niż 50 znaków")
    private String genre;

    @NotNull(message = "Cena nie może być pusta")
    @Min(value = 0, message = "Cena nie może być ujemna")
    private Double price;

    // Constructors, Getters, Setters, toString method
    public Book() {}

    public Book(String title, String author, int publicationYear, String genre, double price) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.price = price;
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                '}';
    }
}
