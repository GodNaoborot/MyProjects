package Collections;


public class ArrayList_ {
    int id;
    String name;
    String lastName;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    ArrayList_(int id, String name, String lastName){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public ArrayList_() {
    }

    private static java.util.ArrayList<ArrayList_> girls(ArrayList_... q){
        java.util.ArrayList<ArrayList_> w = new java.util.ArrayList<>();
        for(int i =0;i < q.length;i++){
            w.add(q[i]);
        }
        return w;
    }

    private static java.util.ArrayList<ArrayList_> boys(ArrayList_... q){
        java.util.ArrayList<ArrayList_> w = new java.util.ArrayList<>();
        for(int i =0;i < q.length;i++){
            w.add(q[i]);
        }
        return w;
    }

    private static int studentElement(String q, java.util.ArrayList<ArrayList_> w){
        int sz = w.size();
        java.util.ArrayList<String> names = new java.util.ArrayList<>();
        for (int i = 0;i<sz;i++){
            names.add(w.get(i).name);
        }
        return(names.indexOf(q));
    }

    private static void separateStudents(java.util.ArrayList<ArrayList_> q){
        java.util.ArrayList<ArrayList_> class1 = new java.util.ArrayList<>();
        java.util.ArrayList<ArrayList_> class2 = new java.util.ArrayList<>();
        int sz = q.size();
        for (int i = 0;i < sz/2;i++){
            class1.add(q.get(i));
        }

        for (int i = 5;i < sz;i++){
            class2.add(q.get(i));
        }
        System.out.println(class1);
        System.out.println();
        System.out.println(class2);
    }

    private static boolean isEmpty(java.util.ArrayList<ArrayList_> q){
        if(q.size()>0){
            return false;
        }
        else{
            return true;
        }
    }

    private static java.util.ArrayList<ArrayList_> isSomeoneHero(java.util.ArrayList<ArrayList_> q){
        ArrayList_ st = new ArrayList_();
        int middle = q.size()/2;
        for (int i = 0;i < q.size();i++){
            if (q.get(i).name.equals("Петя") &q.get(i).lastName.equals("Петров")){
                st = q.get(i);
                q.remove(i);
                q.add(middle, st);

                return q;
            }

        }

        st = new ArrayList_(110+middle,"Федя","Максимов");
        q.add(middle,st);
        return q;

    }

    private static ArrayList_ lastStudent(java.util.ArrayList<ArrayList_> q){
        int index = 0;

        for (int i = 0;i<q.size();i++){
            if(q.get(index).name.equals(q.get(i).name)){
                index = i;
            }

        }
        return q.get(index);
    }


    public static void main(String[] args) {
        ArrayList_ st1 = new ArrayList_(111,"Kate","Qw");
        ArrayList_ st2 = new ArrayList_(112,"Петя","Петров");
        ArrayList_ st3 = new ArrayList_(113,"Eugenii","Er");
        ArrayList_ st4 = new ArrayList_(114,"Masha","Rt");
        ArrayList_ st5 = new ArrayList_(115,"Egor","Ty");
        ArrayList_ st6 = new ArrayList_(116,"Dasha","Yu");
        ArrayList_ st7 = new ArrayList_(117,"Danil","Ui");
        ArrayList_ st8 = new ArrayList_(118,"Andrey","Io");
        ArrayList_ st9 = new ArrayList_(119,"Sonya","Op");
        ArrayList_ st10 = new ArrayList_(120,"Pasha","Pa");


        ArrayList_ st11 = new ArrayList_(121,"ft","we");
        ArrayList_ st12 = new ArrayList_(122,"tr","rd");
        ArrayList_ st13 = new ArrayList_(121,"ft","vx");
        ArrayList_ st14 = new ArrayList_(124,"ft","gcv");
        ArrayList_ st15 = new ArrayList_(125,"tr","gb");



        java.util.ArrayList<ArrayList_> arrayLists = new java.util.ArrayList<>(boys(st2,st3));
        arrayLists.addAll(girls(st1,st4));

        java.util.ArrayList<ArrayList_> boysSt = new java.util.ArrayList<>(boys(st2,st3));
        java.util.ArrayList<ArrayList_> girlsSt = new java.util.ArrayList<>(girls(st1,st4));

        java.util.ArrayList<ArrayList_> newArrayLists = new java.util.ArrayList<>(boys(st1,st2,st3,st4,st5,st6,st7,st8,st9,st10));

        java.util.ArrayList<ArrayList_> parallelArrayLists = new java.util.ArrayList<>(boys(st11,st12,st13,st14,st15));







        System.out.println(boys(st2,st3));
        System.out.println(girls(st1,st4));
        System.out.println(arrayLists);

        System.out.println();

        System.out.println(boysSt.size());
        System.out.println(girlsSt.size());

        System.out.println();

        System.out.println(studentElement("Eugenii",boysSt));

        System.out.println();

        System.out.println(newArrayLists);
        separateStudents(newArrayLists);

        System.out.println();
        System.out.println(isSomeoneHero(boys(st1,st2,st3,st4,st5,st6,st7,st8,st9,st10)));

        System.out.println();
        System.out.println(lastStudent(boys(st11,st12,st13,st14,st15)));


        System.out.println();
        ArrayList_ st = newArrayLists.remove(7);
        System.out.println(newArrayLists);

        System.out.println();
        newArrayLists.removeAll(newArrayLists);
        System.out.println(newArrayLists);






    }
}
