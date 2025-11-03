package level2;

public class PhoneNumberFactory {
    public PhoneNumber phoneNumber(String country) {
        return switch (country.trim().toLowerCase()) {
            case "spain" -> new SpainPhoneNumber();
            case "andorra" -> new AndorraPhoneNumber();
            case "portugal" -> new PortugalPhoneNumber();
            default -> throw new IllegalArgumentException("Invalid country (" + country + ")");
        };
    }
}
