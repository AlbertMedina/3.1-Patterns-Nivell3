package level2;

public class Main {
    public static void main(String[] args) {

        String country = "spain";
        ContactFactory contactFactory = switch (country.trim().toLowerCase()) {
            case "spain" -> new ContactFactorySpain();
            case "andorra" -> new ContactFactoryAndorra();
            case "portugal" -> new ContactFactoryPortugal();
            default -> throw new IllegalArgumentException("Invalid country");
        };

        System.out.println(contactFactory.getPhoneNumber().generatePhoneNumber("666666666"));
        System.out.println(contactFactory.getAddress().generateAddress("Street A", 100, "Barcelona", "08009"));
    }
}
