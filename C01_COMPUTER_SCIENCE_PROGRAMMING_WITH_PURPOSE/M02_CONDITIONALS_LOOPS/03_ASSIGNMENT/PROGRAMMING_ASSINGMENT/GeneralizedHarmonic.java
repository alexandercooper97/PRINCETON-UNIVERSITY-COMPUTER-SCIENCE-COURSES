/* *****************************************************************************
 *  Name             : Alexander Cooper
 *  Date             : January 27, 2025
 **************************************************************************** */
public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double sum = 0.0;
        
        for (int k = 1; k <= n; k++) {
            sum += 1.0 / Math.pow(k, r);
        }
        
        System.out.println(sum);
    }
}