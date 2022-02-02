public class Task3 {
    public static void main(String[] args) {
        var longNumber = 3.37289647838929;
        var decimalPlaces = 2;
        var shortNumber = (Math.round(longNumber*Math.pow(10, decimalPlaces))) / Math.pow(10, decimalPlaces);
        System.out.println(shortNumber);

        //System.out.println(String.format("%.2f", longNumber));
        //System.out.printf("%.2f", longNumber);
        //System.out.format("\ndouble : %.2f", longNumber);
        }
}