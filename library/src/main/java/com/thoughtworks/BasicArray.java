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
}
