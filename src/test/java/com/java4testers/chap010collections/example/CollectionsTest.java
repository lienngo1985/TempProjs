package com.java4testers.chap010collections.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class CollectionsTest {
    @Test
    public void simpleArrayExample(){
        String[] numbers0123 = {"zero", "one", "two", "three"};
        for(String numberText : numbers0123){
            System.out.println(numberText);
        }
        assertEquals("zero", numbers0123[0]);
        assertEquals("three", numbers0123[3]);
    }

    @Test
    public void simpleCollectionsExample(){
        String[] numbers0123A = {"zero", "one", "two", "three"};
        List<String> numbers0123L = Arrays.asList(numbers0123A);
        for(String numberTest : numbers0123L){
            System.out.println(numberTest);
        }
        assertEquals("zero", numbers0123L.get(0));
        assertEquals("three", numbers0123L.get(3));
    }

}

