package InterfacesAndAbstractClasses;

import java.util.Arrays;

public class Main {


    public static OfficeSupportEntity[] officesCompare(OfficeSupportEntity[] workers, Office office){
        int count = 0;
        for (OfficeSupportEntity worker : workers) {
            System.out.println(worker.getOffice());
            System.out.println(office);
            if (worker.getOffice().equals(office)) {
                count++;
            }
        }
        OfficeSupportEntity[] resultList = new OfficeSupportEntity[count];
        int index = 0;
        for (OfficeSupportEntity worker : workers) {
            if (worker.getOffice().equals(office)) {
                resultList[index] = worker;

                index++;
            }

        }
        return resultList;

    }

    public static void computers(ComputerSupportable[] computers){

        for (ComputerSupportable computer1:
        computers){
            System.out.println(computer1.getComputer().toString());
        }

    }





    public static void main(String[] args) {

        Employee c1 = new Employee(12345678,"Oleg",new Office(34532,"Office_¹2"));

        SecurityGuard e1 = new SecurityGuard(12345678,"Andrey",new Office(23131431,"Office_¹3"));

        SecurityGuard e2 = new SecurityGuard(1314413,"John",new Office(34532,"Office_¹2"));


        System.out.println(e1.equalTo(c1));


        OfficeSupportEntity[] people1 = {c1, e1, e2};

        System.out.println(Arrays.toString(officesCompare(people1, new Office(34532, "Office_¹2"))));


        Employee n1 = new Employee(1213,"n1",new Computer(12345,"m1"));

        Employee n2 = new Employee(1214,"n2",new Computer(12345,"m2"));

        Employee n3 = new Employee(1215,"n3",new Computer(12345,"m3"));

        Employee n4 = new Employee(1216,"n4",new Computer(12345,"m4"));

        Employee n5 = new Employee(1217,"n5",new Computer(12345,"m5"));

        Employee n6 = new Employee(1218,"n6",new Computer(12345,"m6"));

        Employee n7 = new Employee(1219,"n7",new Computer(12345,"m7"));

        ComputerSupportable[] people2 = {n1,n2,n3,n4,n5,n6,n7};

        computers(people2);







    }
}
