package de.codebella.day3;

public class Task6 {
    private static void LongAndFancyString(String test) {
        var resultLength = test.length() > 20;
        var resultFancy = test.contains("fancy");
        System.out.println("Length is greater than 20: " + resultLength);
        System.out.println("And \"fancy\" is part of the String: " + resultFancy);
    }

    public static void main(String[] args) {
        LongAndFancyString("you are so fancy");
    }
}