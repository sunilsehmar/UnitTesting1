package com.sparta.ss;

public class Greeter {
    static String getGreeting(int timeOfDay) {

        String message;

        if (timeOfDay >= 5 && timeOfDay <= 12){
            message = "Good Morning";
        } else if (timeOfDay >= 12 && timeOfDay <= 18){
            message = "Good Aftermoon";
        } else {
            message = "Good Evening";
        }
        return message;
    }
}
