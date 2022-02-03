package de.codebella.day3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class task7TestMultiply {
    @Test
    void twoPositives(){
        //given
        var value1 = 7;
        var value2 = 2;

        // when
        int result = task7.multiply(value1, value2);

        // then
        Assertions.assertEquals(14, result);
    }

    @Test
    void twoNegatives(){
        //given
        var value1 = -8;
        var value2 = -5;

        // when
        int result = task7.multiply(value1, value2);

        // then
        Assertions.assertEquals(40, result);
    }

    @Test
    void onePositiveOneNegative(){
        //given
        var value1 = 4;
        var value2 = -5;

        // when
        int result = task7.multiply(value1, value2);

        // then
        Assertions.assertEquals(-20, result);
    }

    @Test
    void withZero(){
        //given
        var value1 = 0;
        var value2 = -5;

        // when
        int result = task7.multiply(value1, value2);

        // then
        Assertions.assertEquals(0, result);
    }
}