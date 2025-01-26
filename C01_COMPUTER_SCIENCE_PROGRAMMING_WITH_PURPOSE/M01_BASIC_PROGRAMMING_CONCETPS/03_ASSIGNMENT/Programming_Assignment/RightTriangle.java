/* *****************************************************************************
 *  Name             : Alexander Cooper
 *  Coursera User ID : c7964f1065c5bb86cdfe4fea01f0cbca
 *  Date             : January 26, 2025
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // Check if all integers are positive
        boolean arePositive = (a > 0) && (b > 0) && (c > 0);

        // Check if they satisfy the Pythagorean theorem
        int max = Math.max(a, Math.max(b, c));
        int sumOfSquares = a * a + b * b + c * c - max * max;
        boolean isRightTriangle = (max * max == sumOfSquares);

        // Determine if both conditions are satisfied
        boolean result = arePositive && isRightTriangle;

        System.out.println(result);
    }
}
