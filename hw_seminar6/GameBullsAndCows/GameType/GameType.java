package HWSeminar3.GameBullsAndCows.GameType;

public enum GameType {
    
    CYRILLIC {
        public String getType() {return "кириллические буквы";}
    },
    LATIN {
        public String getType() {return "латинские буквы";}
    },
    NUMBERS {
        public String getType() {return "числа";}
    };
    public abstract String getType();
}