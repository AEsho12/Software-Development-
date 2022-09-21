package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;

public class RegistrationHelperTest {

    @Before
    public void setUp() throws Exception {
        new RegistrationHelper();
    }

    @org.junit.Test
    public void testConstructor() {

        new RegistrationHelper();
    }


    @org.junit.Test
    public void testCheckUsernamePassword() {
        assertFalse((new RegistrationHelper()).checkUsernamePassword("janedoe", "password"));
        assertFalse((new RegistrationHelper()).checkUsernamePassword(null, "password"));
        assertFalse((new RegistrationHelper()).checkUsernamePassword("201499108", "password"));
        assertFalse((new RegistrationHelper()).checkUsernamePassword("janedoe", null));

    }

    @org.junit.Test
    public void testCheckUsernamePasswordIsValid() {
        boolean result = new RegistrationHelper().checkUsernamePassword("username", "password");
        Assertions.assertEquals(false, result);
    }

    @After
    public void tearDown() throws Exception {
    }


}

