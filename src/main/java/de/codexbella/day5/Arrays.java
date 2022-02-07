package de.codebella.day5;

public class Arrays {
    public static String[] makeStudentArray(int numberOfStudents){
        if (numberOfStudents < 1) {
            return new String[] {"Error"};
        }
        String[] studentArray = new String[numberOfStudents];
        for (int i = 0; i< numberOfStudents; i++) {
            studentArray[i] = "Student " + (i+1);
        }
        return studentArray;
    }
}
