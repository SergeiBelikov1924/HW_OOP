package HWSeminar3;

import HWSeminar3.GameBullsAndCows.AbstractGame;
import HWSeminar3.GameBullsAndCows.GameStatus;
import HWSeminar3.GameBullsAndCows.GameType.CyrillicGame;
import HWSeminar3.GameBullsAndCows.GameType.GameType;
import HWSeminar3.GameBullsAndCows.GameType.LatinGame;
import HWSeminar3.GameBullsAndCows.GameType.NumberGame;
import HWSeminar3.Service.Answer;
import HWSeminar3.Service.Initialization;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Initialization init = new Initialization();

        AbstractGame ag = switch (init.getGameType()) {
            case GameType.cyrillic -> new CyrillicGame();
            case GameType.latin -> new LatinGame();
            default -> new NumberGame();
        };
        ag.start(init.getWorldSize(),
                init.getTryCount(),
                init.getGameType());

        Scanner scanner = new Scanner(System.in);
        while (!ag.getGameStatus().equals(GameStatus.EXIT)) {
            System.out.println("Введите новое значение, либо " +
                    "'s' для просмотра статистики, " +
                    "'r' - для рестарта игры, " +
                    "'e' - для выхода"
            );
            String inputtedValue = scanner.nextLine();
            if (inputtedValue.equals("s")) {
                ag.getLoggerHistory();
                continue;
            }
            if (inputtedValue.equals("r")) {
                ag.restart();
                continue;
            }
            if (inputtedValue.equals("e")) {
                ag.exit();
                continue;
            }

            Answer answer = ag.inputValue(inputtedValue);
            System.out.println(answer);

            if (ag.getGameStatus().equals(GameStatus.WIN) ||
                    ag.getGameStatus().equals(GameStatus.LOSE)) {
                ag.restart();
            }
        }

        scanner.close();
    }
}