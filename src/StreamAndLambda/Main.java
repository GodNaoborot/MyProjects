package StreamAndLambda;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Comparator;




public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Qwe",23);
        Person p2 = new Person("Wer",41);
        Person p3 = new Person("Ert",25);
        Person p4 = new Person("Rty",54);
        Person p5 = new Person("Tyu", 32);


        ArrayList<Person> arr = new ArrayList<>(p1.PersonsToArr(p1,p2,p3,p4,p5));
        System.out.println(arr);

        arr.sort((Person per1,Person per2)->per1.getAge()-per2.getAge());
        for(Person persons:
        arr){
            System.out.println(persons);
        }

        Stream st1 = arr.stream();
        st1.forEach(System.out::println);

        Book b1 = new Book("Harry Potter:Part 1","Jk.Rowling",450);
        Book b2 = new Book("Harry Potter:Part 2","Jk.Rowling",520);

        ArrayList<Book> arrOfBooks = new ArrayList<>(b1.addBooks(b1,b2));

        Author a1 = new Author("George",26);
        Author a2 = new Author("Veronica",37);

        ArrayList<Author> arrOfAuthors = new ArrayList<>(a1.addAuthors(a1,a2));
        boolean st2 =Stream.of(b1,b2).allMatch(x->x.getPagesCount()>=500);

        Comparator<Book> comp = new Comparator<Book>(){
            @Override
            public int compare(Book o1,Book o2){
                if (o1.getPagesCount()>o2.getPagesCount()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };

        Book st3 = Stream.of(b1,b2).min(comp).get();

        Book st4 = Stream.of(b1,b2).max(comp).get();

        HashMap<String,String> mapper = new HashMap<>();
        mapper.put(b1.getTitle(),b2.getAuthor());
        mapper.put(b2.getTitle(),b2.getAuthor());

        Book[] arrB = new Book[]{};


        System.out.println(st2);

        System.out.println(st3.getPagesCount());

        System.out.println(st4.getPagesCount());

        //task5
        arrOfBooks.stream().forEach(x-> System.out.println(x.getAuthor()));

        //task6
        arrOfBooks.stream().distinct().forEach(x-> System.out.println(x));

        System.out.println(b1.equals(b1.getAuthor(),b2.getAuthor()));

        //task7
        arrOfAuthors.stream().filter(x->x.getAge()>35).forEach(x-> System.out.println(x));

        //task8
        ArrayList<Integer> arrOfAges = a1.getArrAuthorsAges(arrOfAuthors);

        int[] arr3 = arrOfAges.stream().mapToInt(i -> i).toArray();



        IntStream intStream = IntStream.of(arr3);

        int sumOfAges = intStream.sum();

        System.out.println(sumOfAges);





    }
}
