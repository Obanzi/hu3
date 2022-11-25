package se1.hu3.factory;

public class Factory {

    public Monitor getMonitor(int bildWiederholfrequenz, double groesze, int xDots, int yDots) throws IllegalArgumentException {

        /**
         * @param bildWiederholfrequenz fuer die Bildwiederholfrequenz
         * @param groesze fuer die Groesze
         * @param xDots fuer die horizontalen Auflösungspunkte
         * @param yDots fuer die vertikalen Auflösungspunkte
         * @return Monitor
         */
        if (isGamingMonitor(bildWiederholfrequenz, groesze, xDots, yDots)) {
            return new GamingMonitor(bildWiederholfrequenz, groesze, xDots, yDots);
        } else if (isOfficeMonitor(bildWiederholfrequenz, groesze, xDots, yDots)) {
            return new OfficeMonitor(bildWiederholfrequenz, groesze, xDots, yDots);
        } else if (isArtAndDesignMonitor(bildWiederholfrequenz, groesze, xDots, yDots)) {
            return new DesignAndArtMonitor(bildWiederholfrequenz, groesze, xDots, yDots);
        }
        throw new IllegalArgumentException("Kein Monitor gefunden, Falsche Eingabe Argumente");
    }

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
