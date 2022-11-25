package se1.hu3.strategy;

public class Flugzeug {

    private Steuerung steuerung;

    public Flugzeug(Steuerung steuerung) {
        this.steuerung = steuerung;
    }

    public void steuern(double winkel) {
        steuerung.steuern(winkel);
    }

    public void starten(String start){
        System.out.println("Abgehoben in " + start);
    }
    public void landen(String ziel){
        System.out.println("Gelandet in " + ziel);
    }

    public void setSteuerung(Steuerung steuerung) {
        this.steuerung = steuerung;
    }
}
