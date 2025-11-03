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

        AddressFactory addressFactory = new AddressFactory();

        Address spainAddress = addressFactory.adress("SpAin");
        System.out.println(spainAddress.generateAddress("Carrer de Girona", 100, "Barcelona", "08009"));

        Address andorraAddress = addressFactory.adress("  andorra  ");
        System.out.println(andorraAddress.generateAddress("Avinguda Meritxell", 50, "Andorra La Vella", "AD500"));

        Address portugalAddress = addressFactory.adress("Portugal  ");
        System.out.println(portugalAddress.generateAddress("Rua da Madeira", 200, "Oporto", "4000-069"));
    }
}
