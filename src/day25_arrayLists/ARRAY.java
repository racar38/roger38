package day25_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class ARRAY {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<Character>();


        for (char i = 'a'; i <= 'e'; i++) {

            list.clear();

            list.add(i);

        }

        System.out.println(list);
    }
}
