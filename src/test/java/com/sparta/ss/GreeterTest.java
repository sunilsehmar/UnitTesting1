package com.sparta.ss;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreeterTest {

    // all tests are public
    // a test for GIT
    @Test
    @DisplayName("This is a Test")
    void firstTest() {
        Assertions.assertEquals(1, 1);
    }

    @Test
    @DisplayName("Given time is 21, return Good Evening")
    void giveTheTimeIs21ReturnGoodEvening(){
        Assertions.assertEquals("Good Evening", Greeter.getGreeting(21));
    }

}
