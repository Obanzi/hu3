package se1.hu3.strategy;

public class Boden implements Steuerung {

    public void steuern(double winkel) {
        System.out.println("Bugfahrwerk am Boden gelenkt um " + winkel +  " Grad");
    }
}

