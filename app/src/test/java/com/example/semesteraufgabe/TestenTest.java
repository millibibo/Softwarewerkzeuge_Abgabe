package com.example.semesteraufgabe;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TestenTest {

    @Test
    void count() {
        assertEquals(3, Testen.count());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Germany", "USA", "Canada"})
    void Country(String string) {
        assertTrue(Testen.country().contains(string));
    }

    @ParameterizedTest
    @EnumSource(Testen.Land.class)
    void getNumber(Testen.Land land){
        int number = land.getLand();
        assertTrue(1<=number && 4>=number );
    }

    @Mock
    private TestClass test;

    @Test
    void animal() {
        Mockito.lenient().when(test.getAnimal()).thenReturn("Blackbird");
        String animalExpected = "Blackbird, black, Germany";
        Testen testen = new Testen();
        String animalMethod = testen.animal(test.getAnimal());
        assertEquals(animalExpected, animalMethod);
    }
}