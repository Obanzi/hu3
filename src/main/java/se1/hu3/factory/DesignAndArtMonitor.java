package se1.hu3.factory;

public class DesignAndArtMonitor extends Monitor {
    public DesignAndArtMonitor(int bildWiederholfrequenz, double groesze, int xDots, int yDots) {
        super(bildWiederholfrequenz, groesze, xDots, yDots);
    }

    @Override
    public String getMonitorTyp() {
        return "DesignAndArtMonitor";
    }
}

