package de.codebella.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionalsTest {
    @Test
    void shouldBeOkBecauseZeroPeoplePlusRed(){
        assertEquals("Alles cool.", Conditionals.shopCoronaAlarm(0, "rot"));
    }

    @Test
    void shouldBeOkBecauseZeroPeoplePlusYellow(){
        assertEquals("Alles cool.", Conditionals.shopCoronaAlarm(0, "gelb"));
    }

    @Test
    void shouldBeOkBecauseZeroPeoplePlusGreen(){
        assertEquals("Alles cool.", Conditionals.shopCoronaAlarm(0, "gruen"));
    }

    @Test
    void shouldBeOkBecauseExactly30PeopleAndYellow(){
        assertEquals("Alles cool.", Conditionals.shopCoronaAlarm(30, "gelb"));
    }

    @Test
    void shouldBeOkBecauseGreen(){
        assertEquals("Alles cool.", Conditionals.shopCoronaAlarm(31, "gruen"));
    }

    @Test
    void shouldNotBeOkBecauseMoreThanZeroPeoplePlusRed(){
        assertEquals("Alarm! -- Alarm!", Conditionals.shopCoronaAlarm(1, "rot"));
    }

    @Test
    void shouldNotBeOkBecauseMoreThan30People(){
        assertEquals("Alarm! -- Alarm!", Conditionals.shopCoronaAlarm(31, "gelb"));
    }

    @Test
    void shouldBeWrongInputAtRed(){
        assertEquals("Fehler in der Eingabe.", Conditionals.shopCoronaAlarm(-1, "rot"));
    }

    @Test
    void shouldBeWrongInputAtYellow(){
        assertEquals("Fehler in der Eingabe.", Conditionals.shopCoronaAlarm(-1, "gelb"));
    }

    @Test
    void shouldBeWrongInputAtGreen(){
        assertEquals("Fehler in der Eingabe.", Conditionals.shopCoronaAlarm(-1, "gruen"));
    }

    @Test
    void shouldBeWrongInputOfAlertLevel(){
        assertEquals("Fehler in der Eingabe.", Conditionals.shopCoronaAlarm(3, "tuedelue"));
    }
}