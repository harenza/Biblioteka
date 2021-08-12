package pl.harenza.biblioteka.domena.book;

import java.io.FileNotFoundException;
import java.io.IOException;

public class BookService {

    private BookRepository repository;

    public BookService(BookRepository br) {
        this.repository = br;
    }

    public  Book createNewBook(String title) {
        return this.repository.createNewBook(title);
    }

    public void readAll()  {
        try {
            this.repository.readAll();
        } catch (FileNotFoundException e) {
            System.out.println("File not found, missing books data");
        }
    }

    public void saveAll() throws IOException {
        this.repository.saveAll();
    }
}
