package Comparators;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {



    public static void main(String[] args) {
        Person p1 = new Person(33,"Jack",true);
        Person p2 = new Person(23,"Billie",false);
        Person p3 = new Person(32,"John",true);
        ArrayList<Person> arr = new ArrayList<>();
        arr.add(p1);
        arr.add(p2);
        arr.add(p3);
        Comparator<Person> comp = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge()==o2.getAge()) {
                    return o1.getName().compareTo(o2.getName());
                }else if(o1.getAge()>o2.getAge()){
                    return 1;

                }else{
                    return -1;
                }

            }

        };

        System.out.println(arr);

        arr.sort(comp);

        System.out.println(arr);


    }
}


