package com.example.javaproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SortArrayExampleTests {

    private SortArrayExample unitUnderTest;

    @BeforeEach
    void setup() {
        unitUnderTest = new SortArrayExample();
    }

    @Test
    void testGetArraySortedByMyBool() {
        MyPOJO[] actual = unitUnderTest.getArraySortedByMyBool();
        
        assertEquals(actual[0].toString(), new MyPOJO(9, "a", true).toString());
        assertEquals(actual[1].toString(), new MyPOJO(3, "d", true).toString());
        assertEquals(actual[2].toString(), new MyPOJO(6, "b", false).toString());
        assertEquals(actual[3].toString(), new MyPOJO(2, "c", false).toString());
    }

    @Test
    void testGetArraySortedByMyInt() {
        MyPOJO[] actual = unitUnderTest.getArraySortedByMyInt();
        
        assertEquals(actual[0].toString(), new MyPOJO(2, "c", false).toString());
        assertEquals(actual[1].toString(), new MyPOJO(3, "d", true).toString());
        assertEquals(actual[2].toString(), new MyPOJO(6, "b", false).toString());
        assertEquals(actual[3].toString(), new MyPOJO(9, "a", true).toString());
    }

    @Test
    void testGetArraySortedByMyString() {
        MyPOJO[] actual = unitUnderTest.getArraySortedByMyString();
        
        assertEquals(actual[0].toString(), new MyPOJO(9, "a", true).toString());
        assertEquals(actual[1].toString(), new MyPOJO(6, "b", false).toString());
        assertEquals(actual[2].toString(), new MyPOJO(2, "c", false).toString());
        assertEquals(actual[3].toString(), new MyPOJO(3, "d", true).toString());
    }
}
