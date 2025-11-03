package level2;

public class Main {
    public static void main(String[] args) {

        String country = "portugal   ";
        ContactFactory contactFactory = switch (country.trim().toLowerCase()) {
            case "spain" -> new ContactFactorySpain();
            case "andorra" -> new ContactFactoryAndorra();
            case "portugal" -> new ContactFactoryPortugal();
            default -> throw new IllegalArgumentException("Invalid country");
        };

        String name = "Albert";
        String address = contactFactory.getAddress().generateAddress("Street A", 100, "Barcelona", "08009");
        String phoneNumber = contactFactory.getPhoneNumber().generatePhoneNumber("666666666");
        Contact contact = new Contact(name, address, phoneNumber);

        System.out.println(contact);
    }
}
