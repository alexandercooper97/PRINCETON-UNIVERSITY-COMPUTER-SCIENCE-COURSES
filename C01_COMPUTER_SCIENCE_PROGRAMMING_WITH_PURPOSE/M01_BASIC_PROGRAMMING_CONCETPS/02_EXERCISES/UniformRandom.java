/* *****************************************************************************
 *  Name             : Alexander Cooper
 *  Coursera User ID : c7964f1065c5bb86cdfe4fea01f0cbca
 *  Date             : January 26, 2025
 **************************************************************************** */

public class UniformRandom {
    public static void main(String[] args) {

        // Generate five numbers between 0 and 1
        double num1 = Math.random();
        double num2 = Math.random();
        double num3 = Math.random();
        double num4 = Math.random();
        double num5 = Math.random();

        double average = (num1 + num2 + num3 + num4 + num5)/ 5.0;

        // Calculate their minimun and maximun 
        double min1 = Math.min(num1, num2);
        double min2 = Math.min(num3, num4);
        double min3 = Math.min(min1, min2);
        double minimun = Math.min(min3, num5);

        double max1 = Math.max(num1, num2);
        double max2 = Math.max(num3, num4);
        double max3 = Math.max(max1, max2);
        double maximun = Math.max(max3, num5);

        System.out.println("Random numbers : " + num1 + ", " + num2
        + ", " + num3 + ", " + num4 + ", " + num5);

        System.out.println("Average : " + average);
        System.out.println("Minimun : " + minimun);
        System.out.println("Maximun : " + maximun);
    }
}
