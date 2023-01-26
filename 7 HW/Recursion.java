/**
 * This class contains recursion methods that can be used to solve some puzzles.
 * @author hchoi395
 * @version 11.0.13
 */
public class Recursion {
    /**
     * mergeSort method that takes in a String array and returns it in ascending lexicographical order.
     * @param input String array parameter that is entered.
     * @return returns a String array that is in ascending lexicographical order.
     */
    public static String[] mergeSort(String[] input) {
        if (input.length <= 1) {
            return input;
        } else {
            int middle = input.length / 2;
            String[] leftArray = RecursionUtils.copyOfRange(input, 0, middle);
            String[] rightArray = RecursionUtils.copyOfRange(input, middle, input.length);
            int i = 0;
            int j = 0;
            for (; i < input.length; i++) {
                if (i < middle) {
                    leftArray[i] = input[i];
                } else {
                    rightArray[j] = input[i];
                    j++;
                }
            }
            leftArray = mergeSort(leftArray);
            rightArray = mergeSort(rightArray);
            return RecursionUtils.merge(leftArray, rightArray);
        }
    }
    /**
     * mergeAll method that takes in a jagged array and combines it into one output.
     * @param input jagged array parameter that is entered.
     * @return returns a String array with the combined lexicographicall ascending order.
     */
    public static String[] mergeAll(String[][] input) {
        if (input.length <= 1) {
            return input[0];
        } else {
            String[][] copy = new String[input.length - 1][];
            copy[0] = RecursionUtils.merge(input[0], input[1]);
            for (int i = 1; i < copy.length; i++) {
                copy[i] = input[i + 1];
            }
            return mergeAll(copy);
        }
    }
    /**
     * countDuplicates method that counts how many duplicates there exists.
     * @param input String array parameter that is entered.
     * @return returns the int amount of duplicates.
     */
    public static int countDuplicates(String[] input) {
        if (input.length <= 1) {
            return 0;
        } else {
            String[] copy = new String[input.length - 1];
            for (int i = 0; i < copy.length; i++) {
                copy[i] = input[i];
            }
            if (input[copy.length].equals(input[copy.length - 1])) {
                return 1 + countDuplicates(copy);
            } else {
                return 0 + countDuplicates(copy);
            }
        }
    }
    /**
     * verifyPalindrome method that takes in a String and tells if it is a palindrome.
     * @param input String input that is being checked.
     * @return returns true or false boolean.
     */
    public static boolean verifyPalindrome(String input) {
        if (input == null) {
            return false;
        }
        if (input.length() <= 1) {
            return true;
        }
        if (Character.toLowerCase(input.charAt(0)) == Character.toLowerCase(input.charAt(input.length() - 1))) {
            return verifyPalindrome(input.substring(1, input.length() - 1));
        }
        return false;
    }
    /**
     * numInteriorPoints method that takes in a Point array and returns the number
     * if elements that fits in the int radius.
     * @param p Point array parameter that is entered.
     * @param in int parameter that is the radius.
     * @return returns the number of elements that fit in the radius.
     */
    public static int numInteriorPoints(Point[] p, int in) {
        if (p.length < 1) {
            return 0;
        } else {
            Point[] copy = new Point[p.length - 1];
            for (int i = 0; i < copy.length; i++) {
                copy[i] = p[i];
            }
            if (Math.sqrt((p[copy.length].getX() * p[copy.length].getX())
                + (p[copy.length].getY() * p[copy.length].getY())) <= in) {
                return 1 + numInteriorPoints(copy, in);
            } else {
                return 0 + numInteriorPoints(copy, in);
            }
        }
    }
    /**
     * Main method that runs the other methods.
     * @param args args parameter.
     */
    public static void main(String[] args) {
        String[] array = {"Zama", "Adam", "Zaam", "Bob", "Chad", "Brian", "Aaron"};
        String[] sorted = mergeSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(sorted[i]);
        }
        String[][] z = new String[3][];
        z[0] = new String[]{"Alex", "Brian"};
        z[1] = new String[]{"Aaron", "Dylan"};
        z[2] = new String[]{"Chris", "Fred", "Zeke"};
        String[] f = mergeAll(z);
        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i]);
        }
        String[] a = {"A", "A", "B", "C", "C"};
        int s = countDuplicates(a);
        System.out.println(s);
        String b = "nooon";
        System.out.println(verifyPalindrome(b));
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 1);
        Point p3 = new Point(2, 1);
        Point p4 = new Point(3, 20);
        Point[] p = {p1, p2, p3, p4};
        System.out.println(numInteriorPoints(p, 10));
    }
}
