package HWSeminar2.Heroes;

public abstract class Heroes {
    protected String name;
    protected String status = "Ok";
    protected double maxRunDistance;
    protected double maxJumpHeight;
    
    public String getName() {
        return name;
    }
    
    Heroes(String name, double maxRunDistance, double maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }
    
    public abstract void run(double distance);
    public abstract void jump(double height);
    public abstract String getStatus();
    
    
}
