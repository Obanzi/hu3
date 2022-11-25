package se1.hu3.factory;

public abstract class Monitor {
    int bildWiederholfrequenz;
    double grosze;
    int xDots;
    int yDots;

    public Monitor(int bildWiederholfrequenz, double grosze, int xDots, int yDots) {
        this.bildWiederholfrequenz = bildWiederholfrequenz;
        this.grosze = grosze;
        this.xDots = xDots;
        this.yDots = yDots;
    }

    public abstract String getMonitorTyp();
}
