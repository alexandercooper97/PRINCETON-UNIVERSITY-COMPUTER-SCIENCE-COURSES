/* *****************************************************************************
 *  Name             : Alexander Cooper
 *  Date             : January 27, 2025
 **************************************************************************** */
public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0, y = 0, steps = 0;
        
        System.out.println("(0, 0)");
        while (Math.abs(x) + Math.abs(y) < r) {
            double rand = Math.random();
            if (rand < 0.25) y++;
            else if (rand < 0.5) y--;
            else if (rand < 0.75) x++;
            else x--;
            
            System.out.println("(" + x + ", " + y + ")");
            steps++;
        }
        System.out.println("steps = " + steps);
    }
}