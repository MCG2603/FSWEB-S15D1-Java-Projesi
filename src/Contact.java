public class Contact {
    public String getName() {
        return name;
    }

    public String name;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public static Contact createContact(String name, String phoneNumber){
        Contact kisi=new Contact(name, phoneNumber);
        return kisi;
    }
}
