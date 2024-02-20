package HWSeminar3.GameBullsAndCows.GameType;

import java.util.ArrayList;
import java.util.List;

import HWSeminar3.GameBullsAndCows.AbstractGame;

public class LatinGame extends AbstractGame {
    
    @Override
    protected List<Character> generateCharList() {
        List<Character> latinAlphabet = new ArrayList<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            latinAlphabet.add(c);
        }
        return latinAlphabet;
    }
}