public class Task5 {
    public static int multiply(int value1, int value2){
        return value1*value2;
    }
    public static void printout(int result){
        System.out.println(result);
    }
    public static void main(String[] args) {
        var a = 2;
        var b = 300;
        boolean test = (a > 100) || (b > 100);
        printout(multiply(a, b));
        System.out.println(test);

        boolean testMitIf;
        if ((a > 100) || (b > 100)) {
            testMitIf = true;
        }
        else {
            testMitIf = false;
        }

        System.out.println(testMitIf);
    }
}