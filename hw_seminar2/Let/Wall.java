package HWSeminar2.Let;

import HWSeminar2.Heroes.Heroes;


public class Wall extends Let{
    private final double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public void overcoming(Heroes heroes) {
        heroes.jump(height);
    }
}