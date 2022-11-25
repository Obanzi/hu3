package se1.hu3.factory;

public abstract class Monitor {
    int bildWiederholfrequenz;
    double groesze;
    int xDots;
    int yDots;

    /**
     * @param bildWiederholfrequenz fuer die Bildwiederholfrequenz
     * @param groesze fuer die Groesze
     * @param xDots fuer die horizontalen Auflösungspunkte
     * @param yDots fuer die vertikalen Auflösungspunkte
     */
    public Monitor(int bildWiederholfrequenz, double groesze, int xDots, int yDots) {
        this.bildWiederholfrequenz = bildWiederholfrequenz;
        this.groesze = groesze;
        this.xDots = xDots;
        this.yDots = yDots;
    }

    public abstract String getMonitorTyp();
}
