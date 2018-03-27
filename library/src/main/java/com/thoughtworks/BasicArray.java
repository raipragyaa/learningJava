package com.thoughtworks;

import java.util.ArrayList;

public class BasicArray {
    public ArrayList<Integer> selectOdd(ArrayList<Integer> array) {
       ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 != 0) {
                result.add(array.get(i));
            }
        }
        return result;
    }

    public ArrayList<Integer> selectEven(ArrayList<Integer> array) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (Integer number :array)
            if (number % 2 == 0) {
                result.add(number);
            }
        return result;
    }

    public int sumOf(ArrayList<Integer> array) {
        int sum = 0;
        for (Integer number :array ){
            sum += number;
        }
        return  sum;
    }

    public ArrayList<Integer> mapLength(ArrayList<String> names) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (String name :names) {
            result.add(name.length());
        }
        return result;
    }
}
