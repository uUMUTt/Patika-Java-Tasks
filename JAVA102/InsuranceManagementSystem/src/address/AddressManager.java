package address;

import java.util.List;

public class AddressManager {

    public static void addAddress(List<Address> addresses, Address address) {
        addresses.add(address);
    }

    public static void removeAddress(List<Address> addresses, Address address) {
        addresses.remove(address);
    }
    
}
