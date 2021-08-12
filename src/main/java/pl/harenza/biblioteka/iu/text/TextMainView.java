package pl.harenza.biblioteka.iu.text;

import pl.harenza.biblioteka.domena.book.BookService;

import java.io.IOException;
import java.util.Scanner;

public class TextMainView {

    private BookService bookService;
    //wstrzykiwanie zależności
    public TextMainView(BookService bs) {
        this.bookService = bs;
    }
//koniec
    public void init() throws IOException {
        System.out.println("Biblioteka - system do zarządzania zbiorami");
        this.bookService.readAll();
        System.out.println("Wybierz operację: ");
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        while (option !=0) {
            System.out.println("1. Dodaj nową książkę");
            System.out.println("0. Wyjdz z systemu");
            option = Integer.parseInt(scanner.nextLine());
            if( option == 1) {
                this.handleCreateNewBook(scanner);
            } else if (option == 0) {
                System.out.println("Zapisuje dane");
                this.bookService.saveAll();
                System.out.println("Kończe działanie programu. Do widzenia");
            }
        }
    }
    private void handleCreateNewBook(Scanner scanner) {
        System.out.println("Podaj tytuł książki: ");
        String title = scanner.nextLine();
        this.bookService.createNewBook(title);
    }

}


