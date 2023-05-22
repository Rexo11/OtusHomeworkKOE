package hw3_collections;

public class Apple extends Fruit {
    static String name = "Apple";
    int weight;
    int qount;

    public int getQount() {
        return qount;
    }

    public void setQount(int qount) {
        this.qount = qount;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Apple(int qount, int weight) {
        this.qount = qount;
        this.weight = weight;
    }
}
