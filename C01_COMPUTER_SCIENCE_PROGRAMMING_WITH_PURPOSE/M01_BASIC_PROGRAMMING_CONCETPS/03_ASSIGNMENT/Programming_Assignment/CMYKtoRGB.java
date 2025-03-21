/* *****************************************************************************
 *  Name             : Alexander Cooper
 *  Coursera User ID : c7964f1065c5bb86cdfe4fea01f0cbca
 *  Date             : January 26, 2025
 **************************************************************************** */
public class CMYKtoRGB {
    public static void main(String[] args) {

        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);
            
        // Calculate white, red, green and blue 
        double white = 1 - black;
        int red = (int) Math.round(255 * white * (1 - cyan));
        int green = (int) Math.round(255 * white * (1 - magenta));
        int blue = (int) Math.round(255 * white * (1 - yellow));

        System.out.println("red   = " + red);
        System.out.println("green = " + green);
        System.out.println("blue  = " + blue);

    }
}