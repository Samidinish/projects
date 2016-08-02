package math;

/**
 * Created by rrt on 7/30/2016.
 */
public class Pyramid {

    public static void main(String[] args) {
        for(int i=0; i<20; i++){
            for(int j=0; j<20-i; j++){
                System.out.print(" ");
            }
            for(int n=0; n<=i; n++){
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
