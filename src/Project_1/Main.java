package Project_1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Trip t1 = new Trip(1000,"Qw1",100,10);
        Trip t2 = new Trip(1100,"Qw2",100,10);
        Trip t3 = new Trip(1200,"Qw3",100,10);
        Trip t4 = new Trip(1300,"Qw4",100,10);
        Trip t5 = new Trip();

        Containers cont1 = new Containers(5,2,2,4000);
        Cisterns cist1 = new Cisterns(4,2,4200);
        People p1 = new People(70);
        People p2 = new People(60);


        GetMass[] arr3 = new GetMass[]{cont1,cist1,p1,p2};


        for(GetMass objects:
                arr3){
            System.out.println(objects);
        }

        int containersAmount = 0;
        int peopleAmount = 0;
        int cisternAmount = 0;


        for (GetMass objects:
        arr3){
            if (objects.getClass().toString().equals("class Project_1.Cisterns")){
                cisternAmount++;
            }else if(objects.getClass().toString().equals("class Project_1.Containers")){
                containersAmount++;
            }else{
                peopleAmount++;

            }
        }

        People[] peopleArr = new People[peopleAmount];
        Containers[] containersArr = new Containers[containersAmount];
        Cisterns[] cisternsArr = new Cisterns[cisternAmount];
        ArrayList<GetMass> arrP = new ArrayList<>();
        ArrayList<GetMass> arrCont = new ArrayList<>();
        ArrayList<GetMass> arrCisterns = new ArrayList<>();
        ArrayList<GetMass> sortedArr = new ArrayList<>();




        for(int i = 0;i < arr3.length;i++){
            if (arr3[i].getClass().toString().equals("class Project_1.People")){
                arrP.add( arr3[i]);
            }else if(arr3[i].getClass().toString().equals("class Project_1.Containers")){
                arrCont.add( arr3[i]);
            }else{
                arrCisterns.add( arr3[i]);
            }
        }
        sortedArr.addAll(arrP);
        sortedArr.addAll(arrCont);
        sortedArr.addAll(arrCisterns);
        int[] CargoMasses = new int[sortedArr.size()];
        for(int i = 0;i < sortedArr.size();i++){
            CargoMasses[i] = (sortedArr.get(i).getMass());
        }
        sortedArr.toArray();
        Ferryboat f1 = new Ferryboat(1000000,CargoMasses);


        System.out.println(sortedArr);
        System.out.println(f1.isLiftIt(f1.getLiftingÑapacity(),f1.getArr()));



        for(GetMass objects:
        sortedArr){
            System.out.println(objects);

        }




        /*Trip[] arr = new Trip[]{t1,t2,t3,null,t4,t5};

        System.out.println(arr[4]);

        t4.setTransport_cost(90);
        System.out.println(arr[4]);

        System.out.println();

        System.out.println(t1.getAmountOfDays()+t3.getAmountOfDays());

        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }

        Material m1 = new Material("Steel",7800);
        Material m2 = new Material("Cuprum",8500);
        Subject s1 = new Subject("Wire",m1,0.03);

        System.out.println(s1);
        System.out.println("The wire mass is "+s1.getMass());

        s1.setMaterial(m2);

        System.out.println(s1);
        System.out.println("The wire mass is "+s1.getMass());

        System.out.println();

        System.out.println(cont1.getMass());
        System.out.println(cist1.getMass());*/
    }
}
