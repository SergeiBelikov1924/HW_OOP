package HWSeminar3.GameBullsAndCows.GameType;

import java.util.ArrayList;
import java.util.List;

import HWSeminar3.GameBullsAndCows.AbstractGame;

public class CyrillicGame extends AbstractGame {
    
    @Override
    protected List<Character> generateCharList() {
        List<Character> russianAlphabet = new ArrayList<>();
        for (char c = 'А'; c <= 'Я'; c++) {
            russianAlphabet.add(c);
        }
        russianAlphabet.add('Ё');
        return russianAlphabet;
    }
}