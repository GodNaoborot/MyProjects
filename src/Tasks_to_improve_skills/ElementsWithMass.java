package Tasks_to_improve_skills;

import java.util.Arrays;

public class ElementsWithMass {

    int[] arrays;
    int[] arrays2;

    int sum = 0;


    ElementsWithMass(int[] arrays,int[] arrays2){
        this.arrays = arrays;
        this.arrays2 = arrays2;
    }


    int sumOfElements(){
        for(int i = 0;i < arrays2.length;i++){
            sum += arrays2[i];
        }
        return sum;
    }

    void decision(){
        int count = 0;

        int[] newArray = new int[sumOfElements()];
        for(int i = 0;i < arrays2.length;i++){
            for(int j = 0;j<arrays2[i];j++){
                newArray[count] = arrays[i];
                count++;
            }
        }
        for (int qs:
             newArray) {
            System.out.print(qs+" ");
        }

    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {1,2,10};
        ElementsWithMass el1 = new ElementsWithMass(a,b);

        el1.decision();

    }




}
