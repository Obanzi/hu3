package se1.hu3.composite;

public class Gondel extends Node{

    private double geschwindigkeit = 0.0;

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public double setGeschwindigkeit(double geschwindigkeit) {
        return this.geschwindigkeit = geschwindigkeit;
    }

    public Gondel(String name) {
        super(name);
    }

    @Override
    public void startup() {
        setGeschwindigkeit(10.0);
        System.out.println("Gondelbahn " + getName() + " wird gestartet");
        setGeschwindigkeit(15.0);
        System.out.println("Gondel " + getName() + " hat die Geschwindigkeit " + getGeschwindigkeit() + " m/s erreicht");
    }

    @Override
    public void shutdown() {
        setGeschwindigkeit(0.0);
        System.out.println("Gondelbahn " + getName() + " wird heruntergefahren");
        System.out.println("Gondel " + getName() + " hat die Geschwindigkeit " + getGeschwindigkeit() + " m/s erreicht");
    }

}
