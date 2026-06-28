package Contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContactTest {

	 @DisplayName("Test a valid Constructor")
	    @Test
	    public void testGoodConstructor() {
	        String contactId = "1";
	        String firstName = "John";
	        String lastName = "Smith";
	        String phone = "1234567891";
	        String address = "100 Java Lane";
	        
	        Contact testContact = new Contact(contactId, firstName, lastName, phone, address);
	        
	        assertEquals(contactId, testContact.getContactId());
	        assertEquals(firstName, testContact.getFirstName());
	        assertEquals(lastName, testContact.getLastName());
	        assertEquals(phone, testContact.getPhone());
	        assertEquals(address, testContact.getAddress());
	    }
	    
	    @DisplayName("Test an invalid Constructor")
	    @Test
	    public void testBadConstructor() {
	        String badID = null;
	        
	        String firstName = "John";
	        String lastName = "Smith";
	        String address = "100 Java Lane";       
	        
	        // Bad ID
	        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
	            new Contact(badID, firstName, lastName, "1234567890", address);
	        });
	        
	        assertEquals("Invalid contact ID", exception.getMessage());
	        
	        // Bad phone number
	        exception = assertThrows(IllegalArgumentException.class, () -> {
	            new Contact("0", firstName, lastName, "1", address);
	        });
	        
	        assertEquals("Invalid phone number", exception.getMessage());
	    }
	    
	   
	    @DisplayName("Test a valid setFirstName")
	    @Test
	    public void testGoodSetFirstName() {
	        String contactId = "3";
	        String firstName = "John";
	        String lastName = "Smith";
	        String phone = "1234567891";
	        String address = "100 Java Lane";
	        
	        Contact testContact = new Contact(contactId, firstName, lastName, phone, address);   
	        testContact.setFirstName("Test");        
	        assertEquals("Test", testContact.getFirstName());
	    }
	  
	    @DisplayName("Test an invalid null setFirstName")
	    @Test
	    public void testBadSetFirstName() {
	        String contactId = "3";
	        String firstName = "John";
	        String lastName = "Smith";
	        String phone = "1234567891";
	        String address = "100 Java Lane";
	        
	        Contact testContact = new Contact(contactId, firstName, lastName, phone, address);   
	        
	        Assertions.assertThrows(IllegalArgumentException.class, () -> {
	            testContact.setFirstName(null);
	        });
	    }
	    
	    
	    @DisplayName("Test an invalid length setFirstName")
	    @Test
	    public void testLongSetFirstName() {
	        String contactId = "3";
	        String firstName = "John";
	        String lastName = "Smith";
	        String phone = "1234567891";
	        String address = "100 Java Lane";
	        
	        Contact testContact = new Contact(contactId, firstName, lastName, phone, address);   
	        
	        Assertions.assertThrows(IllegalArgumentException.class, () -> {
	            testContact.setFirstName("IamWayTooLongOfAFirstName");
	        });
	    }

	  
	    @DisplayName("Test getID")
	    @Test
	    public void testGetID() {
	        String contactId = "3";
	        String firstName = "John";
	        String lastName = "Smith";
	        String phone = "1234567891";
	        String address = "100 Java Lane";
	        
	        Contact testContact = new Contact(contactId, firstName, lastName, phone, address);   
	        assertEquals("3", testContact.getContactId());  // Corrected to return String
	    }

	    
	    @DisplayName("Test an invalid null setLastName")
	    @Test
	    public void testBadSetLastName() {
	        String contactId = "3";
	        String firstName = "John";
	        String lastName = "Smith";
	        String phone = "1234567891";
	        String address = "100 Java Lane";
	        
	        Contact testContact = new Contact(contactId, firstName, lastName, phone, address);   
	        
	        Assertions.assertThrows(IllegalArgumentException.class, () -> {
	            testContact.setLastName(null);
	        });
	    }

	   
	    @DisplayName("Test an invalid length setLastName")
	    @Test
	    public void testLongSetLastName() {
	        String contactId = "3";
	        String firstName = "John";
	        String lastName = "Smith";
	        String phone = "1234567891";
	        String address = "100 Java Lane";
	        
	        Contact testContact = new Contact(contactId, firstName, lastName, phone, address);   
	        
	        Assertions.assertThrows(IllegalArgumentException.class, () -> {
	            testContact.setLastName("IamWayTooLongOfALastName");
	        });
	    }

	    
	    @DisplayName("Test a valid setLastName")
	    @Test
	    public void testGoodSetLastName() {
	        String contactId = "3";
	        String firstName = "John";
	        String lastName = "Smith";
	        String phone = "1234567891";
	        String address = "100 Java Lane";
	        
	        Contact testContact = new Contact(contactId, firstName, lastName, phone, address);   
	        testContact.setLastName("Test");        
	        assertEquals("Test", testContact.getLastName());
	    }

	    
	    @DisplayName("Test an invalid null setphone")
	    @Test
	    public void testBadSetphone() {
	        String contactId = "3";
	        String firstName = "John";
	        String lastName = "Smith";
	        String phone = "1234567891";
	        String address = "100 Java Lane";
	        
	        Contact testContact = new Contact(contactId, firstName, lastName, phone, address);   
	        
	        Assertions.assertThrows(IllegalArgumentException.class, () -> {
	            testContact.setPhone(null);
	        });
	    }

	    
	    @DisplayName("Test an invalid length setphone")
	    @Test
	    public void testWrongLengthphone() {
	        String contactId = "3";
	        String firstName = "John";
	        String lastName = "Smith";
	        String phone = "1234567891";
	        String address = "100 Java Lane";
	        
	        Contact testContact = new Contact(contactId, firstName, lastName, phone, address);   
	        
	        Assertions.assertThrows(IllegalArgumentException.class, () -> {
	            testContact.setPhone("1");
	        });
	        Assertions.assertThrows(IllegalArgumentException.class, () -> {
	            testContact.setPhone("123456789101112131415");
	        });
	    }

	   
	    @DisplayName("Test a valid length setphone")
	    @Test
	    public void testGoodphone() {
	        String contactId = "3";
	        String firstName = "John";
	        String lastName = "Smith";
	        String phone = "1234567891";
	        String address = "100 Java Lane";
	        
	        Contact testContact = new Contact(contactId, firstName, lastName, phone, address);   

	        testContact.setPhone("1987654321");        
	        assertEquals("1987654321", testContact.getPhone());
	    }

	  
	    @DisplayName("Test an invalid null setAddress")
	    @Test
	    public void testNullSetAddress() {
	        String contactId = "3";
	        String firstName = "John";
	        String lastName = "Smith";
	        String phone = "1234567891";
	        String address = "100 Java Lane";
	        
	        Contact testContact = new Contact(contactId, firstName, lastName, phone, address);   
	        
	        Assertions.assertThrows(IllegalArgumentException.class, () -> {
	            testContact.setAddress(null);
	        });
	    }

	   
	    @DisplayName("Test an invalid length setAddress")
	    @Test
	    public void testWrongLengthAddress() {
	        String contactId = "3";
	        String firstName = "John";
	        String lastName = "Smith";
	        String phone = "1234567891";
	        String address = "100 Java Lane";
	        
	        Contact testContact = new Contact(contactId, firstName, lastName, phone, address);   
	        
	        Assertions.assertThrows(IllegalArgumentException.class, () -> {
	            testContact.setAddress("123456789 Address Waaaaaaaaaay Toooooo Long Street");
	        });
	    }

	    
	    @DisplayName("Test a valid length setAddress")
	    @Test
	    public void testGoodAddress() {
	        String contactId = "3";
	        String firstName = "John";
	        String lastName = "Smith";
	        String phone = "1234567891";
	        String address = "100 Java Lane";
	        
	        Contact testContact = new Contact(contactId, firstName, lastName, phone, address);   

	        testContact.setAddress("987 Good Address");        
	        assertEquals("987 Good Address", testContact.getAddress());
	    }
	}
