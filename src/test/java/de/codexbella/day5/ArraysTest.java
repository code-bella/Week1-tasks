package de.codexbella.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {

    @Test
    void shouldBeEqual2(){
        assertArrayEquals(new String[] {"Student 1", "Student 2"}, Arrays.makeStudentArray(2));
    }

    @Test
    void shouldBeEqual1(){
        assertArrayEquals(new String[] {"Student 1"}, Arrays.makeStudentArray(1));
    }

    @Test
    void shouldBeEqualLength(){
        assertEquals(27, Arrays.makeStudentArray(27).length);
    }

    @Test
    void zeroShouldGiveError(){
        String[] errorArray = {"Error"};
        assertArrayEquals(errorArray, Arrays.makeStudentArray(0));
    }

    @Test
    void negativeShouldGiveError(){
        String[] errorArray = {"Error"};
        assertArrayEquals(errorArray, Arrays.makeStudentArray(-1));
    }
}