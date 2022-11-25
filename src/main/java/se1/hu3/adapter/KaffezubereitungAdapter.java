package se1.hu3.adapter;

public class KaffezubereitungAdapter implements Kaffeezubereitung{

    KaokaozubereitungApp kaokaozubereitung;

    public KaffezubereitungAdapter(KaokaozubereitungApp kaokaozubereitung) {
        this.kaokaozubereitung = kaokaozubereitung;
    }
    @Override
    public void kaffeebohnenRoesten() {
        kaokaozubereitung.pulvermengeBestimmen();
    }

    @Override
    public void bohnenMahlen() {
    }
    @Override
    public void wasserAufgiessen() {
        kaokaozubereitung.mitWasserVermischen();
    }
    @Override
    public void kaffeeAusgeben() {
        kaokaozubereitung.kakaoAusgeben();
    }

}
