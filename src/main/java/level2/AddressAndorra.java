package level2;

public class AddressAndorra implements Address {

    @Override
    public String generateAddress(String street, int number, String city, String postcode) {
        return number + " " + street + ", " + postcode + " " + city;
    }
}
