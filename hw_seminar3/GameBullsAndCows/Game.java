package HWSeminar3.GameBullsAndCows;

import HWSeminar3.GameBullsAndCows.GameType.GameType;
import HWSeminar3.Service.Answer;

public interface Game {
    void start(Integer wordSize, Integer tryCount, GameType gameType);
    void restart();
    Answer inputValue(String value);
    GameStatus getGameStatus();
}