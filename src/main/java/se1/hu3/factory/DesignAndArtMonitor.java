package se1.hu3.factory;

public class DesignAndArtMonitor extends Monitor {
    /**
     * @param bildWiederholfrequenz fuer die Bildwiederholfrequenz
     * @param groesze fuer die Groesze
     * @param xDots fuer die horizontalen Auflösungspunkte
     * @param yDots fuer die vertikalen Auflösungspunkte
     */
    public DesignAndArtMonitor(int bildWiederholfrequenz, double groesze, int xDots, int yDots) {
        super(bildWiederholfrequenz, groesze, xDots, yDots);
    }

    /**
     * @return MonitorTyp in Form eines Strings
     */
    @Override
    public String getMonitorTyp() {
        return "DesignAndArtMonitor";
    }
}

