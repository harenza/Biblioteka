package pl.harenza.biblioteka.domena.book;

public class Book {

    private long id;
    private String tytul;

    public Book(long id, String tytul) {
        this.id = id;
        this.tytul = tytul;
    }

    public String getTitle() {
        return this.tytul;
    }
}
