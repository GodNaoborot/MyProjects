package Generics;

public class Util {

    public static <K,V> boolean compare(Par<K,V> p1, Par<K,V> p2){
        return p1.getKey().equals(p2.getKey())&&p1.getValue().equals(p2.getValue());
    }

    public static void main(String[] args) {
        Par<Integer,String> p1 = new Par<>(1,"apple");

        Par<Integer,String> p2 = new Par<>(2,"banana");

        boolean res = compare(p1,p2);
        System.out.println(res);


    }
}

class Par<K,V>{
    private K key;
    private V value;

    public Par(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}