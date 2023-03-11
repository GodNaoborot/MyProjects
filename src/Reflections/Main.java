package Reflections;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException {
        Person o1 = new Person();
        Class<? extends Person> c = o1.getClass();
        String s = c.getName();
        System.out.println(s);
        System.out.println();

        Class[] interfaces = c.getInterfaces();
        for(Class myInterface:
        interfaces){
            System.out.println(myInterface.getName());
        }
        System.out.println();

        Field[] fields = c.getDeclaredFields();
        for(Field field:
        fields){
            System.out.println(field.getName());
        }
        System.out.println();

        Method[] methods = c.getDeclaredMethods();
        for(Method method:
        methods){
            System.out.println(method.getName());
        }
        System.out.println();

        Field field = o1.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(o1,"New name");

        System.out.println(field.get(o1));

        Method method = c.getDeclaredMethod("print", String.class);
        method.setAccessible(true);
        System.out.println(method.getName());

        String e = o1.getClass().getSimpleName();

        System.out.println(e);




    }
}



