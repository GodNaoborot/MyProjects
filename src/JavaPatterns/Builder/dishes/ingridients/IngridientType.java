package JavaPatterns.Builder.dishes.ingridients;

public enum IngridientType {
    BEAN(1,"Фасоль"),
    SALAD(2,"Салат"),
    BEEF(3,"Говядина"),
    OLIVES(4,"Оливки"),
    MOZARELLA(5,"Моцарелла"),
    CUCUMBER(6,"Огурец"),
    TOMATO(7,"Помидор"),
    POTATO(8,"Картофель");



    private final String ruName;

    private final int id;

    IngridientType(int id,String ruName) {
        this.ruName = ruName;
        this.id = id;
    }

    public String getRuName() {
        return ruName;
    }

    public int getId() {
        return id;
    }

    public static IngridientType getById(int id){
        return IngridientType.values()[id-1];
    }
}
