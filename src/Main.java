import java.util.*;

public class Main {
    public static void main(String[] args) {

       /* Scanner scanner = new Scanner(System.in);
        ArrayList<String> groceryList = new ArrayList<>();


        String[] result=new String[10];

        String myInt="10";
        while(!(myInt.equals("0"))){
       myInt = scanner.next();
            if(myInt.equals("1")){
                System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                myInt = scanner.next();
                result= myInt.split(",");
                for(int i=0;i< result.length;i++){
                    if(!groceryList.contains(result[i])){
                        groceryList.add(result[i]);
                    }
                }
                Collections.sort(groceryList);
                System.out.println(groceryList);

            }
            if(myInt.equals("2")){
                System.out.println("Silmek istediğiniz elemanları giriniz.");
                myInt = scanner.next();
                result= myInt.split(",");
                for(int i=0;i< result.length;i++){
                    if(groceryList.contains(result[i])){
                        groceryList.remove(result[i]);
                    }
                }
                Collections.sort(groceryList);
                System.out.println(groceryList);

            }
        }
         scanner.close();
        */
        MobilePhone iphone=new MobilePhone("5357260751");
       Contact c=Contact.createContact("mehmet","5357270852");
        Contact c1=Contact.createContact("mehmet2","5357270853");
        Contact c2=Contact.createContact("mustafa","5357270856");
        Contact c3=Contact.createContact("ayse","5357270857");
        Contact c4=Contact.createContact("ahmet","5357270855");
        iphone.addNewContact(c);

        iphone.addNewContact(c1);
        iphone.addNewContact(c2);
        iphone.addNewContact(c3);
        iphone.addNewContact(c4);


        for(Contact p: iphone.myContacts) {
            System.out.println(p.getName());
        }
        System.out.println(iphone.findContact("mustafa"));
        System.out.println(iphone.updateContact(c,c4));

        for(Contact p: iphone.myContacts) {
            System.out.println(p.getName());
        }






    }
}