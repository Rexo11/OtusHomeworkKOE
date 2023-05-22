package hw3_collections;

import java.util.*;

// Создаём класс переменного типа
public class Box<T extends Fruit> {
    private T obj;
    public List<T> box;

    public Box(List<T> box) {
        this.box = box;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public List<T> getBox() {
        return box;
    }

    public void setBox(List<T> box) {
        this.box = box;
    }

    public void add(T fruit) {
        this.box.add(fruit);
    }

    public int weight(){
        int weight = 0;
        for (T i : this.box){
            weight += i.getWeight() * i.getQount();
        }
        return weight;
    }

    public boolean compare(Box boxToCompare){
        return this.weight() == boxToCompare.weight();
    }

    public void clear(){
        this.box.clear();
    }

    /* public void transfer(Box boxFrom){
        for (Object i : boxFrom.box){
            this.box.add((T) i);
        }
        boxFrom.box.clear();
    }*/

    public void transfer(Box<T> boxFrom){
        this.box.addAll(boxFrom.box);
        boxFrom.clear();
    }
}