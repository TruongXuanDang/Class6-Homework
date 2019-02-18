import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {
    public ArrayList<PhoneNumber> PhoneList = new ArrayList<>();
    public int count = 0;

    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNumber phonenum:PhoneList) {
            if(name.equals(phonenum.name)){
                if(!phone.equals(phonenum.phone)){
                    phonenum.phone+=(":"+phone);
                    System.out.println("other phoneno");

                }
                count++;
            }

        }

        if (count==0){
            PhoneNumber phoneNumber1=new PhoneNumber(name,phone);
            PhoneList.add(phoneNumber1);
            System.out.println("add other phoneno");
        }

    }

    @Override
    public void removePhone(String name) {
        for (PhoneNumber phonenum:PhoneList
             ) {
            if (phonenum.name.equals(name)){
                PhoneList.remove(phonenum);
                System.out.println("remove a phoneno");
            }
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for (PhoneNumber phonenum:PhoneList
             ) {
            if(phonenum.name.equals(name)){
                phonenum.phone=newphone;
                count++;
            }

        }
        if(count==0){
            System.out.println("Name do not exist");
        }
    }

    @Override
    public void searchPhone(String name) {
        for (PhoneNumber phonenum:PhoneList){
            if(phonenum.name.equals(name)){
                System.out.println("Search result: ");
                System.out.print("Name: ");
                System.out.print(phonenum.name);
                System.out.print("   Phone: ");
                System.out.println(phonenum.phone);
            }
        }
    }

    @Override
    public void sort() {
       Collections.sort(PhoneList, new Comparator<PhoneNumber>() {
           @Override
           public int compare(PhoneNumber o1, PhoneNumber o2) {
               return o1.getName().compareTo(o2.getName());
           }
       });
    };

    public void Print(){
        System.out.println("List of PhoneNumbers");
        for(PhoneNumber phonenum:PhoneList){
            System.out.print("Name: ");
            System.out.print(phonenum.name);
            System.out.print("   Phone: ");
            System.out.println(phonenum.phone);
        }
    }

}


