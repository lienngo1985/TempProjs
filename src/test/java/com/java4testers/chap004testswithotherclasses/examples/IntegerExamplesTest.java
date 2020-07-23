package com.java4testers.chap004testswithotherclasses.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {
    @Test
    public void integerExploration(){
        Integer four = new Integer("4");
        assertEquals("intValue returns int 4", 4, four.intValue());
    }

    @Test
    public void integerToHexString(){
        Integer eleven = 11;
        Integer ten = 10;
        Integer three = 3;
        Integer twentyone = 21;
        assertEquals("Convert integer 11 to Hex string", "b", eleven.toHexString(eleven));
        assertEquals("Convert integer 11 to Hex string", "a", ten.toHexString(ten));
        assertEquals("Convert integer 11 to Hex string", "3", three.toHexString(three));
        assertEquals("Convert integer 11 to Hex string", "15", twentyone.toHexString(twentyone));
    }

    @Test
    public void getMinMaxIntValue(){
        assertEquals ("Check Integer Min Value",-2147483648, Integer.MIN_VALUE);
        assertEquals ("Check Integer Max Value", 2147483647, Integer.MAX_VALUE);
    }
}
