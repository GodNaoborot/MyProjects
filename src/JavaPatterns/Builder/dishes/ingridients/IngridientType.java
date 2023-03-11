package JavaPatterns.Builder.dishes.ingridients;

public enum IngridientType {
    BEAN(1,"������"),
    SALAD(2,"�����"),
    BEEF(3,"��������"),
    OLIVES(4,"������"),
    MOZARELLA(5,"���������"),
    CUCUMBER(6,"������"),
    TOMATO(7,"�������"),
    POTATO(8,"���������");



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
