package se1.hu3.factory;

public class GamingMonitor extends Monitor {
    public GamingMonitor(int bildWiederholfrequenz, double groesze, int xDots, int yDots) {
        super(bildWiederholfrequenz, groesze, xDots, yDots);
    }

    @Override
    public String getMonitorTyp() {
        return "GamingMonitor";
    }
}
