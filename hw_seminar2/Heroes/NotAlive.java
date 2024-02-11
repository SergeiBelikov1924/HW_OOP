package HWSeminar2.Heroes;

public abstract class NotAlive extends Heroes {
        protected String heroesType = "notalive";
        public NotAlive(String name, double maxRunDistance, double maxJumpHeight) {
            super(name, maxRunDistance, maxJumpHeight);
            heroesType = "notalive";
        }
    
        public abstract void run(double distance);
        public abstract void jump(double height);
        public abstract String getStatus();
    
}
