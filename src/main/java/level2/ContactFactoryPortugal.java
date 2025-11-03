package level2;

public class ContactFactoryPortugal implements ContactFactory {

    @Override
    public PhoneNumber getPhoneNumber() {
        return new PhoneNumberPortugal();
    }

    @Override
    public Address getAddress() {
        return new AddressPortugal();
    }
}
