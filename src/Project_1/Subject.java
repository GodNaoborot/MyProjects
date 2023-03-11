package Project_1;

public class Subject {

    private String name;

    private Material material;

    private double volume;

    public Subject() {
    }

    public Subject(String name, Material material, double volume) {
        this.name = name;
        this.material = material;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getVolume() {
        return (int)volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getMass(){
        return (int) (material.getDensity()*volume);
    }

    @Override
    public String toString() {
        return name+";  "
                +material+"; "
                +volume;
    }
}
