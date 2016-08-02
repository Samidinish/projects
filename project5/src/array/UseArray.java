package array;

import java.util.Scanner;

/**
 * Created by rrt on 7/30/2016.
 */
public class UseArray {
    public static void main(String[] args) {
        int limit = 3;
        int [] array = new int[limit];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter some Integer Value: ");
        for(int j=0; j<array.length; j++){
            array[j] = sc.nextInt();
        }
        System.out.println(array.length);
        System.out.println("Retrieve the data from the array: ");
        for(int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
