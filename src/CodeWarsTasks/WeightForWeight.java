package CodeWarsTasks;

import java.util.*;


public class WeightForWeight {

    public static String orderWeight(String string) {
        if(string.isEmpty()){
            return "";
        }
        String str = string+" ";
        char[] chars = str.toCharArray();
        Long q = 0l;
        List<Long> list = new ArrayList<>();
        List<Long> list2 = new ArrayList<>();
        List<Long> finalList = new ArrayList<>();
        List<Long> finalList2 = new ArrayList<>();

        int res = 0;

        String s = "";


        for(int i = 0;i < chars.length;i++){
            if(chars[i]!=' '){
                s += chars[i];

            }else if(chars[i]==' '||chars[i]==chars[chars.length-1]){
                list.add(Long.parseLong(s));
                s = "";
            }
        }
        s = list.toString();
        s = s.substring(1,s.length()-1);
        chars = s.toCharArray();
        s = "";
        for(int i = 0;i < chars.length;i++){
            if(chars[i]!=','){
                s+=chars[i];
            }
        }
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        String[] strings = s.split(" ");
        List<String> stringList = new ArrayList<>(Arrays.asList(strings));

        stringList = stringList.stream().sorted(stringComparator).toList();
        Long[] integers = new Long[stringList.size()];
        for(int i = 0;i < stringList.size();i++){
            integers[i] = Long.parseLong(stringList.get(i));
        }

        list.clear();
        list.addAll(Arrays.asList(integers));




        for(int i = 0;i < list.size();i++){

            q = list.get(i);
            while (q>0){
                long t = q%10;
                q = q/10;
                res+=t;
                if(q<=0){
                    list2.add((long) res);
                    res = 0;
                }
            }

        }
        Comparator<Long> comparator = new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                if(o1>o2){
                    return 1;
                }else if(o1<o2){
                    return -1;
                }else{
                    return 0;
                }
            }
        };
        ArrayList<Long> list3 = new ArrayList<>();
        list3.addAll(list2);
        list2 = list2.stream().sorted(comparator).toList();

        Long[] arr = new Long[list.size()];
        Long[] arr2 = new Long[list3.size()];
        Long[] arr3 = new Long[list3.size()];
        Long[] finalArr = new Long[list3.size()];

        for(int i = 0;i < list3.size();i++){
            arr[i] = Long.valueOf(i);
            arr2[i] = list2.get(i);
            arr3[i] = Long.valueOf(list3.get(i));
            finalArr[i] = list.get(i);
        }

        for(int i = 0;i < arr3.length;i++){
            for(int j = 0;j < arr3.length;j++){
                if(arr2[i].equals(arr3[j])){
                    finalList.add((long) j);
                    arr3[j]=-1l;

                }
            }
        }
        for(int i = 0;i < arr.length;i++){

        }

        for(int i = 0;i < finalList.size();i++){
            finalList2.add(list.get(Math.toIntExact(finalList.get(i))));
        }
        String str1 = finalList2.toString();
        str1 = str1.substring(1,str1.length()-1);
        s = "";
        chars = str1.toCharArray();
        for(int i = 0;i < chars.length;i++){
            if(chars[i]!=','){
                s+=chars[i];
            }
        }

        return s;

    }

    public static void main(String[] args) {
        System.out.println(orderWeight(""));
    }

}
