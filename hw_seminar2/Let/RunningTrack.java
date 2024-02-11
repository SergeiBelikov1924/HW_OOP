package HWSeminar2.Let;

import HWSeminar2.Heroes.Heroes;


public class RunningTrack extends Let{
    private final double distance;

    public RunningTrack(double distance) {
        this.distance = distance;
    }

    @Override
    public void overcoming(Heroes sportsman) {
        sportsman.run(distance);
    }
}