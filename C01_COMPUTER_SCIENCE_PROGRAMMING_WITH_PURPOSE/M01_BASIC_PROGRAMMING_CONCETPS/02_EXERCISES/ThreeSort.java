/* *****************************************************************************
 *  Name             : Alexander Cooper
 *  Coursera User ID : c7964f1065c5bb86cdfe4fea01f0cbca
 *  Date             : January 26, 2025
 **************************************************************************** */

public class ThreeSort {
    public static void main(String[] args){

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int minimun = Math.min(a, Math.min(b, c));
        int maximun = Math.max(a, Math.max(b, c));
        int middle  = (a + b + c) - (minimun + maximun);

        System.out.println(minimun + " " + middle + " " + maximun);
    }
    
}
