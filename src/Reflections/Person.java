package Reflections;

public class Person implements Indentifiable{

    private String name;
    private Integer age;
    public Integer number;



    @Override
    public String getUniqData(){
        return String.format("%s with age %s", name,age);
    }

    public Integer getAge() {
        return age;
    }



    private void print(String name){
        System.out.println(name);
    }
}
