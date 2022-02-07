package de.codebella.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoopsTest {
    @Test
    void zeroShouldBeOne(){
        assertEquals(1, Loops.factorial(0));
    }
    @Test
    void oneShouldBeOne(){
        assertEquals(1, Loops.factorial(1));
    }
    @Test
    void twoShouldBeTwo(){
        assertEquals(2, Loops.factorial(2));
    }
    @Test
    void threeShouldBeSix(){
        assertEquals(6, Loops.factorial(3));
    }
    @Test
    void twelveShouldBe479001600(){
        assertEquals(479001600, Loops.factorial(12));
    }
}