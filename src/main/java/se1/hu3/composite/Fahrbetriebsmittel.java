package se1.hu3.composite;

public class Fahrbetriebsmittel extends Node{

    public Fahrbetriebsmittel(String name) {
        super(name);
    }

    @Override
    public void startup() {
        System.out.println("Fahrbetriebsmittel " + getName() + "mit der ID: " + getId() + " wird gestartet");
    }

    @Override
    public void shutdown() {
        System.out.println("Fahrbetriebsmittel " + getName() + "mit der ID: " + getId() + " wird heruntergefahren");
    }

}
