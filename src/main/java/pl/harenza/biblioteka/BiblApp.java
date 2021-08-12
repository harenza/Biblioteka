package pl.harenza.biblioteka;

import pl.harenza.biblioteka.domena.book.BookRepository;
import pl.harenza.biblioteka.domena.book.BookService;
import pl.harenza.biblioteka.iu.text.TextMainView;

import java.io.IOException;

public class BiblApp {

    public static void main(String[] args) throws IOException {

        BookRepository bookRepository = new BookRepository();  //wstrzyknięcie :)
        BookService bookService = new BookService(bookRepository); //<- tu wstrzykujemy :) możemy ten serwis wstrzykiwać do innych serwisów lub widoków

        TextMainView view = new TextMainView(bookService);  // <- tu wstrzykujemy :) możemy ten serwis wstrzykiwać do innych serwisów lub widoków
        view.init();
    }
}
