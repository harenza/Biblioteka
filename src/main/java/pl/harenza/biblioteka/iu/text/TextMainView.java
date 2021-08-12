package pl.harenza.biblioteka.iu.text;

import pl.harenza.biblioteka.domena.book.BookService;

import java.util.Scanner;

public class TextMainView {

    private BookService bookService = new BookService();

    public void init() {
        System.out.println("Biblioteka - system do zarządzania zbiorami");

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


