package level2;

public class Contact {

    private final String name;
    private final String address;
    private final String phoneNumber;

    public Contact(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nPhone number: " + phoneNumber;
    }
}
