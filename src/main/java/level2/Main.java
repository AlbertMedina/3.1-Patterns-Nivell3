package level2;

public class Main {
    public static void main(String[] args) {

        PhoneNumberFactory phoneNumberFactory = new PhoneNumberFactory();

        PhoneNumber spainPhoneNumber = phoneNumberFactory.phoneNumber("Spain");
        System.out.println(spainPhoneNumber.generatePhoneNumber("666666666"));

        PhoneNumber andorraPhoneNumber = phoneNumberFactory.phoneNumber("ANDORRA");
        System.out.println(andorraPhoneNumber.generatePhoneNumber("666666666"));

        PhoneNumber portugalPhoneNumber = phoneNumberFactory.phoneNumber("portugal");
        System.out.println(portugalPhoneNumber.generatePhoneNumber("666666666"));
    }
}
