package se1.hu3.strategy;

public class PlaneStrategyApp {

    public static void main(String[] args) {
      Steuerung boden = new Boden();
      Steuerung flug = new Flug();
      Flugzeug flugzeug = new Flugzeug(boden);



      flugzeug.starten("Innsbruck");
      flugzeug.setSteuerung(flug);
      flugzeug.steuern(23.53);

      flugzeug.landen("Wien");
      flugzeug.setSteuerung(boden);
      flugzeug.steuern(55.42);

      System.out.println("Flug beendet. Vielen Dank für Ihren Besuch!");


    }
}
