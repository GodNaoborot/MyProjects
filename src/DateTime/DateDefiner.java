package DateTime;

import java.time.LocalDate;

public class DateDefiner {

    private DayOfTheWeek day;

    private Month month;

    private int dayOfMonth;

    private int year;

    DateDefiner(int year,Month month,int dayOfMonth,DayOfTheWeek day){
        this.day = day;
        this.dayOfMonth = dayOfMonth;
        this.month = month;
        this.year = year;
    }
    DateDefiner(){};

    @Override
    public String toString() {
        return String.format("Today is %s, %s %s %s", day.getDayName(), dayOfMonth,month, year);
    }

    private DayOfTheWeek getDayOfWeek(int dayNumber){
        DayOfTheWeek[] days = DayOfTheWeek.values();
        for(DayOfTheWeek day :
        days){
            if (day.getDayNumber() == dayNumber){
                return day;
            }
        }
        return null;
    }

    private Month getMonth(int monthNumber){
        Month[] months = Month.values();
        for(Month month:
        months){
            if (month.getNumberOfTheMonth() == monthNumber){
                return month;
            }
        }
        return null;
    }

    public DateDefiner defineCurrentDate(){
        LocalDate current = LocalDate.now();
        int year = current.getYear();
        int monthNumber = current.getMonthValue();
        int dayOfMonth = current.getDayOfMonth();
        Month month = getMonth(monthNumber);
        int dayNumber = current.getDayOfWeek().getValue();
        DayOfTheWeek day = getDayOfWeek(dayNumber);

        return new DateDefiner(year,month,dayOfMonth,day);
    }
}
