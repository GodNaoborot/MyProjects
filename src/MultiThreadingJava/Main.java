package MultiThreadingJava;

public class Main {

    public static void main(String[] args) {

        MyThreads m1 = new MyThreads();

        MyThreads m2 = new MyThreads();

        m1.start();
        m2.start();

    }
}
