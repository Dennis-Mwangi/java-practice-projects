public class Contactbook {
	public static void main(String[] args) {
		String[] contacts = { "Alice - 1234567890", "Bob - 0987654321", "Charlie - 5555555555" };
		// expand array to add a new contact
		String[] newArray = new String[contacts.length + 3];
		System.arraycopy(contacts, 0, newArray, 0, contacts.length);
		newArray[newArray.length - 1] = "David - 1111111111";
		newArray[newArray.length - 2] = "Eve - 2222222222"; //modifying second last contact
		newArray[newArray.length - 3] = "Frank - 3333333333"; //modifying third last contact
		contacts = newArray;
		printContacts(contacts);
	}

	public static void printContacts(String[] contacts) {
		System.out.println("Contact Book:");
		for (String contact : contacts) {
			System.out.println(contact);
		}
	}
}