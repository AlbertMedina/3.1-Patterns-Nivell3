package level2;

public class PhoneNumberFactory {

    public PhoneNumber phoneNumber(String country) {
        return switch (country.trim().toLowerCase()) {
            case "spain" -> new PhoneNumberSpain();
            case "andorra" -> new PhoneNumberAndorra();
            case "portugal" -> new PhoneNumberPortugal();
            default -> throw new IllegalArgumentException("Invalid country (" + country + ")");
        };
    }
}
