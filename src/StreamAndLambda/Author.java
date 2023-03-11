package StreamAndLambda;

import java.util.ArrayList;

public class Author {

    String name;
    int age;

    public Author(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public ArrayList<Author> addAuthors(Author...q){
        ArrayList<Author> arr = new ArrayList<>();

        for(int i = 0;i<q.length;i++){
            arr.add(q[i]);
        }

        return arr;
    }

    public ArrayList<Integer> getArrAuthorsAges(ArrayList<Author> q){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i < q.size();i++){
            arr.add(q.get(i).getAge());
        }

        return arr;
    }


}
