package se1.hu3.adapter;

public class Heissgetraenkemacher {
    private Kaffeezubereitung heissgetraenkemacher;

    public Heissgetraenkemacher(Kaffeezubereitung heissgetraenkemacher) {
        this.heissgetraenkemacher = heissgetraenkemacher;
    }

    public void maecheGetraenk() {
        heissgetraenkemacher.kaffeebohnenRoesten();
        heissgetraenkemacher.bohnenMahlen();
        heissgetraenkemacher.wasserAufgiessen();
        heissgetraenkemacher.kaffeeAusgeben();
        System.out.println("Heissgetränk ist fertig");
    }
}
