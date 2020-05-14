package Lab2.model;

public class Cylinder {
    private Wood wood;
    private float radiys;
    private float height;

    public Cylinder(Wood wood, float radiys, float height) {
        this.wood = wood;
        this.radiys = radiys;
        this.height = height;
    }

    public Wood getWood() {
        return wood;
    }

    public float getRadiys() {
        return radiys;
    }

    public float getHeight() {
        return height;
    }

    public float volume() {
        return (float) (height*Math.pow(radiys,2)*Math.PI);
    }

    public float weight() {
        return wood.getDensity() * volume();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "wood=" + wood +
                ", volume=" + volume() +
                ", weight=" + weight() +
                '}';
    }
}
