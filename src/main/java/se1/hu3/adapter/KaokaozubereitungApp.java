package se1.hu3.adapter;

public class KaokaozubereitungApp implements Kaokaozubereitung{
        @Override
        public void pulvermengeBestimmen() {
            System.out.println("Pulvermenge bestimmen");
        }
        @Override
        public void mitWasserVermischen() {
            System.out.println("Mit Wasser vermischen");
        }
        @Override
        public void kakaoAusgeben() {
            System.out.println("Kakao ausgeben");
        }

}
