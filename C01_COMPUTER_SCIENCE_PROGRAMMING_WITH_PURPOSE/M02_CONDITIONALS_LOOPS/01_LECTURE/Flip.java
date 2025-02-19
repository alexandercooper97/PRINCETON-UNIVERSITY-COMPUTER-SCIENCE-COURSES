/* *****************************************************************************
 * PRINCETON UNIVERSITY 
 * School of Engineering and Applied Science 
 * Department of Computer Science 
 * 
 *  Course      : Computer Science Programming with a Purpose
 *  Lesson      : Condtionals 
 *  Module      : 02
 *  Instructor  : Ph.D Robert Sedgewick
 * 
 *  Description : Example of if statement use: simulate a coin flip
 **************************************************************************** */

public class Flip {
    public static void main(String args[]) {
        if (Math.random() < 0.5) {
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }
    }
}
