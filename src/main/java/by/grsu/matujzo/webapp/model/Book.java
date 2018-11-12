package by.grsu.matujzo.webapp.model;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    //private String text;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "author")
    private String author;
    @Column(name = "genre")
    private String genre;


    public Book() {}

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return this.author+" "+this.name+" жанр:"+this.genre;
    }

    public boolean equals(Book book) throws NullPointerException {
        if(book==null)
            throw new NullPointerException("Your book is empty or has wrong id");
        return this.name.equals(book.getName());
    }
}