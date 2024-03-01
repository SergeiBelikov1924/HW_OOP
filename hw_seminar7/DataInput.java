package HWSeminar7;

import java.util.Scanner;

public class DataInput {
    private Scanner scanner;

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public DataInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public double prompt(String message) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(message);
            return scanner.nextDouble();
        }
    }

    public String prompt() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Нажмите любую клавишу для продолжения\n" +
                               "Нажмите q, чтобы выйти");
            return in.nextLine();
        }
    }

    public String getOperator() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Выберите действие (+, -, *, /): ");
            return scanner.nextLine();
        }
    }
}
