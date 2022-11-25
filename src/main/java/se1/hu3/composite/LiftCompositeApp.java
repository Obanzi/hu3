package se1.hu3.composite;

public class LiftCompositeApp {

    public static void main(String args[]){
        Skigebiet stubaiGletscher = new Skigebiet("Stubai Gletscher");

        Gondel eisgratbahn = new Gondel("Eisgratbahn");
        Gondel schaufeljochbahn = new Gondel("Schaufeljochbahn");

        for(int i = 1; i <= 4; i++){
            Fahrbetriebsmittel fahrbetriebsmittel = new Fahrbetriebsmittel("Eisgratbahn ");
            eisgratbahn.addNode(fahrbetriebsmittel);
        }
        stubaiGletscher.addNode(eisgratbahn);
        for(int i = 1; i <= 4; i++){
            Fahrbetriebsmittel fahrbetriebsmittel = new Fahrbetriebsmittel("Gletscherexpress ");
            schaufeljochbahn.addNode(fahrbetriebsmittel);
        }
        stubaiGletscher.addNode(schaufeljochbahn);


        System.out.println("Sonnenaufgang!! KICKERIKI!!");
        stubaiGletscher.startupAll();

        System.out.println();
        eisgratbahn.setGeschwindigkeit(20.0);
        System.out.println("Gondel " + eisgratbahn.getName() + " wurde auf " + eisgratbahn.getGeschwindigkeit() + " m/s beschleunigt");
        System.out.println();
        System.out.println("Skigebiet wird heruntergefahren");
        stubaiGletscher.shutdownAll();

    }
}
