package se1.hu3.singleton;

import java.util.ArrayList;
import java.util.List;

public class MacAddressGenerator {

    //Create array for all Mac Addresses
    private final List<String> macAddress = new ArrayList<>();


    private static MacAddressGenerator instance = null;

    private MacAddressGenerator() {
    }

    public static MacAddressGenerator getInstance() {
        if (instance == null) {
            instance = new MacAddressGenerator();
        }
        return instance;
    }

     synchronized String generate() {
        String macAdr = String.format("%02X:%02X:%02X:%02X:%02X:%02X", (int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
        if (macAddress.contains(macAdr)) {
            return "Mac Address already exists";
        } else {
            macAddress.add(macAdr);
            return macAdr;
        }
    }
}

