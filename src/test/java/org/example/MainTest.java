package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void SumTest(){
        Main main = new Main();
        assertEquals(10, main.Sum(5,5));
    }

    @Test
    public void DifferenceTest(){
        Main main = new Main();
        assertEquals(5, main.Difference(10,5));
    }
}
