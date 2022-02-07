package de.codebella.day4;

public class Loops {
    public static int factorial(int number){
        int result = 1;
        /*
        for (int i=0; i<number; i++) {
            result = result * (i+1);
        }
        */

        int i = 0;
        while(i < number) {
            result *= i+1;
            i++;
        }

        return result;
    }
}
