package DateTime;

public enum DayOfTheWeek {
    MONDAY("monday",1),
    TUESDAY("tuesday",2),
    WEDNESDAY("wednesday",3),
    THURSDAY("thursday",4),
    FRIDAY("friday",5),
    SATURDAY("saturday",6),
    SUNDAY("sunday", 7);

    private int dayNumber;
    private String dayName;

    DayOfTheWeek(String dayName,int dayNumber){
        this.dayName = dayName;
        this.dayNumber = dayNumber;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public String getDayName() {
        return dayName;
    }

    @Override
    public String toString() {
        return "DayOfTheWeek{" +
                "dayNumber=" + dayNumber +
                ", dayName='" + dayName + '\'' +
                '}';
    }
}
