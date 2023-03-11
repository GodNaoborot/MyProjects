package Lambda_And_Optional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {



    public static void main(String[] args) {
      Trial v1 = new Trial("Math",3,4);
      Trial v2 = new ExtraTrial("Russian",4,5,5);
      Trial v3 = new LightTrial("English",4,4);
      Trial v4 = new Trial("Physics",3,3);
      Trial v5 = new StrongTrial("PE",5,4);
      Trial v6 = new Trial("Biology",5,5);
      Trial v7 = new LightTrial("Informatics",4,5);
      Trial v8 = new ExtraTrial("Chemistry",2,3,3);
      Trial v9 = new StrongTrial("Astronomy",4,3);
      Support s = new Support();

      ArrayList<Trial> arr = new ArrayList<>(v1.addToList(v1,v2,v3,v4,v5,v6,v7,v8,v9));
        //task2
      arr.stream().forEach(x-> System.out.println(s.print(x)));

        System.out.println();

      Comparator<Trial> comp = new Comparator<Trial>() {
          @Override
          public int compare(Trial o1,Trial o2) {
              if(o1.getMark1()+o1.getMark2()>o2.getMark1()+o2.getMark2()){
                  return 1;
              }else{
                  return -1;
              }
          }
      };
        //task3
      arr.stream().filter(Trial::isExamPassed).forEach(x-> System.out.println(x.getName1()));
        System.out.println();
        //task4
      arr.stream().sorted(comp).forEach(x-> System.out.println(s.print(x)));
        System.out.println();
        //task5
      arr.stream().forEach(x-> System.out.println(x.getMark1()+x.getMark2()));
        System.out.println();

        //task6
      arr.stream();



    }
}
