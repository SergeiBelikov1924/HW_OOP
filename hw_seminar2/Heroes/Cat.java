package HWSeminar2.Heroes;


public class Cat extends Alive{

    public Cat(String name, double maxRunDistance, double maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }

    @Override
    public void run(double distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Кот '" + name + "' пробежал дистанцию длинной " +
                    distance + " м.");
        } else {
            System.out.println("Кот '" + name + "' не пробежал дистанцию длинной " +
                    distance + " м.");
            this.status = "Not ok";
        }
    }

    @Override
    public void jump(double height) {
        if (height <= maxJumpHeight) {
            System.out.println("Кот '" + name + "' перепрыгнул стену высотой " +
                    height + " м.");
        } else {
            System.out.println("Кот '" + name + "' не перепрыгнул стену высотой " +
                    height + " м.");
            this.status = "Not ok";
        }
    }

    @Override
    public String getStatus() {
        return this.status;
    };

}