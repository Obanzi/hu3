package se1.hu3.singleton;

public class MacAddressSingletonApp {
    public static void main(String[] args) {
        MacAddressGenerator generator = MacAddressGenerator.getInstance();
        System.out.println(generator.generate());
        System.out.println(generator.generate());
        System.out.println(generator.generate());
        System.out.println(generator.generate());
        System.out.println(generator.generate());
        System.out.println(generator.generate());
        System.out.println(generator.generate());
        System.out.println(generator.generate());
        System.out.println(generator.generate());
        System.out.println(generator.generate());
    }
}
