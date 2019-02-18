import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void Menu() {
        System.out.println("1. Insert Phone");
        System.out.println("2. Remove Phone");
        System.out.println("3. Update Phone");
        System.out.println("4. Search Phone");
        System.out.println("5. Sort");
        System.out.println("6. Show");
        System.out.println("7. Exit");
        System.out.println("Please choose a number");
    }
    public static void main(String[] args) {
        System.out.println("PHONEBOOK MANAGEMENT SYSTEM");
        Scanner scanner=new Scanner(System.in);
        PhoneBook phoneBook=new PhoneBook();
        PhoneNumber phoneNumber1 = new PhoneNumber("abc","123");
        PhoneNumber phoneNumber2 = new PhoneNumber("cde","234");
        phoneBook.PhoneList.add(phoneNumber1);
        phoneBook.PhoneList.add(phoneNumber2);

        do {
            Menu();
            int n = scanner.nextInt();
            switch (n){
                case 1:
                    scanner.nextLine();
                    System.out.println("Insert name: ");
                    String name = scanner.nextLine();
                    System.out.println("Insert phone: ");
                    String phone = scanner.nextLine();
                    phoneBook.insertPhone(name,phone);
                    phoneBook.Print();
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Remove name: ");
                    String name1 = scanner.nextLine();
                    phoneBook.removePhone(name1);
                    phoneBook.Print();
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Update name: ");
                    String name2 = scanner.nextLine();
                    System.out.println("Update phone: ");
                    String phone2 = scanner.nextLine();
                    phoneBook.updatePhone(name2,phone2);
                    phoneBook.Print();
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Search name: ");
                    String name3= scanner.nextLine();
                    phoneBook.searchPhone(name3);
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("Sort result: ");
                    phoneBook.sort();
                    phoneBook.Print();
                    break;
                case 6:
                    phoneBook.Print();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please choose from 1 to 7");
                    break;
            }
        } while (true);

    }
}
