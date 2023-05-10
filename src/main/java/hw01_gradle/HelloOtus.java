package hw01_gradle;

import java.util.ArrayList;

public class HelloOtus {
    public static void main(String[] args) {

        ArrayList<String> testList = new ArrayList<>();

        testList.add("1");
        testList.add("2");
        testList.add("3");

        System.out.println(com.google.common.collect.Lists.reverse(testList));
        System.out.println("Hello world!");
    }
}
