package CodeWarsTasks;

import java.util.*;
import java.util.stream.Collectors;

//5 kyu
public class Best_travel {

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        int count = 0;
        for(int i = 0;i < ls.size();i++){
            count+=1;
        }
        if (count<k||ls.isEmpty()){
            return null;

        }
        ArrayList<Integer> arrList = new ArrayList<>();
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1.hashCode()<o2.hashCode()){
                    return 1;
                } else if (o1.hashCode()>o2.hashCode()) {
                    return -1;
                }else{
                    return 0;
                }
            }
        };
        count = 0;

        ls = ls.stream().sorted(comparator).toList();
        int sum = 0;
        for(int i = 0;i < ls.size();i++){
            for(int j = 0;j < ls.size()-2;j++){
                for (int k1 = 0;k1 < ls.size();k1++){
                    if(!(ls.get(i).equals(ls.get(j)))&&!(ls.get(i).equals(ls.get(k1)))&&!(ls.get(j).equals(ls.get(k1)))){
                        sum = ls.get(i)+ls.get(j)+ls.get(k1);
                        //System.out.println(ls.get(i)+" "+ls.get(j)+" "+ls.get(k1));
                        arrList.add(sum);
                    }

                }

            }


        }
        Set<Integer>set = arrList.stream().collect(Collectors.toSet());
        ls = set.stream().sorted(comparator).toList();


        for(int i = 0;i < ls.size();i++){
            if(ls.get(i)<=t){
                sum = ls.get(i);
                return sum;
            }
        }




        return null;

    }

    public static void main(String[] args) {

        List<Integer> ty = new ArrayList<>();
        ty.add(91);
        ty.add(74);
        ty.add(73);
        ty.add(85);
        ty.add(73);
        ty.add(81);
        ty.add(87);

        System.out.println(chooseBestSum(230,3,ty));
    }
}
