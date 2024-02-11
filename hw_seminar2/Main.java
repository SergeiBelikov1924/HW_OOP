package HWSeminar2;

import HWSeminar2.Let.Let;
import HWSeminar2.Let.RunningTrack;
import HWSeminar2.Let.Wall;
import HWSeminar2.Heroes.Cat;
import HWSeminar2.Heroes.Human;
import HWSeminar2.Heroes.Robot;
import HWSeminar2.Heroes.Heroes;


public class Main {
    public static void main(String[] args) {
        Heroes[] heroes = {
                new Human("Ivan", 500, 1),
                new Cat("Cat", 50, 2),
                new Robot("Robot", 200, 3),
        };

        Let[] lets = {
                new Wall(1),
                new RunningTrack(80),
                new Wall(2),
                new RunningTrack(90),
                new Wall(3),
                new RunningTrack(150)
        };

        for (var heroe : heroes) {
            for (var let : lets) {
                if (!heroe.getStatus().equals("Ok")) break;
                if (let instanceof RunningTrack) {
                    let.overcoming(heroe);
                } else if (let instanceof Wall) {
                    let.overcoming(heroe);
                }
            }

            System.out.print("Испытуемый '" + heroe.getName());
            if (heroe.getStatus().equals("Ok")) {
                System.out.println("' испытание прошёл.\n");
            } else {
                System.out.println("' испытание не пройдено.\n");
            }
        }
    }
}