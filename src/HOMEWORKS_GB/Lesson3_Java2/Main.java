package HOMEWORKS_GB.Lesson3_Java2;

public class Main {
    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add("Petrov", "897777777777");
        myPhoneBook.add("Volkov", "897779561277");
        myPhoneBook.add("Ivanov", "897777787777");
        myPhoneBook.add("Eliseev", "897777657777");
        myPhoneBook.add("Loginov", "897777772277");
        myPhoneBook.add("Ivanov", "897667777117");
        myPhoneBook.add("Babikov", "894577777677");
        myPhoneBook.add("Latypov", "897648415777");
        System.out.println(myPhoneBook);
        System.out.println();
        find ("Ivanov", myPhoneBook);
        find ("Petrov", myPhoneBook);
        find ("Volkov", myPhoneBook);
    }


    public static void find(String name, PhoneBook phoneBook){
        System.out.println(name + "'s number(s): " + phoneBook.get(name));
    }
}
