package HWSeminar3.Service;

import java.util.Scanner;

import HWSeminar3.GameBullsAndCows.GameType.GameType;

public class Initialization {
    private final int worldSize;
    private final int tryCount;
    private final GameType gameType;
    public Initialization() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Для игры Быки и Коровы, введите стартовые настройки:");
            System.out.println("Введите длину слова:");
            this.worldSize = scanner.nextInt();
            System.out.println("Введите количество попыток:");
            this.tryCount = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Введите режим игры, с учётом регистра,\n" +
                    "где C - кириллическое слово, L - латиница, " +
                    "а также числа во всех остальных случаях"
            );
            String inputGameType = scanner.nextLine();
            switch (inputGameType) {
                case "C":
                    this.gameType = GameType.CYRILLIC;
                    break;
                case "L":
                    this.gameType = GameType.LATIN;
                    break;
                default:
                    this.gameType = GameType.NUMBERS;
            }
        }

    }

    public int getWorldSize() {
        return worldSize;
    }

    public int getTryCount() {
        return tryCount;
    }

    public GameType getGameType() {
        return gameType;
    }
}