package day36_Inheritance.planetTask;

public class Planet {
    public String name;
    public double mass;
    public double radius;
    public double surfaceGravity;
    public double surfaceArea;
    public double volume;
    public double population;

    public void setInfo(String name, double mass, double radius, double surfaceGravity, double surfaceArea, double volume, double population) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = surfaceGravity;
        this.surfaceArea = surfaceArea;
        this.volume = volume;
        this.population = population;
    }

    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", radius=" + radius +
                ", surfaceGravity=" + surfaceGravity +
                ", surfaceArea=" + surfaceArea +
                ", volume=" + volume +
                ", population=" + population +
                '}';
    }
}
