package Contact;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {

    private ContactService service;

    @BeforeEach
    public void setUp() {
        service = new ContactService();
    }

    @Test
    public void testAddContactSuccess() {
        Contact contact = new Contact("ID00000", "Kimmy", "Bond", "0987654321", "21 Jump St");
        service.addContact(contact);
        assertNotNull(service);
    }

    @Test
    public void testAddContactFailure() {
        Contact contact1 = new Contact("ID00000", "Kimmy", "Bond", "0987654321", "21 Jump St");
        service.addContact(contact1);
        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(contact1); // Attempting to add the same contact again
        });
    }

    @Test
    public void testDeleteContact() {
        Contact contact = new Contact("IDToDelete", "Jason", "Williams", "6767676767", "1 West Ave");
        service.addContact(contact);
        service.deleteContact("IDToDelete");
        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteContact("IDToDelete");
        });
    }

    @Test
    public void testUpdateContactSuccess() {
        Contact contact = new Contact("IDToUpdate", "FixIt", "Felix", "1029386745", "10101 Palm St");
        service.addContact(contact);
        service.updateContact("IDToUpdate", "Michael", null, null, "102 Oak St");
        assertEquals("Michael", contact.getFirstName());
        assertEquals("102 Oak St", contact.getAddress());
    }

}

