package math;

/**
 * Created by rrt on 7/30/2016.
 */
public class FibonacciNumbers {

    public static void main(String[] args) {
        int next = 0;
        int prev = 1;
        for(int i=0; i<100; i++){
            System.out.println(next);
            next = next + prev;
            prev = next - prev;
        }
    }
}
