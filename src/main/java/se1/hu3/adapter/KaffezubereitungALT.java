package se1.hu3.adapter;

public class KaffezubereitungALT implements Kaffeezubereitung{

    public void kaffeebohnenRoesten() {
        System.out.println("Kaffeebohnen werden geröstet");
    }

    public void bohnenMahlen() {
        System.out.println("Kaffeebohnen werden gemahlen");
    }

    public void wasserAufgiessen() {
        System.out.println("Kaffee wird gekocht");
    }

    public void kaffeeAusgeben() {
        System.out.println("Kaffee wird ausgegeben");
    }

}
