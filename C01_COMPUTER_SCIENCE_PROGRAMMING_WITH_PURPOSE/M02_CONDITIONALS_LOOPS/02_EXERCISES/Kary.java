/* *****************************************************************************
 *  Name             : Alexander Cooper
 *  Date             : February 07, 2025
 *  Lesson           : Conditionals and Loops
 *  Exercise         : 1.3.21 - Version 1
 **************************************************************************** */
public class Kary {
    public static void main(String[] args) {
        long i = Long.parseLong(args[0]);
        int k = Integer.parseInt(args[1]);
        
        if (k < 2 || k > 16) {
            System.out.println("The base must be between 2 and 16.");
            return;
        }
        
        String result = "";
        while (i > 0) {
            long residue = i % k;
            char digit;
            if (residue < 10) {
                digit = (char) ('0' + residue);
            } else {
                digit = (char) ('A' + (residue - 10));
            }
            result = digit + result;
            i = i / k;
        }
        
        System.out.println(result);
    }
}

