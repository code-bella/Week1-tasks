public class Task4 {
    public static void main(String[] args) {
        var value1 = 6;
        var value2 = 5;
        boolean testGreaterThan = value1 > value2;

        System.out.println("Is " + value1 + " greater than " + value2 + "? " + testGreaterThan);

        var word1 = "toodeloo";
        var word2 = "toodeloo";
        //boolean equalOrNot = word1 == word2;
        boolean equalOrNot = word1.equals(word2);

        System.out.println("Is \"" + word1 + "\" equal to \"" + word2 + "\"? " + equalOrNot);
    }
}