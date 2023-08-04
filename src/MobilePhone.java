import java.util.ArrayList;

public class MobilePhone {
    public ArrayList<Contact> myContacts= new ArrayList<>() ;
    String mynumber;


    public MobilePhone(String mynumber) {
        this.mynumber = mynumber;
    }

    public boolean addNewContact(Contact c){
        if(myContacts==null){
            myContacts.add(c);
        }
        if(!myContacts.contains(c)){
            myContacts.add(c);
            return true;

        }
        else{
            return false;
        }
    }
    public boolean updateContact (Contact c,Contact c1){
        int d;
        if(myContacts.contains(c)){
            d=myContacts.indexOf(c);
            myContacts.add(d, c1);
            return true;

        }
        else{
            return false;
        }
    }
    public boolean removeContact  (Contact c){
        if(myContacts.contains(c)){
            myContacts.remove(c);
            return true;

        }
        else{
            return false;
        }
    }
    public int findContact (Contact c){
        int d;
        if(myContacts.contains(c)){
            d=myContacts.indexOf(c);

            return d;

        }
        else{
            return -1;
        }
    }
    public Contact findContact (String c) {
        int d;


        Contact[] s4 = myContacts.stream().filter(e -> e.name == c).toArray(Contact[]::new);
        try {
            if (!s4[0].equals(null)) {

                return s4[0];
            }
        } catch (Exception e) {

            return null;
        }
        return null;
    }
}
