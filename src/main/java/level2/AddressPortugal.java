package level2;

public class AddressPortugal implements Address {

    @Override
    public String generateAddress(String street, int number, String city, String postcode) {
        return street + " " + number + ", " + city + " (" + postcode + ")";
    }
}
