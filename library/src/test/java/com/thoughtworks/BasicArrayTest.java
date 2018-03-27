package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BasicArrayTest {

    private BasicArray basicArray;

    @Before
    public void setUp(){
        basicArray = new BasicArray();
    }

    @Test
    public void checkSelectOdd(){
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 3, 5));
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1,3,5));
            assertThat(basicArray.selectOdd(input),is(expected));
    }

    @Test
    public void checkSelectEven() {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 3, 5,6));
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(2,4,6));
        assertThat(basicArray.selectEven(input),is(expected));
    }

    @Test
    public void checkSum() {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 3, 5,6));
        int expected = 21;
        assertThat(basicArray.sumOf(input),is(expected));

    }

    @Test
    public void checkMapLength() {
        ArrayList<String> input = new ArrayList<String>(Arrays.asList("pragya","veera","debu"));
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(6,5,4));
        assertThat(basicArray.mapLength(input),is(expected));

    }
}
