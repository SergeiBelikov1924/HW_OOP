package HWSeminar7.Structure.Logger;

public class Logger implements ILogger{
    @Override
    public void log(String message) {
        System.out.println(STR."\tLOG: \{message}");
    }
}
