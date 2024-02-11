package HWSeminar2.Heroes;

public abstract class Alive extends Heroes {
    protected String heroesType = "alive";
    public Alive(String name, double maxRunDistance, double maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
        heroesType = "alive";
    }

    public abstract void run(double distance);
    public abstract void jump(double height);
    public abstract String getStatus();
    
}
