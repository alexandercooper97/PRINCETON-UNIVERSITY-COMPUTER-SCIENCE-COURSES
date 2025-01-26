/* *****************************************************************************
 *  Name             : Alexander Cooper
 *  Coursera User ID : c7964f1065c5bb86cdfe4fea01f0cbca
 *  Date             : January 26, 2025
 **************************************************************************** */

public class GreatCircle {
    public static void main(String [] args) {
        
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double r = 6371.0;

        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        double deltaX = (x2 - x1)/2;
        double deltaY = (y2 - y1)/2;

        double a = Math.pow(Math.sin(deltaX), 2) +
               Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin(deltaY), 2);
    
        double distance = 2 * r * Math.asin(Math.sqrt(a));

        System.out.println(distance + " kilometers");
       
    }
}
