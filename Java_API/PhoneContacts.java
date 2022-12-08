public class PhoneContacts {
    Map<String, List<Contact>> groupMap = new HashMap<>();
    List<Contact> contactList = new ArrayList<>();

    public void addGroup(String inputName) {
        if (!groupMap.containsKey(inputName)) {
            groupMap.put(inputName, new ArrayList<>());
        } else {
            System.out.println("Повторяется имя группы, введите заново");
        }
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public void showContact() {
        for (Contact contact : contactList) {
            String s = contact.getName() + " " + contact.getNumber();
            System.out.println(s);
        }
    }

    public void addContactToGroup(Contact contact, String[] strings) {

    }
}