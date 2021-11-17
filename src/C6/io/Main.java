package C6.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
    public static void storeContactToFile(String fileName,Contact contact){
        BufferedWriter bufferedWriter;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            bufferedWriter.write(contact.toString());
            if(bufferedWriter!=null) bufferedWriter.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("./src/C6/io/contacts.txt");
        //System.out.println(phoneBook);
        System.out.println(phoneBook.findContact("Abbey"));
        storeContactToFile("./src/C6/io/foundContacts.txt", phoneBook.findContact("Abbey"));
    }
}
