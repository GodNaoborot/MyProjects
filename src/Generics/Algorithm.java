package Generics;

import java.util.List;

public final class Algorithm {

    public static <T> int countPrimes(List<Integer> q, UnaryPredicate<Integer> p){
        int counter = 0;

        for(Integer elem:
                q){
            if(p.test(elem)){
                counter++;
            }
        }
        return counter;
    }






}
