package HWSeminar2.Heroes;

public class Human extends Alive{

    public Human(String name, double maxRunDistance, double maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }

    @Override
    public void run(double distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Человек '" + name + "' пробежал дистанцию длинной " +
                    distance + " м.");
        } else {
            System.out.println("Человек '" + name + "' не пробежал дистанцию длинной " +
                    distance + " м.");
            this.status = "Not ok";
        }
    }

    @Override
    public void jump(double height) {
        if (height <= maxJumpHeight) {
            System.out.println("Человек '" + name + "' перепрыгнул стену высотой " +
                    height + " м.");
        } else {
            System.out.println("Человек '" + name + "' не перепрыгнул стену высотой " +
                    height + " м.");
            this.status = "Not ok";
        }
    }

    @Override
    public String getStatus() {
        return this.status;
    };

}