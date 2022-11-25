package se1.hu3.strategy;

public class Flug implements Steuerung {

    public void steuern(double winkel) {
        System.out.println("Kursänderung im Flug um " + winkel + " Grad");
    }
}

