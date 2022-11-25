package se1.hu3.factory;

public class OfficeMonitor extends Monitor {
    public OfficeMonitor(int bildWiederholfrequenz, double groesze, int xDots, int yDots) {
        super(bildWiederholfrequenz, groesze, xDots, yDots);
    }

    @Override
    public String getMonitorTyp() {
        return "OfficeMonitor";
    }
}
