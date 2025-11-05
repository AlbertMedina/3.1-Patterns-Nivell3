package level2;

import level2.service.ContactsRepository;
import level2.service.ContactsService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AbstractFactoryTest {

    @Test
    void shouldAddContact() {
        ContactsRepository contactsRepository = new ContactsRepository();
        ContactsService contactsService = new ContactsService(contactsRepository);
        contactsService.addContact("test-name", "spain", "test-street", 1, "test-city", "test-postcode", "612345789");
        assertEquals(1, contactsRepository.getContacts().size());
    }

    @Test
    void shouldAddAndorraContactWithProperFormat() {
        ContactsRepository contactsRepository = new ContactsRepository();
        ContactsService contactsService = new ContactsService(contactsRepository);
        contactsService.addContact("test-name", "andorra", "test-street", 1, "test-city", "test-postcode", "612345789");
        assertEquals("test-name", contactsRepository.getContacts().getFirst().getName());
        assertEquals("1 test-street, test-postcode test-city, Andorra", contactsRepository.getContacts().getFirst().getAddress());
        assertEquals("+376 612345789", contactsRepository.getContacts().getFirst().getPhoneNumber());
    }

    @Test
    void shouldAddPortugalContactWithProperFormat() {
        ContactsRepository contactsRepository = new ContactsRepository();
        ContactsService contactsService = new ContactsService(contactsRepository);
        contactsService.addContact("test-name", "portugal", "test-street", 1, "test-city", "test-postcode", "612345789");
        assertEquals("test-name", contactsRepository.getContacts().getFirst().getName());
        assertEquals("test-street 1, test-city (test-postcode), Portugal", contactsRepository.getContacts().getFirst().getAddress());
        assertEquals("+351 612345789", contactsRepository.getContacts().getFirst().getPhoneNumber());
    }

    @Test
    void shouldAddSpainContactWithProperFormat() {
        ContactsRepository contactsRepository = new ContactsRepository();
        ContactsService contactsService = new ContactsService(contactsRepository);
        contactsService.addContact("test-name", "spain", "test-street", 1, "test-city", "test-postcode", "612345789");
        assertEquals("test-name", contactsRepository.getContacts().getFirst().getName());
        assertEquals("test-street, 1, test-postcode test-city, Spain", contactsRepository.getContacts().getFirst().getAddress());
        assertEquals("+34 612345789", contactsRepository.getContacts().getFirst().getPhoneNumber());
    }

    @Test
    void shouldNotAddContactWithUnknownCountry() {
        ContactsRepository contactsRepository = new ContactsRepository();
        ContactsService contactsService = new ContactsService(contactsRepository);
        contactsService.addContact("test-name", "france", "test-street", 1, "test-city", "test-postcode", "612345789");
        assertEquals(0, contactsRepository.getContacts().size());
    }
}
