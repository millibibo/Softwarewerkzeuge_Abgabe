package com.example.semesteraufgabe;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @ParameterizedTest
    @ValueSource(strings = {"Para 1", "Para 2", "Para 3"})
    public void evalStrings(String wert){
        assertTrue(wert.contains("Para"));
    }

}