/* *****************************************************************************
 *  Name             : Alexander Cooper
 *  Date             : February 07, 2025
 *  Lesson           : Conditionals and Loops
 *  Exercise         : 1.3.21 - Version 2
 **************************************************************************** */
public class KarySinASCII {
    public static void main(String[] args) {
        long i = Long.parseLong(args[0]); 
        int k = Integer.parseInt(args[1]); 


        if (k < 2 || k > 16) {
            System.out.println("La base debe estar entre 2 y 16.");
            return;
        }

        char[] digits = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'B', 'C', 'D', 'E', 'F'
        };

        String result = ""; 

        while (i > 0) {
            long residue = i % k; 
            char digito = digits[(int) residue]; 
            result = digito + result; 
            i = i / k; 
        }

        System.out.println(result); 
    }
}