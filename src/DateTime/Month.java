package DateTime;

public enum Month {
    JANUARY("january",1),
    FEBRUARY("february",2),
    MARCH("march",3),
    APRIL("april",4),
    MAY("may",5),
    JUNE("june",6),
    JULY("july",7),
    AUGUST("august",8),
    SEPTEMBER("september",9),
    OCTOBER("october",10),
    NOVEMBER("november",11),
    DECEMBER("december",12);

    private int numberOfTheMonth;
    private String monthName;

    Month(String monthName,int numberOfTheMonth){
        this.monthName = monthName;
        this.numberOfTheMonth = numberOfTheMonth;

    }

    public int getNumberOfTheMonth() {
        return numberOfTheMonth;
    }



    @Override
    public String toString() {
        return monthName.toUpperCase() ;
    }
}
