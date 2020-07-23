package com.java4testers.chap006domainentities.examples;

import com.java4testers.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserTest {
    @Test
    public void canConstructANewUser() {
        User user = new User();
        assertEquals("default username expected", "username", user.getUsername());
        assertEquals("default password expected", "password", user.getPassword());
    }

    @Test
    public void canConstructWithUsernameAndPassword(){
        User user = new User("admin", "pA55w0rD");
        assertEquals("default username expected", "admin", user.getUsername());
        assertEquals("default password expected", "pA55w0rD", user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed(){
        User user = new User();
        user.setPassword("PaZZword6");
        assertEquals("default password expected", "PaZZword6", user.getPassword());
    }

    @Test
    public void incrementDecrementOperatorsExplored(){
        int num = 10;
        assertEquals(11, ++num);
        assertEquals(10, --num);
        assertEquals(10, num++);
        assertEquals(11, num);
        assertEquals(11, num--);
        assertEquals(10, num);
    }

    @Test
    public void bitwiseShiftOperatorsExplored(){
        int x = 56;
        assertEquals(x*2, x<<1);
        assertEquals(x*4, x<<2);
        assertEquals(x*16, x<<4);
        x <<=3;
        assertEquals(56*8, x);
        x = Integer.MAX_VALUE;
        assertEquals(Integer.MAX_VALUE/2, x>>1);
        assertEquals(Integer.MAX_VALUE/4, x>>2);
        assertEquals(Integer.MAX_VALUE/8, x>>3);
        x = Integer.MIN_VALUE; // -ve
        assertEquals((Integer.MAX_VALUE/2)+1, x>>>1);
    }

    //Ternary Example
    @Test
    public void moreTernary(){
        String url = "www.eviltester.com";
        url = url.startsWith("http") ? url : addHttp(url);

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.eviltester.com",url);
    }

    private String addHttp(String url) {
        return "http://" + url;
    }

    @Test
    public void exampleTernary(){
        int numberofCats = 2;
        //String output;
        //output = (numberofCats > 1) ? "cats":"cat";
        assertEquals("Number of cats", "cats", getCats(numberofCats));
    }

    private String getCats(int numberofCats) {
        return (numberofCats > 1) ? "cats" : "cat";
    }

    //SWITCH ... CASE example
    @Test
    public void useSwitchCase(){
        assertEquals("United Kingdom", getShortCode("uk"));
        assertEquals("United States", getShortCode("US"));
        assertEquals("United States", getShortCode("USA"));
        assertEquals("France", getShortCode("FR"));
        assertEquals("Sweden", getShortCode("SE"));
        assertEquals("Rest Of World", getShortCode("VN"));
    }

    private String getShortCode(String code) {
        String country;

        switch(code.toUpperCase()){
            case "UK":
                country = "United Kingdom";
                break;
            case "US":
            case "USA":
                country = "United States";
                break;
            case "FR":
                country = "France";
                break;
            case "SE":
                country = "Sweden";
                break;
            default:
                country = "Rest Of World";
                break;
        }
        return country;
    }
}
