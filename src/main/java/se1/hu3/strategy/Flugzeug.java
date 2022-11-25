package se1.hu3.strategy;

public class Flugzeug {

    private Steuerung steuerung;

    public Flugzeug(Steuerung steuerung) {
        this.steuerung = steuerung;
    }

    /**
     * @param winkel des Flugzeugs
     */
    public void steuern(double winkel) {
        steuerung.steuern(winkel);
    }

    /**
     * @param start des Flugzeugs
     */
    public void starten(String start){
        System.out.println("Abgehoben in " + start);
    }

    /**
     * @param ziel des Flugzeugs
     */
    public void landen(String ziel){
        System.out.println("Gelandet in " + ziel);
    }

    public void setSteuerung(Steuerung steuerung) {
        this.steuerung = steuerung;
    }
}
