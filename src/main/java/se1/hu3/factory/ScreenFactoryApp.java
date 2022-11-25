package se1.hu3.factory;

public class ScreenFactoryApp {
    public static void main(String[] args) {

            Factory screenFactory = new Factory();
            Monitor monitor1 = screenFactory.getMonitor(40, 27.0, 1920, 1200);
            Monitor monitor2 = screenFactory.getMonitor(220, 27.0, 2560, 1440);
            Monitor monitor3 = screenFactory.getMonitor(60, 37.0, 1920, 1200);


            System.out.println("Monitor 1 " + monitor1.getMonitorTyp());
            System.out.println("Monitor 2 " + monitor2.getMonitorTyp());
            System.out.println("Monitor 3 " + monitor3.getMonitorTyp());

            // Try to create a monitor with wrong parameters
            try {
                Monitor monitor4 = screenFactory.getMonitor(405, 27.0, 1920, 1200);
                System.out.println("Monitor 4 " + monitor4.getMonitorTyp());
            } catch (IllegalArgumentException e) {
                System.out.println("Monitor 4 " + e.getMessage());
            } // end try-catch
    } // end of main
} // end of class
