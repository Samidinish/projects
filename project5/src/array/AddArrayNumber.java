package array;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by rrt on 7/30/2016.
 */
public class AddArrayNumber {
    public static void main(String[] args) {
        int [] array = new int[500];
        Random random = new Random();
        System.out.println("Numbers are storing randomly into the array: ");
        for(int j=0; j<array.length; j++){
            array[j] = random.nextInt(1000);
        }
        int total = 0;
        for(int i=0; i<array.length; i++){
            total = total+array[i];
        }
        System.out.println("Sum of the array: " + total);
    }
}
