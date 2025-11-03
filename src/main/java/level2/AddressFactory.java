package level2;

public class AddressFactory {

    public Address adress(String country) {
        return switch (country.trim().toLowerCase()) {
            case "spain" -> new AddressSpain();
            case "andorra" -> new AddressAndorra();
            case "portugal" -> new AddressPortugal();
            default -> throw new IllegalArgumentException("Invalid country (" + country + ")");
        };
    }
}
