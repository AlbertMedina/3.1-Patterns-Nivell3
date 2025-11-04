package level2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ContactsRepository {

    private final List<Contact> contacts;

    public ContactsRepository() {
        contacts = new ArrayList<>();
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public String getContactsList() {
        return contacts.stream().map(Contact::toString).collect(Collectors.joining("\n--------------------------------------\n"));
    }
}
