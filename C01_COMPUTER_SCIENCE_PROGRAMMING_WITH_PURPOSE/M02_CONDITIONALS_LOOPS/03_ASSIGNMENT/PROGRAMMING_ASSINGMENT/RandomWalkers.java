/* *****************************************************************************
 *  Name             : Alexander Cooper
 *  Date             : January 27, 2025
 **************************************************************************** */
public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int totalSteps = 0;
        
        for (int t = 0; t < trials; t++) {
            int x = 0, y = 0, steps = 0;
            while (Math.abs(x) + Math.abs(y) < r) {
                double rand = Math.random();
                if (rand < 0.25) y++;
                else if (rand < 0.5) y--;
                else if (rand < 0.75) x++;
                else x--;
                steps++;
            }
            totalSteps += steps;
        }
        System.out.println("average number of steps = " + (double) totalSteps / trials);
    }
}
