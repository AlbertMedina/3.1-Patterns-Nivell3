package level2;

public class ContactFactoryAndorra implements ContactFactory {

    @Override
    public PhoneNumber getPhoneNumber() {
        return new PhoneNumberAndorra();
    }

    @Override
    public Address getAddress() {
        return new AddressAndorra();
    }
}
