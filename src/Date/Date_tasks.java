package Date;
import java.time.*;

public class Date_tasks {

    public static void getMonthLength(int q){

        for (int i = 1;i <= 12;i++){
            LocalDate date = LocalDate.of(q,i,1);
            System.out.println(date.lengthOfMonth());
        }

    }

    public static boolean isFridayThe13Th(LocalDate q){
        if(q.getDayOfMonth()==13 & q.getDayOfWeek()==DayOfWeek.FRIDAY){
            return true;
        }else{
            return false;
        }
    }

    public static void getAge(LocalDate q){
        LocalDate BornDate = LocalDate.of(2006,9,27);
        LocalDate age = q.minusYears(BornDate.getYear()).minusMonths(BornDate.getMonthValue()).minusDays(BornDate.getDayOfMonth());
        if (age.getYear()>0){
            System.out.println(age);
        }else{
            System.out.println("Я ещё не родился");
        }

    }


    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        getMonthLength(2001);
        LocalDate Friday_the13th = LocalDate.of(2023,1,13);
        System.out.println(isFridayThe13Th(Friday_the13th));
        getAge(Friday_the13th);
        Runnable r = ()-> System.out.println(42);
        System.out.println(r);
    }
}
