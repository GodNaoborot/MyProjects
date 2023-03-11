package Generics;

import java.util.*;

public class Task1 {



    public static void main(String[] args) {
        QW<Integer> el1 = new QW<>(1);
        QW<Integer> el2 = new QW<>(12);
        QW<Integer> el3 = new QW<>(13);
        QW<Integer> el4 = new QW<>(12131);
        QW<Integer> el5 = new QW<>(143);


        List<QW<Integer>> arr = new ArrayList<>();
        arr.add(el1);
        arr.add(el2);
        arr.add(el3);
        arr.add(el4);
        arr.add(el5);


        List<Integer> ci = Arrays.asList(1, 2, 3, 4, 8);
        int count = Algorithm.countPrimes(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);
    }


}

class QW<T>{

    private T number;

    QW(T number){
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }
}
