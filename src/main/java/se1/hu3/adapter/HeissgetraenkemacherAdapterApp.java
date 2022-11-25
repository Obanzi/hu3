package se1.hu3.adapter;


public class HeissgetraenkemacherAdapterApp {

    public static void main(String[] args) {

        Heissgetraenkemacher heissgetraenkemacher1 = new Heissgetraenkemacher(new KaffezubereitungALT());
        System.out.println("Kaffee wird gemacht");
        System.out.println();
        heissgetraenkemacher1.maecheGetraenk();
        System.out.println("---------");
        System.out.println("Kakao wird gemacht: ");
        System.out.println();
        Heissgetraenkemacher heissgetraenkemacher2 = new Heissgetraenkemacher(new KaffezubereitungAdapter(new KaokaozubereitungApp()));
        heissgetraenkemacher2.maecheGetraenk();
    }
}
