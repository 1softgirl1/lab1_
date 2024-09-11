package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {

    @org.junit.jupiter.api.Test
    void sequence() {
        int n = 4;
        List<String> sequence = Main.first_task(n);
        List<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("2");
        expected.add("3");
        expected.add("4");
        assertEquals(expected, sequence);

        n = 5;
        expected.add("fizz");
        assertEquals(expected, Main.first_task(n));
    }


    @Test
    void sequenceNegativeSize() {
        int n = -2;
        List<String> sequence = Main.first_task(n);

        assertNull(sequence);
    }


    @Test
    void second_task() {
        String str = "llatsni ekam";
        assertEquals(str, Main.second_task());
    }

    @Test
    void third_task() {

        List<Double> expected1 = new ArrayList<>();
        expected1.add(-2.0);
        expected1.add(3.0);

        List<Double> expected2 = new ArrayList<>();
        expected2.add(2.5);



        assertEquals(expected1, Main.third_task(1,-1,-6));
        assertEquals(expected2, Main.third_task(4,-20,25));
        assertNull(Main.third_task(5,-1,2));

    }

    @Test
    void fourth_task() {
        double e=0.49999999953635954;
        assertEquals(e, Main.fourth_task());
    }

    @Test
    void fifth_task() {
        String str1="madam", str2= "kfih  uhU", str3= "Ася, молоко около мяса";
        assertTrue(Main.fifth_task(str1));
        assertFalse(Main.fifth_task(str2));
        assertTrue(Main.fifth_task(str3));

    }
}