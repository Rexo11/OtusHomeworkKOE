import hw3_collections.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Box<Orange> orangeBox = new Box<>(new ArrayList<>());
        Box<Apple> appleBox = new Box<>(new ArrayList<>());
        Box<Apple> appleBox2 = new Box<>(new ArrayList<>());

        Orange orange1 = new Orange(100);
        Orange orange2 = new Orange(200);
        Orange orange3 = new Orange(300);

        Apple apple1 = new Apple(100);
        Apple apple2 = new Apple(200);
        Apple apple3 = new Apple(300);
        Apple apple4 = new Apple(400);


        orangeBox.add(orange1);
        orangeBox.add(orange2);
        orangeBox.add(orange3);
        //orangeBox.add(apple1); // Выдаст ошибку о несовпадении типов
        appleBox.add(apple1);
        appleBox.add(apple2);
        appleBox.add(apple3);

        appleBox2.add(apple4);
        // Вычислим вес
        System.out.println("Вес коробки с апельсинами: ");
        System.out.println(orangeBox.weight());

        System.out.println("Вес коробки с яблоками: ");
        System.out.println(appleBox.weight());
        // Сравнение
        System.out.println("Коробки равны по весу? ");
        System.out.println(appleBox.compare(orangeBox));
        // Попытаемся переложить коробку в саму себя
        appleBox2.transfer(appleBox2);
        // Переложим из одной коробки в другую
        appleBox2.transfer(appleBox);
        //appleBox2.transfer(orangeBox); вернёт ошибку о несовпадении типов

        System.out.println("В коробку 2 пересыпали коробку 1: ");
        System.out.println(appleBox2.weight());

        System.out.println("Коробка 1 пуста: ");
        System.out.println(appleBox.weight());

    }
}