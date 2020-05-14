package Lab2.model;

//Цей клас реалізує сутность «брус».

public class Timber {
    private Wood wood;
    private float length;
    private float width;
    private float height;

    public Timber(Wood wood, float length, float width, float height) {
        this.wood = wood;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Wood getWood() {
        return wood;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float volume() {
        return length * height * width;
    }

    public float weight() {
        return wood.getDensity() * volume();
    }

    @Override
    public String toString() {
        return "Timber{\n" +
                "wood=" + wood +
                "\nweight=" + weight() +
                "\nvolume=" + volume() +
                "\n}";
    }
}
