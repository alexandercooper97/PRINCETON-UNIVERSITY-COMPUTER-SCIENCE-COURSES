public class PowerOfTwo {
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);

        int i = 0;
        long v = 1; 
        while(i <= n) {
            System.out.println(v);
            i = i + 1;
            v = 2 * v;
        }
    }
}