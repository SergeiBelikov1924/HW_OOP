package HWSeminar3.GameBullsAndCows.GameType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import HWSeminar3.GameBullsAndCows.AbstractGame;

public class NumberGame extends AbstractGame {
    @Override
    protected List<Character> generateCharList() {

        return new ArrayList<>(
                Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9'));
    }
}
