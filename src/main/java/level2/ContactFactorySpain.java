package level2;

public class ContactFactorySpain implements ContactFactory {

    @Override
    public PhoneNumber getPhoneNumber() {
        return new PhoneNumberSpain();
    }

    @Override
    public Address getAddress() {
        return new AddressSpain();
    }
}
