package se1.hu3.factory;

public abstract class Monitor {
    int bildWiederholfrequenz;
    double groeße;
    int xDots;
    int yDots;

    public Monitor(int bildWiederholfrequenz, double groeße, int xDots, int yDots) {
        this.bildWiederholfrequenz = bildWiederholfrequenz;
        this.groeße = groeße;
        this.xDots = xDots;
        this.yDots = yDots;
    }

    public abstract String getMonitorTyp();
}
