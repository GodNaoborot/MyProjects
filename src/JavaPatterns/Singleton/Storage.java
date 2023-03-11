package JavaPatterns.Singleton;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private List<String> items;
    private static Storage instance;

    private Storage(){
        items = new ArrayList<>();

    }

    public static Storage getInstance(){
        synchronized (Storage.class){
            if(instance == null){
                System.out.println("New Instance");
                instance = new Storage();

            }
            return instance;
        }

    }

    public synchronized List<String> getItems(){
        return items;

    }

    public synchronized void addItem(String item){
        items.add(item);
    }
}
