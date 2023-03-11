package InterfacesAndAbstractClasses;

import java.util.Objects;

public abstract class NotAPerson {

    long id;

    String name;

    NotAPerson(long id,String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotAPerson that = (NotAPerson) o;
        return id == that.id && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
