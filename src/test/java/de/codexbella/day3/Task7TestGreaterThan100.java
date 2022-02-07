package de.codexbella.day3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class task7TestGreaterThan100 {
    @Test
    void shouldBeTrue(){
        //given
        var testValue = 110;

        // when
        boolean result = task7.greaterThan100(testValue);

        // then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldBeFalse(){
        //given
        var testValue = 7;

        // when
        boolean result = task7.greaterThan100(testValue);

        // then
        Assertions.assertFalse(result);
    }

    @Test
    void shouldAlsoBeFalse(){
        //given
        var testValue = 100;

        // when
        boolean result = task7.greaterThan100(testValue);

        // then
        Assertions.assertFalse(result);
    }
}