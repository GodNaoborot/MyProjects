package JavaPatterns.Singleton;

public class Workers {

    private Storage storage;
    public Workers(){
        storage = Storage.getInstance();

    }
    public void work(String item){
        storage.addItem(item);

    }

    public Storage getStorage(){
        return storage;
    }


}
