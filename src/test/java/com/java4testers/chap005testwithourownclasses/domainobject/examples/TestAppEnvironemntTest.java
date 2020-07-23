package com.java4testers.chap005testwithourownclasses.domainobject.examples;

import com.java4testers.domainobject.TestAppEnv;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestAppEnvironemntTest {
    @Test
    public void canGetUrlStatically(){
        assertEquals("Returns Hard Coded URL", "http://192.123.0.3:67", TestAppEnv.getURL());
    }

    @Test
    public void canGetDomainAndPortStatically(){
        assertEquals("Just the Domain", "192.123.0.3", TestAppEnv.DOMAIN);
        assertEquals("Just the port", "67", TestAppEnv.PORT);
    }
}
