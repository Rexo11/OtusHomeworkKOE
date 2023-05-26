package hw3_collections;

import java.util.*;

// Создаём класс переменного типа
public class Box<T extends Fruit> {
    private List<T> box;

    public Box(List<T> box) {
        this.box = box;
    }

    public List<T> getBox() {
        return box;
    }

    public void setBox(List<T> box) {
        this.box = box;
    }

    public void add(T fruit) {
        box.add(fruit);
    }

    public int weight(){
        int weight = 0;
        for (T i : box){
            weight += i.getWeight();
        }
        return weight;
    }

    public boolean compare(Box boxToCompare){
        return this.weight() == boxToCompare.weight();
    }

    public void clear(){
        box.clear();
    }

    /* public void transfer(Box boxFrom){
        for (Object i : boxFrom.box){
            this.box.add((T) i);
        }
        boxFrom.box.clear();
    }*/

    public void transfer(Box<T> boxFrom){
        if (boxFrom == this) {
            System.out.println("Нельзя вложить коробку саму в себя");
        } else {
            box.addAll(boxFrom.box);
            boxFrom.clear();
        }
    }
}