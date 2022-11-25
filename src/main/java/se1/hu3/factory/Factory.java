package se1.hu3.factory;

public class Factory {
    /**
     * @param bildWiederholfrequenz fuer die Bildwiederholfrequenz
     * @param groesze fuer die Groesze
     * @param xDots fuer die horizontalen Auflösungspunkte
     * @param yDots fuer die vertikalen Auflösungspunkte
     * @return monitorTyp fuer den MonitorTyp
     * @throws IllegalArgumentException wenn die Bildwiederholfrequenz kleiner als 60 ist
     * @throws IllegalArgumentException wenn die Bildwiederholfrequenz groesser als 240 ist
     * @throws IllegalArgumentException wenn die Groesze kleiner als 20 ist
     * @throws IllegalArgumentException wenn die Groesze groesser als 50 ist
     * @throws IllegalArgumentException wenn die horizontalen Auflösungspunkte kleiner als 800 ist
     * @throws IllegalArgumentException wenn die horizontalen Auflösungspunkte groesser als 3840 ist
     * @throws IllegalArgumentException wenn die vertikalen Auflösungspunkte kleiner als 600 ist
     * @throws IllegalArgumentException wenn die vertikalen Auflösungspunkte groesser als 2160 ist
     */
    public Monitor getMonitor(int bildWiederholfrequenz, double groesze, int xDots, int yDots) throws IllegalArgumentException {

        if (isGamingMonitor(bildWiederholfrequenz, groesze, xDots, yDots)) {
            return new GamingMonitor(bildWiederholfrequenz, groesze, xDots, yDots);
        } else if (isOfficeMonitor(bildWiederholfrequenz, groesze, xDots, yDots)) {
            return new OfficeMonitor(bildWiederholfrequenz, groesze, xDots, yDots);
        } else if (isArtAndDesignMonitor(bildWiederholfrequenz, groesze, xDots, yDots)) {
            return new DesignAndArtMonitor(bildWiederholfrequenz, groesze, xDots, yDots);
        }
        throw new IllegalArgumentException("Kein Monitor gefunden, Falsche Eingabe Argumente");
    }

    /**
     * @return boolean if it is a GamingMonitor
     */
    private boolean isOfficeMonitor(
            int imageRepetitionFrequency,
            double screenDiagonal, int resolutionX, int resolutionY) {
        return imageRepetitionFrequency >= 30
                && imageRepetitionFrequency <= 50
                && screenDiagonal >= 23.8
                && screenDiagonal <= 27.0
                && resolutionX >= 1280
                && resolutionX <= 1920
                && resolutionY >= 1024
                && resolutionY <= 1200;
    }

    /**
     * @return boolean if it is a GamingMonitor
     */

    private boolean isGamingMonitor(
            int imageRepetitionFrequency, double screenDiagonal, int resolutionX, int resolutionY) {
        return imageRepetitionFrequency >= 75
                && imageRepetitionFrequency <= 240
                && screenDiagonal >= 23.8
                && screenDiagonal <= 28.0
                && resolutionX >= 1920
                && resolutionX <= 2560
                && resolutionY >= 1024
                && resolutionY <= 1440;
    }

    /**
     * @return boolean if it is a ArtAndDesignMonitor
     */
    private boolean isArtAndDesignMonitor(
            int imageRepetitionFrequency, double screenDiagonal, int resolutionX, int resolutionY) {
        return imageRepetitionFrequency >= 55
                && imageRepetitionFrequency <= 90
                && screenDiagonal >= 31.5
                && resolutionX >= 1920
                && resolutionX <= 3840
                && resolutionY >= 1200
                && resolutionY <= 2160;
    }
}
