package HWSeminar2.Heroes;

public class Robot extends NotAlive{

        public Robot(String name, double maxRunDistance, double maxJumpHeight) {
            super(name, maxRunDistance, maxJumpHeight);
        }
    
        @Override
        public void run(double distance) {
            if (distance <= maxRunDistance) {
                System.out.println("Робот '" + name + "' пробежал дистанцию длинной " +
                        distance + " м.");
            } else {
                System.out.println("Робот '" + name + "' не пробежал дистанцию длинной " +
                        distance + " м.");
                this.status = "Not ok";
            }
        }
    
        @Override
        public void jump(double height) {
            if (height <= maxJumpHeight) {
                System.out.println("Робот '" + name + "' перепрыгнул стену высотой " +
                        height + " м.");
            } else {
                System.out.println("Робот '" + name + "' не перепрыгнул стену высотой " +
                        height + " м.");
                this.status = "Not ok";
            }
        }
    
        @Override
        public String getStatus() {
            return this.status;
        };
    
}
