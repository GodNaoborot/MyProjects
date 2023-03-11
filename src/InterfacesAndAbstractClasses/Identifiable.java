package InterfacesAndAbstractClasses;

public interface Identifiable {

    Long getId();

    void setId(long id);

    default boolean equalTo(Identifiable identifiable){
        return this.getClass().equals(identifiable.getClass())&&
                getId().equals(identifiable.getId());
    }




}
